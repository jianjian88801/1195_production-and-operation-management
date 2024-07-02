package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyedianpingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoyedianpingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyedianpingView;


/**
 * 作业点评
 *
 * @author 
 * @email 
 * @date 2021-05-09 09:52:20
 */
public interface ZuoyedianpingService extends IService<ZuoyedianpingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyedianpingVO> selectListVO(Wrapper<ZuoyedianpingEntity> wrapper);
   	
   	ZuoyedianpingVO selectVO(@Param("ew") Wrapper<ZuoyedianpingEntity> wrapper);
   	
   	List<ZuoyedianpingView> selectListView(Wrapper<ZuoyedianpingEntity> wrapper);
   	
   	ZuoyedianpingView selectView(@Param("ew") Wrapper<ZuoyedianpingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyedianpingEntity> wrapper);
   	
}

