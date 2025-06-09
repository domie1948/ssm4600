package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XuzuxinxiDao;
import com.entity.XuzuxinxiEntity;
import com.service.XuzuxinxiService;
import com.entity.vo.XuzuxinxiVO;
import com.entity.view.XuzuxinxiView;

@Service("xuzuxinxiService")
public class XuzuxinxiServiceImpl extends ServiceImpl<XuzuxinxiDao, XuzuxinxiEntity> implements XuzuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuzuxinxiEntity> page = this.selectPage(
                new Query<XuzuxinxiEntity>(params).getPage(),
                new EntityWrapper<XuzuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuzuxinxiEntity> wrapper) {
		  Page<XuzuxinxiView> page =new Query<XuzuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuzuxinxiVO> selectListVO(Wrapper<XuzuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuzuxinxiVO selectVO(Wrapper<XuzuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuzuxinxiView> selectListView(Wrapper<XuzuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuzuxinxiView selectView(Wrapper<XuzuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
