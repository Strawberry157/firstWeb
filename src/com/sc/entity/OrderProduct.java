package com.sc.entity;

import java.io.Serializable;
/**
 * 订单商品表
 * @author OnlyMark
 *
 */

public class OrderProduct implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 753138700778248739L;
	
	private Integer id;		//id
	private Integer orderId;	//订单id
	private Integer productId;	//商品id
	private Integer count;		//库存id
	private String remark;		//数量
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
