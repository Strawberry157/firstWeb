package com.sc.service.base.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sc.entity.Hero;
import com.sc.service.base.LOLService;
@Service("LOLService")
public class LOLServiceImpl implements LOLService {

	@Override
	public List<Hero> search(String name, String price) {
		List<Hero> heros = new ArrayList<Hero>();
		Hero hero = new Hero();
		hero.setName("疾风剑豪   亚索");
		hero.setPrice(6300);
		heros.add(hero);
		return heros;
	}
}
