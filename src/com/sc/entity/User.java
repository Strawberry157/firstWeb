package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * @author OnlyMark
 *
 */
public class User implements Serializable{
	
	private static final long serialVersionUID = -6021132121794621985L;

	private Integer id;	//id
	private String telephone;	//电话
	private Date regTime;	//注册时间
	private String wxOpenid;	//微信openid
	private String wxHeadimgurl;//微信头像图像url
	private String nickname;	//微信昵称
	private Date lastTime;	//最后登录时间
	private String lastIp;	//最后登录ip
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Date getRegTime() {
		return regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	public String getWxOpenid() {
		return wxOpenid;
	}
	public void setWxOpenid(String wxOpenid) {
		this.wxOpenid = wxOpenid;
	}
	public String getWxHeadimgurl() {
		return wxHeadimgurl;
	}
	public void setWxHeadimgurl(String wxHeadimgurl) {
		this.wxHeadimgurl = wxHeadimgurl;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Date getLastTime() {
		return lastTime;
	}
	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}
	public String getLastIp() {
		return lastIp;
	}
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}
	
	
}
