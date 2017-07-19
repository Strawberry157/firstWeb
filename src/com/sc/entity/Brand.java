package com.sc.entity;

import java.io.Serializable;
/**
 * 品牌表
 * @author OnlyMark
 *
 */
public class Brand implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7120236693355984831L;
	
	private Integer id;		//id
	private String name;	//品牌名称
	private String sname;	//品牌名称（简）
	private String imgUrl;	//图片url
	private String description;	//品牌描述
	private Short isDel;	//是否删除
	private Integer sequence;	//排序
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Short getIsDel() {
		return isDel;
	}
	public void setIsDel(Short isDel) {
		this.isDel = isDel;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	
	
	
	
}
