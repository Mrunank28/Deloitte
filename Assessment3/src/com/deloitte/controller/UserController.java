package com.deloitte.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.deloitte.bean.User;
import com.deloitte.service.IUserService;

@Controller
public class UserController {
	
	IUserService userService = null;

	List<User> alist;

	@RequestMapping(value = "/checkLogin")
	public String Login(@RequestParam("pin") String pin, Model model) {
		System.out.println(pin);
		if (pin.equals("1234"))
			return "successLogin";
		else {
			return "loginFailed";
		}
	}

	@RequestMapping(value = "/displayUser.obj")
	public String showAllUsers(Model model) {
		alist = userService.getUserList();
		model.addAttribute("elist", alist);
		// System.out.println(alist);
		return "displayUser";
	}

	@RequestMapping(value = "/goHome.obj")
	public String goToHome(Model model) {
		return "index";
	}

}
