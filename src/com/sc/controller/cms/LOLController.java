package com.sc.controller.cms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sc.entity.Hero;
import com.sc.service.base.LOLService;


@Controller
@RequestMapping("/html/cms/lol")
public class LOLController {
	
	@Autowired
	LOLService lolService;
	
	
	@RequestMapping("/lolsearch")
	public String search(@RequestParam("name") String name,@RequestParam("price") String price,Model mav){
		
		List<Hero> heros = lolService.search(name,price);
		mav.addAttribute("respose", "ture");
		mav.addAttribute("hero0",heros.get(0));
		return "hero.jsp";
	}
}
