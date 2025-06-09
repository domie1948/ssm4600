package com.entity.vo;

import com.entity.BaoxianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 保险信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-12-01 09:50:59
 */
public class BaoxianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shengxiaoshijian;
		
	/**
	 * 截至时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiezhishijian;
				
	
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
