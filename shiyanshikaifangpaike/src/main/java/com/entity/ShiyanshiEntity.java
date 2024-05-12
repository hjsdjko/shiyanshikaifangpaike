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
 * 实验室
 *
 * @author 
 * @email
 */
@TableName("shiyanshi")
public class ShiyanshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiyanshiEntity() {

	}

	public ShiyanshiEntity(T t) {
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
     * 实验室编号
     */
    @ColumnInfo(comment="实验室编号",type="varchar(200)")
    @TableField(value = "shiyanshi_uuid_number")

    private String shiyanshiUuidNumber;


    /**
     * 实验室名称
     */
    @ColumnInfo(comment="实验室名称",type="varchar(200)")
    @TableField(value = "shiyanshi_name")

    private String shiyanshiName;


    /**
     * 实验室照片
     */
    @ColumnInfo(comment="实验室照片",type="varchar(200)")
    @TableField(value = "shiyanshi_photo")

    private String shiyanshiPhoto;


    /**
     * 实验室类型
     */
    @ColumnInfo(comment="实验室类型",type="int(11)")
    @TableField(value = "shiyanshi_types")

    private Integer shiyanshiTypes;


    /**
     * 实验室位置
     */
    @ColumnInfo(comment="实验室位置",type="varchar(200)")
    @TableField(value = "shiyanshi_address")

    private String shiyanshiAddress;


    /**
     * 规章制度
     */
    @ColumnInfo(comment="规章制度",type="text")
    @TableField(value = "shiyanshi_text")

    private String shiyanshiText;


    /**
     * 实验室介绍
     */
    @ColumnInfo(comment="实验室介绍",type="text")
    @TableField(value = "shiyanshi_content")

    private String shiyanshiContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：实验室编号
	 */
    public String getShiyanshiUuidNumber() {
        return shiyanshiUuidNumber;
    }
    /**
	 * 设置：实验室编号
	 */

    public void setShiyanshiUuidNumber(String shiyanshiUuidNumber) {
        this.shiyanshiUuidNumber = shiyanshiUuidNumber;
    }
    /**
	 * 获取：实验室名称
	 */
    public String getShiyanshiName() {
        return shiyanshiName;
    }
    /**
	 * 设置：实验室名称
	 */

    public void setShiyanshiName(String shiyanshiName) {
        this.shiyanshiName = shiyanshiName;
    }
    /**
	 * 获取：实验室照片
	 */
    public String getShiyanshiPhoto() {
        return shiyanshiPhoto;
    }
    /**
	 * 设置：实验室照片
	 */

    public void setShiyanshiPhoto(String shiyanshiPhoto) {
        this.shiyanshiPhoto = shiyanshiPhoto;
    }
    /**
	 * 获取：实验室类型
	 */
    public Integer getShiyanshiTypes() {
        return shiyanshiTypes;
    }
    /**
	 * 设置：实验室类型
	 */

    public void setShiyanshiTypes(Integer shiyanshiTypes) {
        this.shiyanshiTypes = shiyanshiTypes;
    }
    /**
	 * 获取：实验室位置
	 */
    public String getShiyanshiAddress() {
        return shiyanshiAddress;
    }
    /**
	 * 设置：实验室位置
	 */

    public void setShiyanshiAddress(String shiyanshiAddress) {
        this.shiyanshiAddress = shiyanshiAddress;
    }
    /**
	 * 获取：规章制度
	 */
    public String getShiyanshiText() {
        return shiyanshiText;
    }
    /**
	 * 设置：规章制度
	 */

    public void setShiyanshiText(String shiyanshiText) {
        this.shiyanshiText = shiyanshiText;
    }
    /**
	 * 获取：实验室介绍
	 */
    public String getShiyanshiContent() {
        return shiyanshiContent;
    }
    /**
	 * 设置：实验室介绍
	 */

    public void setShiyanshiContent(String shiyanshiContent) {
        this.shiyanshiContent = shiyanshiContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shiyanshi{" +
            ", id=" + id +
            ", shiyanshiUuidNumber=" + shiyanshiUuidNumber +
            ", shiyanshiName=" + shiyanshiName +
            ", shiyanshiPhoto=" + shiyanshiPhoto +
            ", shiyanshiTypes=" + shiyanshiTypes +
            ", shiyanshiAddress=" + shiyanshiAddress +
            ", shiyanshiText=" + shiyanshiText +
            ", shiyanshiContent=" + shiyanshiContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
