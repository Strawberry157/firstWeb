package com.sc.entity;

import java.io.Serializable;

public class UserAddress implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4958474261308843612L;
	
	private Integer id;		//id
	private Integer userId;		//用户id
	private String province;	//省
	private String city;	//市
	private String region;		//区
	private String street;		//街道
	private String receiveName;		//接收人姓名
	private String receivePhone;	//接收人电话
	private Short isDefault;	//是否为默认地址
	
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
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getReceiveName() {
		return receiveName;
	}
	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}
	public String getReceivePhone() {
		return receivePhone;
	}
	public void setReceivePhone(String receivePhone) {
		this.receivePhone = receivePhone;
	}
	public Short getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Short isDefault) {
		this.isDefault = isDefault;
	}
	
	
	
	
}
