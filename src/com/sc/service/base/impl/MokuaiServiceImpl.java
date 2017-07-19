package com.sc.service.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.dao.base.MokuaiDao;
import com.sc.entity.Mokuai;
import com.sc.service.base.MokuaiService;

@Service("mokuaiService")
public class MokuaiServiceImpl implements MokuaiService {
	
	@Autowired
	private MokuaiDao mokuaiDao;
	
	/**
	 * 查所有可用模块
	 */
	public List<Mokuai> findAll(){
		List<Mokuai> mokuaiList = mokuaiDao.findAll();
		return mokuaiList;
	}
}
