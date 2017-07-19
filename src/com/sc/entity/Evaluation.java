package com.sc.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 评测表
 * @author OnlyMark
 *
 */
public class Evaluation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8568018935070791463L;
	
	private Integer id;		//id
	private Integer productId;	//商品id
	private String title;	//评测标题
	private String detail;	//评测内容
	private String images;	//评测图片
	private Integer browseCount;	//浏览量
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public Integer getBrowseCount() {
		return browseCount;
	}
	public void setBrowseCount(Integer browseCount) {
		this.browseCount = browseCount;
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
