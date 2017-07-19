package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单表
 * @author OnlyMark
 *
 */
public class Order implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5028922837710728733L;
	
	private Integer id;		//id
	private Integer userId;		//用户id
	private Integer addressId;	//用户地址id
	private String orderNo;		//订单号
	private Short orderStatus;	//订单状态（-1：用户取消，0：未付款，1：已付款未发货，2：已发货，3：已收货）
	private Float allMoney;		//订单总金额
	private Float realMoney;	//订单实际金额
	private Float youhuiMoney;	//订单优惠金额
	private String youhuiReason;	//优惠原因
	private Date createTime;	//创建时间
	private Date payTime;	//付款时间
	private String tradingNum;	//微信支付回调查询
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
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Short getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Short orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Float getAllMoney() {
		return allMoney;
	}
	public void setAllMoney(Float allMoney) {
		this.allMoney = allMoney;
	}
	public Float getRealMoney() {
		return realMoney;
	}
	public void setRealMoney(Float realMoney) {
		this.realMoney = realMoney;
	}
	public Float getYouhuiMoney() {
		return youhuiMoney;
	}
	public void setYouhuiMoney(Float youhuiMoney) {
		this.youhuiMoney = youhuiMoney;
	}
	public String getYouhuiReason() {
		return youhuiReason;
	}
	public void setYouhuiReason(String youhuiReason) {
		this.youhuiReason = youhuiReason;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public String getTradingNum() {
		return tradingNum;
	}
	public void setTradingNum(String tradingNum) {
		this.tradingNum = tradingNum;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
