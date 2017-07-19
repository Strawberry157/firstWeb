package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class Buycart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7664879084954930852L;
		
	private Integer id;		//id
	private Integer userId;		//用户id
	private Integer productId;	//商品id
	private Integer skuId;		//库存id
	private Integer count;		//数量
	private Date addTime;		//添加时间
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getSkuId() {
		return skuId;
	}
	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
