package com.sc.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 评价表
 * @author OnlyMark
 *
 */
public class Appraise implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3322069946632430465L;
	
	private Integer id;		//id
	private Integer userId;	//用户id
	private Integer productId;	//商品id
	private String detail;	//评价内容
	private String imgUrl;	//评价图片url
	private Integer stars;	//评价星级
	private Date addTime;	//评价添加时间
	
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
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public Integer getStars() {
		return stars;
	}
	public void setStars(Integer stars) {
		this.stars = stars;
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
