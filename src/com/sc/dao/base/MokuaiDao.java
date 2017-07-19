package com.sc.dao.base;

import java.util.List;

import com.sc.entity.Mokuai;

public interface MokuaiDao {
	/**
	 * 查所有可用模块
	 * @return
	 */
	public List<Mokuai> findAll();

}
