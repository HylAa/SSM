package com.bootdo.product.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author Ahliang
 * @email 1992lcg@163.com
 * @date 2018-11-15 20:44:53
 */
public class ProductDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long id;
	//商品名称
	private String name;
	//商品编号
	private Integer num;

	/**
	 * 设置：主键
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：商品名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：商品名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：商品编号
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	/**
	 * 获取：商品编号
	 */
	public Integer getNum() {
		return num;
	}
}
