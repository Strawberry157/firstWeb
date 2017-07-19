package com.sc.controller.cms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/html/cms/page")
public class SysIntController {

	/**
	 * 后台管理主页面
	 * 需要登录
	 * @return
	 */
	@RequestMapping("/main")
	public ModelAndView main(ModelAndView mav){
		mav.setViewName("adminIndex");
		
		return mav;
	}
}
