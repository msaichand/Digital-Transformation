package com.niit.shoppingcart2.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart2.bean.category;

public class testcategory {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart2.bean");
		context.refresh();
		category category = (category)context.getBean("category");
		if(category==null)
		{
			System.out.println("category not created")	;
			}
		else
		{
			System.out.println("category  created");
		}

	}

}
