package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ShiyanshiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 实验室
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("shiyanshi")
public class ShiyanshiView extends ShiyanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 实验室类型的值
	*/
	@ColumnInfo(comment="实验室类型的字典表值",type="varchar(200)")
	private String shiyanshiValue;




	public ShiyanshiView() {

	}

	public ShiyanshiView(ShiyanshiEntity shiyanshiEntity) {
		try {
			BeanUtils.copyProperties(this, shiyanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 实验室类型的值
	*/
	public String getShiyanshiValue() {
		return shiyanshiValue;
	}
	/**
	* 设置： 实验室类型的值
	*/
	public void setShiyanshiValue(String shiyanshiValue) {
		this.shiyanshiValue = shiyanshiValue;
	}




	@Override
	public String toString() {
		return "ShiyanshiView{" +
			", shiyanshiValue=" + shiyanshiValue +
			"} " + super.toString();
	}
}
