package com.sc.entity;

import java.util.List;

public class Hero {
	private String name;
	private String img;
	private int price;
	private List<String> skin;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<String> getSkin() {
		return skin;
	}
	public void setSkin(List<String> skin) {
		this.skin = skin;
	}
}
