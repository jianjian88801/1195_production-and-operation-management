package com.entity.view;

import com.entity.ZuoyedianpingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作业点评
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-09 09:52:20
 */
@TableName("zuoyedianping")
public class ZuoyedianpingView  extends ZuoyedianpingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyedianpingView(){
	}
 
 	public ZuoyedianpingView(ZuoyedianpingEntity zuoyedianpingEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyedianpingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
