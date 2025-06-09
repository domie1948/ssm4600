package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 保险信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-01 09:50:59
 */
@TableName("baoxianxinxi")
public class BaoxianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaoxianxinxiEntity() {
		
	}
	
	public BaoxianxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 保险单号
	 */
					
	private String baoxiandanhao;
	
	/**
	 * 汽车编号
	 */
					
	private String qichebianhao;
	
	/**
	 * 汽车品牌
	 */
					
	private String qichepinpai;
	
	/**
	 * 车牌号
	 */
					
	private String chepaihao;
	
	/**
	 * 汽车型号
	 */
					
	private String qichexinghao;
	
	/**
	 * 保险费用
	 */
					
	private Integer baoxianfeiyong;
	
	/**
	 * 保险内容
	 */
					
	private String baoxianneirong;
	
	/**
	 * 生效时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shengxiaoshijian;
	
	/**
	 * 截至时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jiezhishijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：保险单号
	 */
	public void setBaoxiandanhao(String baoxiandanhao) {
		this.baoxiandanhao = baoxiandanhao;
	}
	/**
	 * 获取：保险单号
	 */
	public String getBaoxiandanhao() {
		return baoxiandanhao;
	}
	/**
	 * 设置：汽车编号
	 */
	public void setQichebianhao(String qichebianhao) {
		this.qichebianhao = qichebianhao;
	}
	/**
	 * 获取：汽车编号
	 */
	public String getQichebianhao() {
		return qichebianhao;
	}
	/**
	 * 设置：汽车品牌
	 */
	public void setQichepinpai(String qichepinpai) {
		this.qichepinpai = qichepinpai;
	}
	/**
	 * 获取：汽车品牌
	 */
	public String getQichepinpai() {
		return qichepinpai;
	}
	/**
	 * 设置：车牌号
	 */
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
	/**
	 * 设置：汽车型号
	 */
	public void setQichexinghao(String qichexinghao) {
		this.qichexinghao = qichexinghao;
	}
	/**
	 * 获取：汽车型号
	 */
	public String getQichexinghao() {
		return qichexinghao;
	}
	/**
	 * 设置：保险费用
	 */
	public void setBaoxianfeiyong(Integer baoxianfeiyong) {
		this.baoxianfeiyong = baoxianfeiyong;
	}
	/**
	 * 获取：保险费用
	 */
	public Integer getBaoxianfeiyong() {
		return baoxianfeiyong;
	}
	/**
	 * 设置：保险内容
	 */
	public void setBaoxianneirong(String baoxianneirong) {
		this.baoxianneirong = baoxianneirong;
	}
	/**
	 * 获取：保险内容
	 */
	public String getBaoxianneirong() {
		return baoxianneirong;
	}
	/**
	 * 设置：生效时间
	 */
	public void setShengxiaoshijian(Date shengxiaoshijian) {
		this.shengxiaoshijian = shengxiaoshijian;
	}
	/**
	 * 获取：生效时间
	 */
	public Date getShengxiaoshijian() {
		return shengxiaoshijian;
	}
	/**
	 * 设置：截至时间
	 */
	public void setJiezhishijian(Date jiezhishijian) {
		this.jiezhishijian = jiezhishijian;
	}
	/**
	 * 获取：截至时间
	 */
	public Date getJiezhishijian() {
		return jiezhishijian;
	}

}
