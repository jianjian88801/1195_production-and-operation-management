package com.dao;

import com.entity.ZuoyexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyexinxiVO;
import com.entity.view.ZuoyexinxiView;


/**
 * 作业信息
 * 
 * @author 
 * @email 
 * @date 2021-05-09 09:52:20
 */
public interface ZuoyexinxiDao extends BaseMapper<ZuoyexinxiEntity> {
	
	List<ZuoyexinxiVO> selectListVO(@Param("ew") Wrapper<ZuoyexinxiEntity> wrapper);
	
	ZuoyexinxiVO selectVO(@Param("ew") Wrapper<ZuoyexinxiEntity> wrapper);
	
	List<ZuoyexinxiView> selectListView(@Param("ew") Wrapper<ZuoyexinxiEntity> wrapper);

	List<ZuoyexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyexinxiEntity> wrapper);
	
	ZuoyexinxiView selectView(@Param("ew") Wrapper<ZuoyexinxiEntity> wrapper);
	
}
