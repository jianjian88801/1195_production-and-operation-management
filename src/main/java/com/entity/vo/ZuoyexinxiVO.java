package com.entity.vo;

import com.entity.ZuoyexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 作业信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-09 09:52:20
 */
public class ZuoyexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 作业标题
	 */
	
	private String zuoyebiaoti;
		
	/**
	 * 作业文件
	 */
	
	private String zuoyewenjian;
		
	/**
	 * 作业内容
	 */
	
	private String zuoyeneirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
				
	
	/**
	 * 设置：作业标题
	 */
	 
	public void setZuoyebiaoti(String zuoyebiaoti) {
		this.zuoyebiaoti = zuoyebiaoti;
	}
	
	/**
	 * 获取：作业标题
	 */
	public String getZuoyebiaoti() {
		return zuoyebiaoti;
	}
				
	
	/**
	 * 设置：作业文件
	 */
	 
	public void setZuoyewenjian(String zuoyewenjian) {
		this.zuoyewenjian = zuoyewenjian;
	}
	
	/**
	 * 获取：作业文件
	 */
	public String getZuoyewenjian() {
		return zuoyewenjian;
	}
				
	
	/**
	 * 设置：作业内容
	 */
	 
	public void setZuoyeneirong(String zuoyeneirong) {
		this.zuoyeneirong = zuoyeneirong;
	}
	
	/**
	 * 获取：作业内容
	 */
	public String getZuoyeneirong() {
		return zuoyeneirong;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
			
}
