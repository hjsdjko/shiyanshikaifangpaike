package com.entity.model;

import com.entity.KetibaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课题报名
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KetibaomingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 实验室预约
     */
    private Integer shiyanshiYuyueId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 申请状态
     */
    private Integer ketibaomingYesnoTypes;


    /**
     * 审核回复
     */
    private String ketibaomingYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date ketibaomingShenheTime;


    /**
     * 分配座位号
     */
    private String ketibaomingZuoweihao;


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
	 * 获取：实验室预约
	 */
    public Integer getShiyanshiYuyueId() {
        return shiyanshiYuyueId;
    }


    /**
	 * 设置：实验室预约
	 */
    public void setShiyanshiYuyueId(Integer shiyanshiYuyueId) {
        this.shiyanshiYuyueId = shiyanshiYuyueId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
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
	 * 获取：申请状态
	 */
    public Integer getKetibaomingYesnoTypes() {
        return ketibaomingYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setKetibaomingYesnoTypes(Integer ketibaomingYesnoTypes) {
        this.ketibaomingYesnoTypes = ketibaomingYesnoTypes;
    }
    /**
	 * 获取：审核回复
	 */
    public String getKetibaomingYesnoText() {
        return ketibaomingYesnoText;
    }


    /**
	 * 设置：审核回复
	 */
    public void setKetibaomingYesnoText(String ketibaomingYesnoText) {
        this.ketibaomingYesnoText = ketibaomingYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getKetibaomingShenheTime() {
        return ketibaomingShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setKetibaomingShenheTime(Date ketibaomingShenheTime) {
        this.ketibaomingShenheTime = ketibaomingShenheTime;
    }
    /**
	 * 获取：分配座位号
	 */
    public String getKetibaomingZuoweihao() {
        return ketibaomingZuoweihao;
    }


    /**
	 * 设置：分配座位号
	 */
    public void setKetibaomingZuoweihao(String ketibaomingZuoweihao) {
        this.ketibaomingZuoweihao = ketibaomingZuoweihao;
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
