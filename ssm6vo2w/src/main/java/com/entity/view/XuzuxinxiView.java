package com.entity.view;

import com.entity.XuzuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 续租信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-01 09:50:59
 */
@TableName("xuzuxinxi")
public class XuzuxinxiView  extends XuzuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuzuxinxiView(){
	}
 
 	public XuzuxinxiView(XuzuxinxiEntity xuzuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xuzuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
