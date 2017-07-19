package com.sc.entity;

import java.io.Serializable;
/**
 * 模块管理
 * @author OnlyMark
 *
 */
public class Mokuai implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7830893656523537042L;
	
private Integer id;
	
	/** 模块名称 */
	private String mingcheng;
	
	/** 是否删除 */
	private Byte shanchu;
	
	/** 权限 */
	private Byte quanxian;
	
	/** 模块描述 */
	private String miaoshu;
	
	/** 模块父类id */
	private Integer parentId;
	
	/** 排序值 */
	private Byte paixu;
	
	/** 模块链接 */
	private String linkUrl;

	/** 是否被选中(用于页面展示) */
	private boolean xuanze = false;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMingcheng() {
		return mingcheng;
	}

	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}

	public Byte getShanchu() {
		return shanchu;
	}

	public void setShanchu(Byte shanchu) {
		this.shanchu = shanchu;
	}

	public Byte getQuanxian() {
		return quanxian;
	}

	public void setQuanxian(Byte quanxian) {
		this.quanxian = quanxian;
	}

	public String getMiaoshu() {
		return miaoshu;
	}

	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Byte getPaixu() {
		return paixu;
	}

	public void setPaixu(Byte paixu) {
		this.paixu = paixu;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public boolean isXuanze() {
		return xuanze;
	}

	public void setXuanze(boolean xuanze) {
		this.xuanze = xuanze;
	}
}
