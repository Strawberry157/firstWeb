package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品表
 * @author OnlyMark
 *
 */
public class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2518835766901975866L;
	
	private Integer id;		//id
	private Integer brandId;	//品牌id
	private Integer shopId;		//商家id
	private String name; 	//商品名称
	private String sname; 	//商品名称（简）
	private String imgUrl;	//列表显示图片
	private Short isNew;	//是否新品
	private Short isHot;	//是否热门
	private Short isCommend;	//是否推荐
	private Short isDel;	//是否删除
	private String packageList;	//包装清单
	private Date addTime;	//添加时间
	private Float price;	//显示价格（最低）
	private String detail;	//商品详细信息
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public Short getIsNew() {
		return isNew;
	}
	public void setIsNew(Short isNew) {
		this.isNew = isNew;
	}
	public Short getIsHot() {
		return isHot;
	}
	public void setIsHot(Short isHot) {
		this.isHot = isHot;
	}
	public Short getIsCommend() {
		return isCommend;
	}
	public void setIsCommend(Short isCommend) {
		this.isCommend = isCommend;
	}
	public Short getIsDel() {
		return isDel;
	}
	public void setIsDel(Short isDel) {
		this.isDel = isDel;
	}
	public String getPackageList() {
		return packageList;
	}
	public void setPackageList(String packageList) {
		this.packageList = packageList;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
}
