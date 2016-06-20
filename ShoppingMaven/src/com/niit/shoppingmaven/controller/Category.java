package com.niit.shoppingmaven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Category {
	@Autowired
	private  UserDAO userDAO;
	@RequestMapping("/addCategory")
	public ModelAndView addCategory(@RequestParam(value="categoryName") String categoryname,
			@RequestParam(value="CategoryDescription")String categoryDescription){
		System.out.println("addCategory");
		String message ="successfully created";
		ModelAndView mv=new ModelAndView("success");
		mv.addObject("message,message");
		return mv;
	}

}
