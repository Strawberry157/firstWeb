package com.sc.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 库存表
 * @author OnlyMark
 *
 */
public class Sku implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2177955667292869550L;
	
	private Integer id;		//id
	private Integer productId;	//商品id
	private String name;	//配置名称
	private Float price;	//价格
	private Float deliverFee;	//运费
	private Integer count;	//剩余库存数量
	private Date addTime;	//添加时间
	private Short isShowprice;	//是否显示（此）价格
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getDeliverFee() {
		return deliverFee;
	}
	public void setDeliverFee(Float deliverFee) {
		this.deliverFee = deliverFee;
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
	public Short getIsShowprice() {
		return isShowprice;
	}
	public void setIsShowprice(Short isShowprice) {
		this.isShowprice = isShowprice;
	}
	
	
}
