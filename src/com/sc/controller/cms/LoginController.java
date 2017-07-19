package com.sc.controller.cms;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.sc.entity.Manager;
import com.sc.service.ManagerService;
import com.sc.utils.MD5Tool;

/**
 * 管理登录
 * @author FAN
 * @version 创建时间：2016-7-22下午2:05:57
 */

@Controller
@RequestMapping
public class LoginController {

	@Autowired
	ManagerService managerService;
	
	/**
	 * 管理员登录
	 * @param name
	 * @param psd
	 * @param request
	 * @param model
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping("/login")
	public String login(@RequestParam("name") String name,@RequestParam("psd") String psd,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
		Manager m = managerService.getByName(name);
		if(m != null){
			if(m.getPwd().equals(MD5Tool.MD5Encode32(psd))){
				session.setAttribute("managers_user", m);
				response.sendRedirect("/html/cms/page/main.action");
				return null;
			}else{
				request.setAttribute("error", "密码不正确");
			}
		}else{
			request.setAttribute("error", "用户名不存在");
		}
		return "/html/cms/adminLogin.jsp";
	}
	
	/**
	 * 退出登录,注销session
	 * @param response
	 * @param session
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/loginOut")
	public String loginOut(HttpServletResponse response,HttpSession session) throws IOException{
		session.removeAttribute("managers_user");
		response.sendRedirect("/html/cms/adminLogin.jsp");
		return null;
	}
}
