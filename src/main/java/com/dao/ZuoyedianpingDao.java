package com.dao;

import com.entity.ZuoyedianpingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyedianpingVO;
import com.entity.view.ZuoyedianpingView;


/**
 * 作业点评
 * 
 * @author 
 * @email 
 * @date 2021-05-09 09:52:20
 */
public interface ZuoyedianpingDao extends BaseMapper<ZuoyedianpingEntity> {
	
	List<ZuoyedianpingVO> selectListVO(@Param("ew") Wrapper<ZuoyedianpingEntity> wrapper);
	
	ZuoyedianpingVO selectVO(@Param("ew") Wrapper<ZuoyedianpingEntity> wrapper);
	
	List<ZuoyedianpingView> selectListView(@Param("ew") Wrapper<ZuoyedianpingEntity> wrapper);

	List<ZuoyedianpingView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyedianpingEntity> wrapper);
	
	ZuoyedianpingView selectView(@Param("ew") Wrapper<ZuoyedianpingEntity> wrapper);
	
}
