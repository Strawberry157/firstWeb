package com.sc.service.base;

import java.util.List;

import com.sc.entity.Mokuai;

public interface MokuaiService {
	/**
	 * 查所用可用模块
	 */
	public List<Mokuai> findAll();
}
