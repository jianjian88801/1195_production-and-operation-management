package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 作业信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-09 09:52:20
 */
@TableName("zuoyexinxi")
public class ZuoyexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuoyexinxiEntity() {
		
	}
	
	public ZuoyexinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 作业编号
	 */
					
	private String zuoyebianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：作业编号
	 */
	public void setZuoyebianhao(String zuoyebianhao) {
		this.zuoyebianhao = zuoyebianhao;
	}
	/**
	 * 获取：作业编号
	 */
	public String getZuoyebianhao() {
		return zuoyebianhao;
	}
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
