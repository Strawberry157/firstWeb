package com.sc.controller.cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sc.service.ManagerService;

@Controller
@RequestMapping("/html/cms/page")
public class SysIntController {
	/**
	 * 后台管理主页面
	 * 需要登录
	 * @return
	 */
	@RequestMapping("/main")
	public String main(Model model){
		return "adminIndex";
	}
}
