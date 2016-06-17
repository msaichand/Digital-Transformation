package com.niit.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.webapp.dao.UserDAO;

@Controller

public class UserController {
@Autowired
UserDAO userDAO;
@RequestMapping("/isValidUser")
ModelAndView showmessage(@RequestParam(value="username") String name,
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

	ModelAndView mv=new ModelAndView("success");
	mv.addObject("message",message);
	mv.addObject("username",name);
	return mv;
}




}