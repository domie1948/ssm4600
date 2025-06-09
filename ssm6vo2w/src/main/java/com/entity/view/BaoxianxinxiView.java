package com.entity.view;

import com.entity.BaoxianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 保险信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-01 09:50:59
 */
@TableName("baoxianxinxi")
public class BaoxianxinxiView  extends BaoxianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaoxianxinxiView(){
	}
 
 	public BaoxianxinxiView(BaoxianxinxiEntity baoxianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, baoxianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
