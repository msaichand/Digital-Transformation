package com.niit.shoppingmaven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
@Autowired
UserDAO userDAO;
@RequestMapping("/isValidUser")
ModelAndView showmessage(@RequestParam(value="name") String name,
@RequestParam(value="password")String password)
{
	System.out.println("In Controller");
    String message;
	if(userDAO.isValidUser(name, password))
	{
		message="valid credentials";
	}
	else 
	{
		message="invalid credentials";
	}

	ModelAndView mv = new ModelAndView("success");
	mv.addObject("message", message);
	mv.addObject("name", name);
	return mv;
	
}
@RequestMapping("/login")
public ModelAndView login()
{
	System.out.println("in controller");
	ModelAndView mv=new ModelAndView("login");
	return mv;
	
}
}