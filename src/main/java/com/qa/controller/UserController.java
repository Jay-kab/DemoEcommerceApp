package com.qa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qa.User;
import com.qa.service.UserService;

@Controller
public class UserController {

//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String login1(String username, String password) throws Exception {
//
//		System.out.println("inside login " + username + ",  " + password);
//
//		UserService userService = new UserService();
//
//		User loginStatus = userService.login(username, password);
//
//		if (loginStatus != null) {
//			return "welcome";
//
//		} else {
//			return "index";
//		}
//
//	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(String username, String password) throws Exception {
		
		System.out.println("Login Attempt! Username - " +username+", password = "+password);
		
		if (username.equals ("") || password.equals ("")) {
			
			ModelAndView modelAndView = new ModelAndView("index");
			modelAndView.addObject("loginErrorMessage", "Please input a field!");
			
			return modelAndView;
		}
		
		
		UserService userService = new UserService();
		
		User user = userService.login(username, password);
		
		if(user != null) {
			ModelAndView modelAndView = new ModelAndView("welcome");
			modelAndView.addObject("userData", user);
			
			return modelAndView;
		}
		else {
			ModelAndView modelAndView = new ModelAndView("index");
			modelAndView.addObject("loginErrorMessage", "Incorrect Credentials!! please try again");
			
			return modelAndView;
		}
	}

}
