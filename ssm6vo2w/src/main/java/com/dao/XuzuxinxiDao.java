package com.dao;

import com.entity.XuzuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuzuxinxiVO;
import com.entity.view.XuzuxinxiView;


/**
 * 续租信息
 * 
 * @author 
 * @email 
 * @date 2020-12-01 09:50:59
 */
public interface XuzuxinxiDao extends BaseMapper<XuzuxinxiEntity> {
	
	List<XuzuxinxiVO> selectListVO(@Param("ew") Wrapper<XuzuxinxiEntity> wrapper);
	
	XuzuxinxiVO selectVO(@Param("ew") Wrapper<XuzuxinxiEntity> wrapper);
	
	List<XuzuxinxiView> selectListView(@Param("ew") Wrapper<XuzuxinxiEntity> wrapper);

	List<XuzuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XuzuxinxiEntity> wrapper);
	
	XuzuxinxiView selectView(@Param("ew") Wrapper<XuzuxinxiEntity> wrapper);
	
}
