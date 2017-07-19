package com.sc.entity;

import java.io.Serializable;
/**
 * 店铺表
 * @author OnlyMark
 *
 */
public class Shop implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8068605407109463357L;
	
	private Integer id;		//id
	private String name;	//商家名称
	private String address;	//商家地址
	private String tel;		//商家电话
	private String email;	//商家邮箱
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
