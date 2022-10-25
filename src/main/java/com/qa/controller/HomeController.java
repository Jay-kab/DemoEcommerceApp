package com.qa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qa.User;
import com.qa.service.UserService;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String getHomePage() {

		return "index";
	}

	@RequestMapping("/registrationPage")
	public String registrationPage() {

		return "registration";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(User user) throws Exception {
	
	UserService uS = new UserService();
	
	uS.saveUsersInfo(user);
	
	ModelAndView modelAndView = new ModelAndView("index");
	modelAndView.addObject("registrationSuccessful", "Registration Successful, Please log in!");
	
	return modelAndView;


	}

}
