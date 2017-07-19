package com.sc.entity;

import java.util.Date;

public class Manager {

	private Integer id;
	private String name;
	private String pwd;
	private Date regTime;
	/**
	 * 管理员类型,后台管理权限 1 管理员  2 超级管理员
	 */
	private Short type;
	/**
	 * 是否锁定 0 否  1 是
	 */
	private Short isLock;
	
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getRegTime() {
		return regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	public Short getType() {
		return type;
	}
	public void setType(Short type) {
		this.type = type;
	}
	public Short getIsLock() {
		return isLock;
	}
	public void setIsLock(Short isLock) {
		this.isLock = isLock;
	}
}
