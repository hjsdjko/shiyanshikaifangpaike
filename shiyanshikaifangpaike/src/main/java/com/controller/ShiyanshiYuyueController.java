
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 实验室预约
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shiyanshiYuyue")
public class ShiyanshiYuyueController {
    private static final Logger logger = LoggerFactory.getLogger(ShiyanshiYuyueController.class);

    private static final String TABLE_NAME = "shiyanshiYuyue";

    @Autowired
    private ShiyanshiYuyueService shiyanshiYuyueService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表非注册的service
    @Autowired
    private ShiyanshiService shiyanshiService;
    //注册表service
    @Autowired
    private YonghuService yonghuService;
    @Autowired
    private LaoshiService laoshiService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("学生".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("老师".equals(role))
            params.put("laoshiId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = shiyanshiYuyueService.queryPage(params);

        //字典表数据转换
        List<ShiyanshiYuyueView> list =(List<ShiyanshiYuyueView>)page.getList();
        for(ShiyanshiYuyueView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShiyanshiYuyueEntity shiyanshiYuyue = shiyanshiYuyueService.selectById(id);
        if(shiyanshiYuyue !=null){
            //entity转view
            ShiyanshiYuyueView view = new ShiyanshiYuyueView();
            BeanUtils.copyProperties( shiyanshiYuyue , view );//把实体数据重构到view中
            //级联表 实验室
            //级联表
            ShiyanshiEntity shiyanshi = shiyanshiService.selectById(shiyanshiYuyue.getShiyanshiId());
            if(shiyanshi != null){
                BeanUtils.copyProperties( shiyanshi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "laoshiId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
                view.setShiyanshiId(shiyanshi.getId());
            }
            //级联表 老师
            //级联表
            LaoshiEntity laoshi = laoshiService.selectById(shiyanshiYuyue.getLaoshiId());
            if(laoshi != null){
                BeanUtils.copyProperties( laoshi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "laoshiId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
                view.setLaoshiId(laoshi.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShiyanshiYuyueEntity shiyanshiYuyue, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shiyanshiYuyue:{}",this.getClass().getName(),shiyanshiYuyue.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("老师".equals(role))
            shiyanshiYuyue.setLaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ShiyanshiYuyueEntity> queryWrapper = new EntityWrapper<ShiyanshiYuyueEntity>()
            .eq("shiyanshi_id", shiyanshiYuyue.getShiyanshiId())
            .eq("laoshi_id", shiyanshiYuyue.getLaoshiId())
            .eq("shiyanshi_yuyue_name", shiyanshiYuyue.getShiyanshiYuyueName())
            .eq("shiyanshi_yuyue_types", shiyanshiYuyue.getShiyanshiYuyueTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShiyanshiYuyueEntity shiyanshiYuyueEntity = shiyanshiYuyueService.selectOne(queryWrapper);
        if(shiyanshiYuyueEntity==null){
            shiyanshiYuyue.setInsertTime(new Date());
            shiyanshiYuyue.setShiyanshiYuyueYesnoTypes(1);
            shiyanshiYuyue.setCreateTime(new Date());
            shiyanshiYuyueService.insert(shiyanshiYuyue);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShiyanshiYuyueEntity shiyanshiYuyue, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,shiyanshiYuyue:{}",this.getClass().getName(),shiyanshiYuyue.toString());
        ShiyanshiYuyueEntity oldShiyanshiYuyueEntity = shiyanshiYuyueService.selectById(shiyanshiYuyue.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("学生".equals(role))
//            shiyanshiYuyue.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<ShiyanshiYuyueEntity> queryWrapper = new EntityWrapper<ShiyanshiYuyueEntity>()
            .notIn("id",shiyanshiYuyue.getId())
            .andNew()
            .eq("shiyanshi_id", shiyanshiYuyue.getShiyanshiId())
            .eq("laoshi_id", shiyanshiYuyue.getLaoshiId())
            .eq("shiyanshi_yuyue_name", shiyanshiYuyue.getShiyanshiYuyueName())
            .eq("shiyanshi_yuyue_types", shiyanshiYuyue.getShiyanshiYuyueTypes())
            .eq("insert_time", shiyanshiYuyue.getInsertTime())
            .eq("kaishi_time", shiyanshiYuyue.getKaishiTime())
            .eq("jieshu_time", shiyanshiYuyue.getJieshuTime())
            .eq("shiyanshi_yuyue_shenhe_time", shiyanshiYuyue.getShiyanshiYuyueShenheTime())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShiyanshiYuyueEntity shiyanshiYuyueEntity = shiyanshiYuyueService.selectOne(queryWrapper);
        if(shiyanshiYuyueEntity==null){
            shiyanshiYuyueService.updateById(shiyanshiYuyue);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody ShiyanshiYuyueEntity shiyanshiYuyueEntity, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,shiyanshiYuyueEntity:{}",this.getClass().getName(),shiyanshiYuyueEntity.toString());

        ShiyanshiYuyueEntity oldShiyanshiYuyue = shiyanshiYuyueService.selectById(shiyanshiYuyueEntity.getId());//查询原先数据

//        if(shiyanshiYuyueEntity.getShiyanshiYuyueYesnoTypes() == 2){//通过
//            shiyanshiYuyueEntity.setShiyanshiYuyueTypes();
//        }else if(shiyanshiYuyueEntity.getShiyanshiYuyueYesnoTypes() == 3){//拒绝
//            shiyanshiYuyueEntity.setShiyanshiYuyueTypes();
//        }
        shiyanshiYuyueEntity.setShiyanshiYuyueShenheTime(new Date());//审核时间
        shiyanshiYuyueService.updateById(shiyanshiYuyueEntity);//审核

        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ShiyanshiYuyueEntity> oldShiyanshiYuyueList =shiyanshiYuyueService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        shiyanshiYuyueService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<ShiyanshiYuyueEntity> shiyanshiYuyueList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ShiyanshiYuyueEntity shiyanshiYuyueEntity = new ShiyanshiYuyueEntity();
//                            shiyanshiYuyueEntity.setShiyanshiId(Integer.valueOf(data.get(0)));   //实验室 要改的
//                            shiyanshiYuyueEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            shiyanshiYuyueEntity.setShiyanshiYuyueUuidNumber(data.get(0));                    //预约编号 要改的
//                            shiyanshiYuyueEntity.setShiyanshiYuyueName(data.get(0));                    //课题名称 要改的
//                            shiyanshiYuyueEntity.setShiyanshiYuyueTypes(Integer.valueOf(data.get(0)));   //课题类型 要改的
//                            shiyanshiYuyueEntity.setShiyanshiYuyueContent("");//详情和图片
//                            shiyanshiYuyueEntity.setInsertTime(date);//时间
//                            shiyanshiYuyueEntity.setKaishiTime(sdf.parse(data.get(0)));          //使用开始时间 要改的
//                            shiyanshiYuyueEntity.setJieshuTime(sdf.parse(data.get(0)));          //使用结束时间 要改的
//                            shiyanshiYuyueEntity.setShiyanshiYuyueYesnoTypes(Integer.valueOf(data.get(0)));   //预约状态 要改的
//                            shiyanshiYuyueEntity.setShiyanshiYuyueYesnoText(data.get(0));                    //审核回复 要改的
//                            shiyanshiYuyueEntity.setShiyanshiYuyueShenheTime(sdf.parse(data.get(0)));          //审核时间 要改的
//                            shiyanshiYuyueEntity.setCreateTime(date);//时间
                            shiyanshiYuyueList.add(shiyanshiYuyueEntity);


                            //把要查询是否重复的字段放入map中
                                //预约编号
                                if(seachFields.containsKey("shiyanshiYuyueUuidNumber")){
                                    List<String> shiyanshiYuyueUuidNumber = seachFields.get("shiyanshiYuyueUuidNumber");
                                    shiyanshiYuyueUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> shiyanshiYuyueUuidNumber = new ArrayList<>();
                                    shiyanshiYuyueUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("shiyanshiYuyueUuidNumber",shiyanshiYuyueUuidNumber);
                                }
                        }

                        //查询是否重复
                         //预约编号
                        List<ShiyanshiYuyueEntity> shiyanshiYuyueEntities_shiyanshiYuyueUuidNumber = shiyanshiYuyueService.selectList(new EntityWrapper<ShiyanshiYuyueEntity>().in("shiyanshi_yuyue_uuid_number", seachFields.get("shiyanshiYuyueUuidNumber")));
                        if(shiyanshiYuyueEntities_shiyanshiYuyueUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ShiyanshiYuyueEntity s:shiyanshiYuyueEntities_shiyanshiYuyueUuidNumber){
                                repeatFields.add(s.getShiyanshiYuyueUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [预约编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        shiyanshiYuyueService.insertBatch(shiyanshiYuyueList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = shiyanshiYuyueService.queryPage(params);

        //字典表数据转换
        List<ShiyanshiYuyueView> list =(List<ShiyanshiYuyueView>)page.getList();
        for(ShiyanshiYuyueView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShiyanshiYuyueEntity shiyanshiYuyue = shiyanshiYuyueService.selectById(id);
        if(shiyanshiYuyue !=null){


            //entity转view
            ShiyanshiYuyueView view = new ShiyanshiYuyueView();
            BeanUtils.copyProperties( shiyanshiYuyue , view );//把实体数据重构到view中

            //级联表
            ShiyanshiEntity shiyanshi = shiyanshiService.selectById(shiyanshiYuyue.getShiyanshiId());
            if(shiyanshi != null){
                BeanUtils.copyProperties( shiyanshi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setShiyanshiId(shiyanshi.getId());
            }
            //级联表
            LaoshiEntity laoshi = laoshiService.selectById(shiyanshiYuyue.getLaoshiId());
            if(laoshi != null){
                BeanUtils.copyProperties( laoshi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setLaoshiId(laoshi.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }
    }



    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanshiYuyueEntity shiyanshiYuyue, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shiyanshiYuyue:{}",this.getClass().getName(),shiyanshiYuyue.toString());

        Wrapper<ShiyanshiYuyueEntity> queryWrapper = new EntityWrapper<ShiyanshiYuyueEntity>()
            .eq("shiyanshi_id", shiyanshiYuyue.getShiyanshiId())
            .eq("laoshi_id", shiyanshiYuyue.getLaoshiId())
            .eq("shiyanshi_yuyue_yesno_types", new Integer[]{1,2})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShiyanshiYuyueEntity shiyanshiYuyueEntity = shiyanshiYuyueService.selectOne(queryWrapper);
        if(shiyanshiYuyueEntity==null){
            shiyanshiYuyue.setInsertTime(new Date());
            shiyanshiYuyue.setShiyanshiYuyueYesnoTypes(1);
            shiyanshiYuyue.setCreateTime(new Date());
        shiyanshiYuyueService.insert(shiyanshiYuyue);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}
