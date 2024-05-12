package com.entity.vo;

import com.entity.ShiyanshiYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 实验室预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shiyanshi_yuyue")
public class ShiyanshiYuyueVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 实验室
     */

    @TableField(value = "shiyanshi_id")
    private Integer shiyanshiId;


    /**
     * 用户
     */

    @TableField(value = "laoshi_id")
    private Integer laoshiId;


    /**
     * 预约编号
     */

    @TableField(value = "shiyanshi_yuyue_uuid_number")
    private String shiyanshiYuyueUuidNumber;


    /**
     * 课题名称
     */

    @TableField(value = "shiyanshi_yuyue_name")
    private String shiyanshiYuyueName;


    /**
     * 课题类型
     */

    @TableField(value = "shiyanshi_yuyue_types")
    private Integer shiyanshiYuyueTypes;


    /**
     * 课题介绍
     */

    @TableField(value = "shiyanshi_yuyue_content")
    private String shiyanshiYuyueContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 使用开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "kaishi_time")
    private Date kaishiTime;


    /**
     * 使用结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jieshu_time")
    private Date jieshuTime;


    /**
     * 预约状态
     */

    @TableField(value = "shiyanshi_yuyue_yesno_types")
    private Integer shiyanshiYuyueYesnoTypes;


    /**
     * 审核回复
     */

    @TableField(value = "shiyanshi_yuyue_yesno_text")
    private String shiyanshiYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shiyanshi_yuyue_shenhe_time")
    private Date shiyanshiYuyueShenheTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：实验室
	 */
    public Integer getShiyanshiId() {
        return shiyanshiId;
    }


    /**
	 * 获取：实验室
	 */

    public void setShiyanshiId(Integer shiyanshiId) {
        this.shiyanshiId = shiyanshiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 获取：用户
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 设置：预约编号
	 */
    public String getShiyanshiYuyueUuidNumber() {
        return shiyanshiYuyueUuidNumber;
    }


    /**
	 * 获取：预约编号
	 */

    public void setShiyanshiYuyueUuidNumber(String shiyanshiYuyueUuidNumber) {
        this.shiyanshiYuyueUuidNumber = shiyanshiYuyueUuidNumber;
    }
    /**
	 * 设置：课题名称
	 */
    public String getShiyanshiYuyueName() {
        return shiyanshiYuyueName;
    }


    /**
	 * 获取：课题名称
	 */

    public void setShiyanshiYuyueName(String shiyanshiYuyueName) {
        this.shiyanshiYuyueName = shiyanshiYuyueName;
    }
    /**
	 * 设置：课题类型
	 */
    public Integer getShiyanshiYuyueTypes() {
        return shiyanshiYuyueTypes;
    }


    /**
	 * 获取：课题类型
	 */

    public void setShiyanshiYuyueTypes(Integer shiyanshiYuyueTypes) {
        this.shiyanshiYuyueTypes = shiyanshiYuyueTypes;
    }
    /**
	 * 设置：课题介绍
	 */
    public String getShiyanshiYuyueContent() {
        return shiyanshiYuyueContent;
    }


    /**
	 * 获取：课题介绍
	 */

    public void setShiyanshiYuyueContent(String shiyanshiYuyueContent) {
        this.shiyanshiYuyueContent = shiyanshiYuyueContent;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：使用开始时间
	 */
    public Date getKaishiTime() {
        return kaishiTime;
    }


    /**
	 * 获取：使用开始时间
	 */

    public void setKaishiTime(Date kaishiTime) {
        this.kaishiTime = kaishiTime;
    }
    /**
	 * 设置：使用结束时间
	 */
    public Date getJieshuTime() {
        return jieshuTime;
    }


    /**
	 * 获取：使用结束时间
	 */

    public void setJieshuTime(Date jieshuTime) {
        this.jieshuTime = jieshuTime;
    }
    /**
	 * 设置：预约状态
	 */
    public Integer getShiyanshiYuyueYesnoTypes() {
        return shiyanshiYuyueYesnoTypes;
    }


    /**
	 * 获取：预约状态
	 */

    public void setShiyanshiYuyueYesnoTypes(Integer shiyanshiYuyueYesnoTypes) {
        this.shiyanshiYuyueYesnoTypes = shiyanshiYuyueYesnoTypes;
    }
    /**
	 * 设置：审核回复
	 */
    public String getShiyanshiYuyueYesnoText() {
        return shiyanshiYuyueYesnoText;
    }


    /**
	 * 获取：审核回复
	 */

    public void setShiyanshiYuyueYesnoText(String shiyanshiYuyueYesnoText) {
        this.shiyanshiYuyueYesnoText = shiyanshiYuyueYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getShiyanshiYuyueShenheTime() {
        return shiyanshiYuyueShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setShiyanshiYuyueShenheTime(Date shiyanshiYuyueShenheTime) {
        this.shiyanshiYuyueShenheTime = shiyanshiYuyueShenheTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
