package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ShiyanshiYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 实验室预约
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("shiyanshi_yuyue")
public class ShiyanshiYuyueView extends ShiyanshiYuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 课题类型的值
	*/
	@ColumnInfo(comment="课题类型的字典表值",type="varchar(200)")
	private String shiyanshiYuyueValue;
	/**
	* 预约状态的值
	*/
	@ColumnInfo(comment="预约状态的字典表值",type="varchar(200)")
	private String shiyanshiYuyueYesnoValue;

	//级联表 老师
		/**
		* 老师姓名
		*/

		@ColumnInfo(comment="老师姓名",type="varchar(200)")
		private String laoshiName;
		/**
		* 老师手机号
		*/

		@ColumnInfo(comment="老师手机号",type="varchar(200)")
		private String laoshiPhone;
		/**
		* 老师身份证号
		*/

		@ColumnInfo(comment="老师身份证号",type="varchar(200)")
		private String laoshiIdNumber;
		/**
		* 老师头像
		*/

		@ColumnInfo(comment="老师头像",type="varchar(200)")
		private String laoshiPhoto;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String laoshiEmail;
	//级联表 实验室
		/**
		* 实验室编号
		*/

		@ColumnInfo(comment="实验室编号",type="varchar(200)")
		private String shiyanshiUuidNumber;
		/**
		* 实验室名称
		*/

		@ColumnInfo(comment="实验室名称",type="varchar(200)")
		private String shiyanshiName;
		/**
		* 实验室照片
		*/

		@ColumnInfo(comment="实验室照片",type="varchar(200)")
		private String shiyanshiPhoto;
		/**
		* 实验室类型
		*/
		@ColumnInfo(comment="实验室类型",type="int(11)")
		private Integer shiyanshiTypes;
			/**
			* 实验室类型的值
			*/
			@ColumnInfo(comment="实验室类型的字典表值",type="varchar(200)")
			private String shiyanshiValue;
		/**
		* 实验室位置
		*/

		@ColumnInfo(comment="实验室位置",type="varchar(200)")
		private String shiyanshiAddress;
		/**
		* 规章制度
		*/

		@ColumnInfo(comment="规章制度",type="text")
		private String shiyanshiText;
		/**
		* 实验室介绍
		*/

		@ColumnInfo(comment="实验室介绍",type="text")
		private String shiyanshiContent;



	public ShiyanshiYuyueView() {

	}

	public ShiyanshiYuyueView(ShiyanshiYuyueEntity shiyanshiYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, shiyanshiYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 课题类型的值
	*/
	public String getShiyanshiYuyueValue() {
		return shiyanshiYuyueValue;
	}
	/**
	* 设置： 课题类型的值
	*/
	public void setShiyanshiYuyueValue(String shiyanshiYuyueValue) {
		this.shiyanshiYuyueValue = shiyanshiYuyueValue;
	}
	//当前表的
	/**
	* 获取： 预约状态的值
	*/
	public String getShiyanshiYuyueYesnoValue() {
		return shiyanshiYuyueYesnoValue;
	}
	/**
	* 设置： 预约状态的值
	*/
	public void setShiyanshiYuyueYesnoValue(String shiyanshiYuyueYesnoValue) {
		this.shiyanshiYuyueYesnoValue = shiyanshiYuyueYesnoValue;
	}


	//级联表的get和set 老师

		/**
		* 获取： 老师姓名
		*/
		public String getLaoshiName() {
			return laoshiName;
		}
		/**
		* 设置： 老师姓名
		*/
		public void setLaoshiName(String laoshiName) {
			this.laoshiName = laoshiName;
		}

		/**
		* 获取： 老师手机号
		*/
		public String getLaoshiPhone() {
			return laoshiPhone;
		}
		/**
		* 设置： 老师手机号
		*/
		public void setLaoshiPhone(String laoshiPhone) {
			this.laoshiPhone = laoshiPhone;
		}

		/**
		* 获取： 老师身份证号
		*/
		public String getLaoshiIdNumber() {
			return laoshiIdNumber;
		}
		/**
		* 设置： 老师身份证号
		*/
		public void setLaoshiIdNumber(String laoshiIdNumber) {
			this.laoshiIdNumber = laoshiIdNumber;
		}

		/**
		* 获取： 老师头像
		*/
		public String getLaoshiPhoto() {
			return laoshiPhoto;
		}
		/**
		* 设置： 老师头像
		*/
		public void setLaoshiPhoto(String laoshiPhoto) {
			this.laoshiPhoto = laoshiPhoto;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getLaoshiEmail() {
			return laoshiEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setLaoshiEmail(String laoshiEmail) {
			this.laoshiEmail = laoshiEmail;
		}
	//级联表的get和set 实验室

		/**
		* 获取： 实验室编号
		*/
		public String getShiyanshiUuidNumber() {
			return shiyanshiUuidNumber;
		}
		/**
		* 设置： 实验室编号
		*/
		public void setShiyanshiUuidNumber(String shiyanshiUuidNumber) {
			this.shiyanshiUuidNumber = shiyanshiUuidNumber;
		}

		/**
		* 获取： 实验室名称
		*/
		public String getShiyanshiName() {
			return shiyanshiName;
		}
		/**
		* 设置： 实验室名称
		*/
		public void setShiyanshiName(String shiyanshiName) {
			this.shiyanshiName = shiyanshiName;
		}

		/**
		* 获取： 实验室照片
		*/
		public String getShiyanshiPhoto() {
			return shiyanshiPhoto;
		}
		/**
		* 设置： 实验室照片
		*/
		public void setShiyanshiPhoto(String shiyanshiPhoto) {
			this.shiyanshiPhoto = shiyanshiPhoto;
		}
		/**
		* 获取： 实验室类型
		*/
		public Integer getShiyanshiTypes() {
			return shiyanshiTypes;
		}
		/**
		* 设置： 实验室类型
		*/
		public void setShiyanshiTypes(Integer shiyanshiTypes) {
			this.shiyanshiTypes = shiyanshiTypes;
		}


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

		/**
		* 获取： 实验室位置
		*/
		public String getShiyanshiAddress() {
			return shiyanshiAddress;
		}
		/**
		* 设置： 实验室位置
		*/
		public void setShiyanshiAddress(String shiyanshiAddress) {
			this.shiyanshiAddress = shiyanshiAddress;
		}

		/**
		* 获取： 规章制度
		*/
		public String getShiyanshiText() {
			return shiyanshiText;
		}
		/**
		* 设置： 规章制度
		*/
		public void setShiyanshiText(String shiyanshiText) {
			this.shiyanshiText = shiyanshiText;
		}

		/**
		* 获取： 实验室介绍
		*/
		public String getShiyanshiContent() {
			return shiyanshiContent;
		}
		/**
		* 设置： 实验室介绍
		*/
		public void setShiyanshiContent(String shiyanshiContent) {
			this.shiyanshiContent = shiyanshiContent;
		}


	@Override
	public String toString() {
		return "ShiyanshiYuyueView{" +
			", shiyanshiYuyueValue=" + shiyanshiYuyueValue +
			", shiyanshiYuyueYesnoValue=" + shiyanshiYuyueYesnoValue +
			", shiyanshiUuidNumber=" + shiyanshiUuidNumber +
			", shiyanshiName=" + shiyanshiName +
			", shiyanshiPhoto=" + shiyanshiPhoto +
			", shiyanshiAddress=" + shiyanshiAddress +
			", shiyanshiText=" + shiyanshiText +
			", shiyanshiContent=" + shiyanshiContent +
			", laoshiName=" + laoshiName +
			", laoshiPhone=" + laoshiPhone +
			", laoshiIdNumber=" + laoshiIdNumber +
			", laoshiPhoto=" + laoshiPhoto +
			", laoshiEmail=" + laoshiEmail +
			"} " + super.toString();
	}
}
