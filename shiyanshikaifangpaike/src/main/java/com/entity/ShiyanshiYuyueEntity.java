package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 实验室预约
 *
 * @author 
 * @email
 */
@TableName("shiyanshi_yuyue")
public class ShiyanshiYuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiyanshiYuyueEntity() {

	}

	public ShiyanshiYuyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 实验室
     */
    @ColumnInfo(comment="实验室",type="int(11)")
    @TableField(value = "shiyanshi_id")

    private Integer shiyanshiId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "laoshi_id")

    private Integer laoshiId;


    /**
     * 预约编号
     */
    @ColumnInfo(comment="预约编号",type="varchar(200)")
    @TableField(value = "shiyanshi_yuyue_uuid_number")

    private String shiyanshiYuyueUuidNumber;


    /**
     * 课题名称
     */
    @ColumnInfo(comment="课题名称",type="varchar(200)")
    @TableField(value = "shiyanshi_yuyue_name")

    private String shiyanshiYuyueName;


    /**
     * 课题类型
     */
    @ColumnInfo(comment="课题类型",type="int(11)")
    @TableField(value = "shiyanshi_yuyue_types")

    private Integer shiyanshiYuyueTypes;


    /**
     * 课题介绍
     */
    @ColumnInfo(comment="课题介绍",type="text")
    @TableField(value = "shiyanshi_yuyue_content")

    private String shiyanshiYuyueContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 使用开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="使用开始时间",type="timestamp")
    @TableField(value = "kaishi_time")

    private Date kaishiTime;


    /**
     * 使用结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="使用结束时间",type="timestamp")
    @TableField(value = "jieshu_time")

    private Date jieshuTime;


    /**
     * 预约状态
     */
    @ColumnInfo(comment="预约状态",type="int(11)")
    @TableField(value = "shiyanshi_yuyue_yesno_types")

    private Integer shiyanshiYuyueYesnoTypes;


    /**
     * 审核回复
     */
    @ColumnInfo(comment="审核回复",type="text")
    @TableField(value = "shiyanshi_yuyue_yesno_text")

    private String shiyanshiYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "shiyanshi_yuyue_shenhe_time")

    private Date shiyanshiYuyueShenheTime;


    /**
     * 创建时间  listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：实验室
	 */
    public Integer getShiyanshiId() {
        return shiyanshiId;
    }
    /**
	 * 设置：实验室
	 */

    public void setShiyanshiId(Integer shiyanshiId) {
        this.shiyanshiId = shiyanshiId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }
    /**
	 * 设置：用户
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 获取：预约编号
	 */
    public String getShiyanshiYuyueUuidNumber() {
        return shiyanshiYuyueUuidNumber;
    }
    /**
	 * 设置：预约编号
	 */

    public void setShiyanshiYuyueUuidNumber(String shiyanshiYuyueUuidNumber) {
        this.shiyanshiYuyueUuidNumber = shiyanshiYuyueUuidNumber;
    }
    /**
	 * 获取：课题名称
	 */
    public String getShiyanshiYuyueName() {
        return shiyanshiYuyueName;
    }
    /**
	 * 设置：课题名称
	 */

    public void setShiyanshiYuyueName(String shiyanshiYuyueName) {
        this.shiyanshiYuyueName = shiyanshiYuyueName;
    }
    /**
	 * 获取：课题类型
	 */
    public Integer getShiyanshiYuyueTypes() {
        return shiyanshiYuyueTypes;
    }
    /**
	 * 设置：课题类型
	 */

    public void setShiyanshiYuyueTypes(Integer shiyanshiYuyueTypes) {
        this.shiyanshiYuyueTypes = shiyanshiYuyueTypes;
    }
    /**
	 * 获取：课题介绍
	 */
    public String getShiyanshiYuyueContent() {
        return shiyanshiYuyueContent;
    }
    /**
	 * 设置：课题介绍
	 */

    public void setShiyanshiYuyueContent(String shiyanshiYuyueContent) {
        this.shiyanshiYuyueContent = shiyanshiYuyueContent;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：使用开始时间
	 */
    public Date getKaishiTime() {
        return kaishiTime;
    }
    /**
	 * 设置：使用开始时间
	 */

    public void setKaishiTime(Date kaishiTime) {
        this.kaishiTime = kaishiTime;
    }
    /**
	 * 获取：使用结束时间
	 */
    public Date getJieshuTime() {
        return jieshuTime;
    }
    /**
	 * 设置：使用结束时间
	 */

    public void setJieshuTime(Date jieshuTime) {
        this.jieshuTime = jieshuTime;
    }
    /**
	 * 获取：预约状态
	 */
    public Integer getShiyanshiYuyueYesnoTypes() {
        return shiyanshiYuyueYesnoTypes;
    }
    /**
	 * 设置：预约状态
	 */

    public void setShiyanshiYuyueYesnoTypes(Integer shiyanshiYuyueYesnoTypes) {
        this.shiyanshiYuyueYesnoTypes = shiyanshiYuyueYesnoTypes;
    }
    /**
	 * 获取：审核回复
	 */
    public String getShiyanshiYuyueYesnoText() {
        return shiyanshiYuyueYesnoText;
    }
    /**
	 * 设置：审核回复
	 */

    public void setShiyanshiYuyueYesnoText(String shiyanshiYuyueYesnoText) {
        this.shiyanshiYuyueYesnoText = shiyanshiYuyueYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getShiyanshiYuyueShenheTime() {
        return shiyanshiYuyueShenheTime;
    }
    /**
	 * 设置：审核时间
	 */

    public void setShiyanshiYuyueShenheTime(Date shiyanshiYuyueShenheTime) {
        this.shiyanshiYuyueShenheTime = shiyanshiYuyueShenheTime;
    }
    /**
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ShiyanshiYuyue{" +
            ", id=" + id +
            ", shiyanshiId=" + shiyanshiId +
            ", laoshiId=" + laoshiId +
            ", shiyanshiYuyueUuidNumber=" + shiyanshiYuyueUuidNumber +
            ", shiyanshiYuyueName=" + shiyanshiYuyueName +
            ", shiyanshiYuyueTypes=" + shiyanshiYuyueTypes +
            ", shiyanshiYuyueContent=" + shiyanshiYuyueContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", kaishiTime=" + DateUtil.convertString(kaishiTime,"yyyy-MM-dd") +
            ", jieshuTime=" + DateUtil.convertString(jieshuTime,"yyyy-MM-dd") +
            ", shiyanshiYuyueYesnoTypes=" + shiyanshiYuyueYesnoTypes +
            ", shiyanshiYuyueYesnoText=" + shiyanshiYuyueYesnoText +
            ", shiyanshiYuyueShenheTime=" + DateUtil.convertString(shiyanshiYuyueShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
