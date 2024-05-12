package com.dao;

import com.entity.KetibaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KetibaomingView;

/**
 * 课题报名 Dao 接口
 *
 * @author 
 */
public interface KetibaomingDao extends BaseMapper<KetibaomingEntity> {

   List<KetibaomingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
