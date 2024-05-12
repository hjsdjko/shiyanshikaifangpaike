package com.entity.model;

import com.entity.ShiyanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实验室
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShiyanshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 实验室编号
     */
    private String shiyanshiUuidNumber;


    /**
     * 实验室名称
     */
    private String shiyanshiName;


    /**
     * 实验室照片
     */
    private String shiyanshiPhoto;


    /**
     * 实验室类型
     */
    private Integer shiyanshiTypes;


    /**
     * 实验室位置
     */
    private String shiyanshiAddress;


    /**
     * 规章制度
     */
    private String shiyanshiText;


    /**
     * 实验室介绍
     */
    private String shiyanshiContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
