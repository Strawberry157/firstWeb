package com.sc.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 商品图片表
 * @author OnlyMark
 *
 */
public class ProductImg implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3095071399485787049L;
	
	private Integer id;		//id
	private Integer productId;	//商品id
	private String url;		//图片url
	private Short isDel;	//是否删除
	private Date addTime;	//添加时间
	
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Short getIsDel() {
		return isDel;
	}
	public void setIsDel(Short isDel) {
		this.isDel = isDel;
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
