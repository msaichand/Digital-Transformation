package com.niit.shoppingmaven.controller;
import org.springframework.stereotype.Repository;
@Repository
	public class UserDAO {
		public boolean isValidUser(String username,String password)
		{
			if(username.equals("niit")&& password.equals("niit@123"))
			{
				return true;
				
			}
			else
			{
				return false;
			}
		}
}



