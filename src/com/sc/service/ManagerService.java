package com.sc.service;

import java.util.List;

import com.sc.entity.Manager;

public interface ManagerService {

public Manager getByName(String name);
	
	public void addUser(Manager m);
	
	public Manager findById(Integer id);
	 /**
	  * 分页查询资费
	  * page 当前的页码
	  * size 每页显示的行数
	  */
	public List<Manager> findByPage(Integer begin, Integer size);
	 /**
	  * 查询数据总行数 
	  */
	 public int  findRows();

	public void update(Manager m);
}
