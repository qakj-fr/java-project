package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.User;
import com.qakj.crm.service.UserService;
@RequestMapping("/userController")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login")
	public Map<String,Object> login(@RequestParam("username") String username,@RequestParam("password") String password,HttpSession session){
		Map<String,Object> map = new HashMap<String, Object>();
		//判断，如果用户名和密码正确，响应消息，并且把user对象放入到session中
		User user = userService.getUserByUsernameAndPassword(username, password);
		if(user != null){
			session.setAttribute("user", user);
			map.put("code", "200");
			map.put("msg", "登录成功");
			return map;
		}
		map.put("code", "444");
		map.put("msg", "登录失败");
		//如果不正确，也要响应消息
		return map;
	}
	
	@RequestMapping("/user")
	public Object user(HttpSession session){
		Map<String,Object> map = new HashMap<String, Object>();
		Object user = session.getAttribute("user");
		if(user != null){
			map.put("code", "200");
			map.put("user", user);
			return map;
		}
		map.put("code", "444");
		return map;	
	}
	@RequestMapping("/logout")
	public Object logout(HttpSession session){
		session.invalidate();
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("code", "200");
		return map;
	}
	@RequestMapping("/updatePwd")
	public Object updatePwd(@RequestParam("id") Integer id,@RequestParam("password") String password){
		userService.updateUserById(id, password);
		return "200";
	}
	
	
}
