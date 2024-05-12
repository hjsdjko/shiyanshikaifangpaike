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
 * 课题报名
 *
 * @author 
 * @email
 */
@TableName("ketibaoming")
public class KetibaomingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KetibaomingEntity() {

	}

	public KetibaomingEntity(T t) {
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
     * 实验室预约
     */
    @ColumnInfo(comment="实验室预约",type="int(11)")
    @TableField(value = "shiyanshi_yuyue_id")

    private Integer shiyanshiYuyueId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "ketibaoming_yesno_types")

    private Integer ketibaomingYesnoTypes;


    /**
     * 审核回复
     */
    @ColumnInfo(comment="审核回复",type="text")
    @TableField(value = "ketibaoming_yesno_text")

    private String ketibaomingYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "ketibaoming_shenhe_time")

    private Date ketibaomingShenheTime;


    /**
     * 分配座位号
     */
    @ColumnInfo(comment="分配座位号",type="varchar(200)")
    @TableField(value = "ketibaoming_zuoweihao")

    private String ketibaomingZuoweihao;


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
        return "Ketibaoming{" +
            ", id=" + id +
            ", shiyanshiYuyueId=" + shiyanshiYuyueId +
            ", yonghuId=" + yonghuId +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", ketibaomingYesnoTypes=" + ketibaomingYesnoTypes +
            ", ketibaomingYesnoText=" + ketibaomingYesnoText +
            ", ketibaomingShenheTime=" + DateUtil.convertString(ketibaomingShenheTime,"yyyy-MM-dd") +
            ", ketibaomingZuoweihao=" + ketibaomingZuoweihao +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
