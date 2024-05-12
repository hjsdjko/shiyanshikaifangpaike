package com.entity.vo;

import com.entity.KetibaomingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 课题报名
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("ketibaoming")
public class KetibaomingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 实验室预约
     */

    @TableField(value = "shiyanshi_yuyue_id")
    private Integer shiyanshiYuyueId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 申请状态
     */

    @TableField(value = "ketibaoming_yesno_types")
    private Integer ketibaomingYesnoTypes;


    /**
     * 审核回复
     */

    @TableField(value = "ketibaoming_yesno_text")
    private String ketibaomingYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "ketibaoming_shenhe_time")
    private Date ketibaomingShenheTime;


    /**
     * 分配座位号
     */

    @TableField(value = "ketibaoming_zuoweihao")
    private String ketibaomingZuoweihao;


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
	 * 设置：实验室预约
	 */
    public Integer getShiyanshiYuyueId() {
        return shiyanshiYuyueId;
    }


    /**
	 * 获取：实验室预约
	 */

    public void setShiyanshiYuyueId(Integer shiyanshiYuyueId) {
        this.shiyanshiYuyueId = shiyanshiYuyueId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
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
	 * 设置：申请状态
	 */
    public Integer getKetibaomingYesnoTypes() {
        return ketibaomingYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setKetibaomingYesnoTypes(Integer ketibaomingYesnoTypes) {
        this.ketibaomingYesnoTypes = ketibaomingYesnoTypes;
    }
    /**
	 * 设置：审核回复
	 */
    public String getKetibaomingYesnoText() {
        return ketibaomingYesnoText;
    }


    /**
	 * 获取：审核回复
	 */

    public void setKetibaomingYesnoText(String ketibaomingYesnoText) {
        this.ketibaomingYesnoText = ketibaomingYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getKetibaomingShenheTime() {
        return ketibaomingShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setKetibaomingShenheTime(Date ketibaomingShenheTime) {
        this.ketibaomingShenheTime = ketibaomingShenheTime;
    }
    /**
	 * 设置：分配座位号
	 */
    public String getKetibaomingZuoweihao() {
        return ketibaomingZuoweihao;
    }


    /**
	 * 获取：分配座位号
	 */

    public void setKetibaomingZuoweihao(String ketibaomingZuoweihao) {
        this.ketibaomingZuoweihao = ketibaomingZuoweihao;
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
