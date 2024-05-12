package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.KetibaomingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 课题报名
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("ketibaoming")
public class KetibaomingView extends KetibaomingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 申请状态的值
	*/
	@ColumnInfo(comment="申请状态的字典表值",type="varchar(200)")
	private String ketibaomingYesnoValue;

	//级联表 实验室预约
										 
		/**
		* 实验室预约 的 用户
		*/
		@ColumnInfo(comment="用户",type="int(11)")
		private Integer shiyanshiYuyueLaoshiId;
		/**
		* 预约编号
		*/

		@ColumnInfo(comment="预约编号",type="varchar(200)")
		private String shiyanshiYuyueUuidNumber;
		/**
		* 课题名称
		*/

		@ColumnInfo(comment="课题名称",type="varchar(200)")
		private String shiyanshiYuyueName;
		/**
		* 课题类型
		*/
		@ColumnInfo(comment="课题类型",type="int(11)")
		private Integer shiyanshiYuyueTypes;
			/**
			* 课题类型的值
			*/
			@ColumnInfo(comment="课题类型的字典表值",type="varchar(200)")
			private String shiyanshiYuyueValue;
		/**
		* 课题介绍
		*/

		@ColumnInfo(comment="课题介绍",type="text")
		private String shiyanshiYuyueContent;
		/**
		* 使用开始时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="使用开始时间",type="timestamp")
		private Date kaishiTime;
		/**
		* 使用结束时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="使用结束时间",type="timestamp")
		private Date jieshuTime;
		/**
		* 预约状态
		*/
		@ColumnInfo(comment="预约状态",type="int(11)")
		private Integer shiyanshiYuyueYesnoTypes;
			/**
			* 预约状态的值
			*/
			@ColumnInfo(comment="预约状态的字典表值",type="varchar(200)")
			private String shiyanshiYuyueYesnoValue;
		/**
		* 审核回复
		*/

		@ColumnInfo(comment="审核回复",type="text")
		private String shiyanshiYuyueYesnoText;
		/**
		* 审核时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="审核时间",type="timestamp")
		private Date shiyanshiYuyueShenheTime;
	//级联表 学生
		/**
		* 学生姓名
		*/

		@ColumnInfo(comment="学生姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 学生手机号
		*/

		@ColumnInfo(comment="学生手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 学生身份证号
		*/

		@ColumnInfo(comment="学生身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 学生头像
		*/

		@ColumnInfo(comment="学生头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 院系
		*/
		@ColumnInfo(comment="院系",type="int(11)")
		private Integer yuanxiTypes;
			/**
			* 院系的值
			*/
			@ColumnInfo(comment="院系的字典表值",type="varchar(200)")
			private String yuanxiValue;
		/**
		* 班级
		*/
		@ColumnInfo(comment="班级",type="int(11)")
		private Integer banjiTypes;
			/**
			* 班级的值
			*/
			@ColumnInfo(comment="班级的字典表值",type="varchar(200)")
			private String banjiValue;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String yonghuEmail;

	private String shiyanshiText;

	public String getShiyanshiText() {
		return shiyanshiText;
	}

	public void setShiyanshiText(String shiyanshiText) {
		this.shiyanshiText = shiyanshiText;
	}


	public KetibaomingView() {

	}

	public KetibaomingView(KetibaomingEntity ketibaomingEntity) {
		try {
			BeanUtils.copyProperties(this, ketibaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 申请状态的值
	*/
	public String getKetibaomingYesnoValue() {
		return ketibaomingYesnoValue;
	}
	/**
	* 设置： 申请状态的值
	*/
	public void setKetibaomingYesnoValue(String ketibaomingYesnoValue) {
		this.ketibaomingYesnoValue = ketibaomingYesnoValue;
	}


	//级联表的get和set 实验室预约
		/**
		* 获取：实验室预约 的 用户
		*/
		public Integer getShiyanshiYuyueLaoshiId() {
			return shiyanshiYuyueLaoshiId;
		}
		/**
		* 设置：实验室预约 的 用户
		*/
		public void setShiyanshiYuyueLaoshiId(Integer shiyanshiYuyueLaoshiId) {
			this.shiyanshiYuyueLaoshiId = shiyanshiYuyueLaoshiId;
		}

		/**
		* 获取： 预约编号
		*/
		public String getShiyanshiYuyueUuidNumber() {
			return shiyanshiYuyueUuidNumber;
		}
		/**
		* 设置： 预约编号
		*/
		public void setShiyanshiYuyueUuidNumber(String shiyanshiYuyueUuidNumber) {
			this.shiyanshiYuyueUuidNumber = shiyanshiYuyueUuidNumber;
		}

		/**
		* 获取： 课题名称
		*/
		public String getShiyanshiYuyueName() {
			return shiyanshiYuyueName;
		}
		/**
		* 设置： 课题名称
		*/
		public void setShiyanshiYuyueName(String shiyanshiYuyueName) {
			this.shiyanshiYuyueName = shiyanshiYuyueName;
		}
		/**
		* 获取： 课题类型
		*/
		public Integer getShiyanshiYuyueTypes() {
			return shiyanshiYuyueTypes;
		}
		/**
		* 设置： 课题类型
		*/
		public void setShiyanshiYuyueTypes(Integer shiyanshiYuyueTypes) {
			this.shiyanshiYuyueTypes = shiyanshiYuyueTypes;
		}


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

		/**
		* 获取： 课题介绍
		*/
		public String getShiyanshiYuyueContent() {
			return shiyanshiYuyueContent;
		}
		/**
		* 设置： 课题介绍
		*/
		public void setShiyanshiYuyueContent(String shiyanshiYuyueContent) {
			this.shiyanshiYuyueContent = shiyanshiYuyueContent;
		}

		/**
		* 获取： 使用开始时间
		*/
		public Date getKaishiTime() {
			return kaishiTime;
		}
		/**
		* 设置： 使用开始时间
		*/
		public void setKaishiTime(Date kaishiTime) {
			this.kaishiTime = kaishiTime;
		}

		/**
		* 获取： 使用结束时间
		*/
		public Date getJieshuTime() {
			return jieshuTime;
		}
		/**
		* 设置： 使用结束时间
		*/
		public void setJieshuTime(Date jieshuTime) {
			this.jieshuTime = jieshuTime;
		}
		/**
		* 获取： 预约状态
		*/
		public Integer getShiyanshiYuyueYesnoTypes() {
			return shiyanshiYuyueYesnoTypes;
		}
		/**
		* 设置： 预约状态
		*/
		public void setShiyanshiYuyueYesnoTypes(Integer shiyanshiYuyueYesnoTypes) {
			this.shiyanshiYuyueYesnoTypes = shiyanshiYuyueYesnoTypes;
		}


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

		/**
		* 获取： 审核回复
		*/
		public String getShiyanshiYuyueYesnoText() {
			return shiyanshiYuyueYesnoText;
		}
		/**
		* 设置： 审核回复
		*/
		public void setShiyanshiYuyueYesnoText(String shiyanshiYuyueYesnoText) {
			this.shiyanshiYuyueYesnoText = shiyanshiYuyueYesnoText;
		}

		/**
		* 获取： 审核时间
		*/
		public Date getShiyanshiYuyueShenheTime() {
			return shiyanshiYuyueShenheTime;
		}
		/**
		* 设置： 审核时间
		*/
		public void setShiyanshiYuyueShenheTime(Date shiyanshiYuyueShenheTime) {
			this.shiyanshiYuyueShenheTime = shiyanshiYuyueShenheTime;
		}
	//级联表的get和set 学生

		/**
		* 获取： 学生姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 学生姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 学生手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 学生手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 学生身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 学生身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 学生头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 学生头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}
		/**
		* 获取： 院系
		*/
		public Integer getYuanxiTypes() {
			return yuanxiTypes;
		}
		/**
		* 设置： 院系
		*/
		public void setYuanxiTypes(Integer yuanxiTypes) {
			this.yuanxiTypes = yuanxiTypes;
		}


			/**
			* 获取： 院系的值
			*/
			public String getYuanxiValue() {
				return yuanxiValue;
			}
			/**
			* 设置： 院系的值
			*/
			public void setYuanxiValue(String yuanxiValue) {
				this.yuanxiValue = yuanxiValue;
			}
		/**
		* 获取： 班级
		*/
		public Integer getBanjiTypes() {
			return banjiTypes;
		}
		/**
		* 设置： 班级
		*/
		public void setBanjiTypes(Integer banjiTypes) {
			this.banjiTypes = banjiTypes;
		}


			/**
			* 获取： 班级的值
			*/
			public String getBanjiValue() {
				return banjiValue;
			}
			/**
			* 设置： 班级的值
			*/
			public void setBanjiValue(String banjiValue) {
				this.banjiValue = banjiValue;
			}

		/**
		* 获取： 电子邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "KetibaomingView{" +
			", ketibaomingYesnoValue=" + ketibaomingYesnoValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", shiyanshiYuyueUuidNumber=" + shiyanshiYuyueUuidNumber +
			", shiyanshiYuyueName=" + shiyanshiYuyueName +
			", shiyanshiYuyueContent=" + shiyanshiYuyueContent +
			", kaishiTime=" + DateUtil.convertString(kaishiTime,"yyyy-MM-dd") +
			", jieshuTime=" + DateUtil.convertString(jieshuTime,"yyyy-MM-dd") +
			", shiyanshiYuyueYesnoText=" + shiyanshiYuyueYesnoText +
			", shiyanshiYuyueShenheTime=" + DateUtil.convertString(shiyanshiYuyueShenheTime,"yyyy-MM-dd") +
			"} " + super.toString();
	}
}
