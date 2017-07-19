package com.sc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sc.dao.ManagerDao;
import com.sc.entity.Manager;
import com.sc.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService{

	@Autowired
	ManagerDao managerDao;
	
	@Override
	public Manager getByName(String name) {
		return managerDao.getByName(name);
	}

	@Override
	public void addUser(Manager m) {
		managerDao.addUser(m);
	}

	@Override
	public Manager findById(Integer id) {
		return managerDao.findById(id);
	}

	@Override
	public List<Manager> findByPage(Integer begin, Integer size) {
		return managerDao.findByPage(begin, size);
	}

	@Override
	public int findRows() {
		return managerDao.findRows();
	}

	@Override
	public void update(Manager m) {
		managerDao.update(m);
	}

}
