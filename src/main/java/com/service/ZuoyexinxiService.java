package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoyexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyexinxiView;


/**
 * 作业信息
 *
 * @author 
 * @email 
 * @date 2021-05-09 09:52:20
 */
public interface ZuoyexinxiService extends IService<ZuoyexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyexinxiVO> selectListVO(Wrapper<ZuoyexinxiEntity> wrapper);
   	
   	ZuoyexinxiVO selectVO(@Param("ew") Wrapper<ZuoyexinxiEntity> wrapper);
   	
   	List<ZuoyexinxiView> selectListView(Wrapper<ZuoyexinxiEntity> wrapper);
   	
   	ZuoyexinxiView selectView(@Param("ew") Wrapper<ZuoyexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyexinxiEntity> wrapper);
   	
}

