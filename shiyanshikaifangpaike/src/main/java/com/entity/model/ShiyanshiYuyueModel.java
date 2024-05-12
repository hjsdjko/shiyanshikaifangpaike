package com.entity.model;

import com.entity.ShiyanshiYuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 实验室预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShiyanshiYuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 实验室
     */
    private Integer shiyanshiId;


    /**
     * 用户
     */
    private Integer laoshiId;


    /**
     * 预约编号
     */
    private String shiyanshiYuyueUuidNumber;


    /**
     * 课题名称
     */
    private String shiyanshiYuyueName;


    /**
     * 课题类型
     */
    private Integer shiyanshiYuyueTypes;


    /**
     * 课题介绍
     */
    private String shiyanshiYuyueContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 使用开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date kaishiTime;


    /**
     * 使用结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jieshuTime;


    /**
     * 预约状态
     */
    private Integer shiyanshiYuyueYesnoTypes;


    /**
     * 审核回复
     */
    private String shiyanshiYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date shiyanshiYuyueShenheTime;


    /**
     * 创建时间 show3 listShow
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
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
