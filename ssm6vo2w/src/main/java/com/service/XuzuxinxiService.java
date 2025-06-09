package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuzuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuzuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuzuxinxiView;


/**
 * 续租信息
 *
 * @author 
 * @email 
 * @date 2020-12-01 09:50:59
 */
public interface XuzuxinxiService extends IService<XuzuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuzuxinxiVO> selectListVO(Wrapper<XuzuxinxiEntity> wrapper);
   	
   	XuzuxinxiVO selectVO(@Param("ew") Wrapper<XuzuxinxiEntity> wrapper);
   	
   	List<XuzuxinxiView> selectListView(Wrapper<XuzuxinxiEntity> wrapper);
   	
   	XuzuxinxiView selectView(@Param("ew") Wrapper<XuzuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuzuxinxiEntity> wrapper);
   	
}

