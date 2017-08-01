package com.sc.service.base;

import java.util.List;

import com.sc.entity.Hero;

public interface LOLService {

	List<Hero> search(String name, String price);

}
