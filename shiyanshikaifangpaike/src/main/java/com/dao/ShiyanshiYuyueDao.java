package com.dao;

import com.entity.ShiyanshiYuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanshiYuyueView;

/**
 * 实验室预约 Dao 接口
 *
 * @author 
 */
public interface ShiyanshiYuyueDao extends BaseMapper<ShiyanshiYuyueEntity> {

   List<ShiyanshiYuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
