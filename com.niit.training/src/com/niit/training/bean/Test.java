package com.niit.training.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Test {
	public static void displayAccountDetails(Account a)
	{
		System.out.println(a.getId());
		System.out.println(a.getName());
		
	}

	public static void display(Customer c)
	{
	
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getPassword());
		List accounts=c.getMyaccounts();
		Iterator it = accounts.iterator();
		
		while(it.hasNext()){
			Account a=(Account) it.next();
			displayAccountDetails(a);
			
		}
		
		
		}		
		
	public static void main(String[] args){
Customer c1=new Customer();
c1.setId("100");
c1.setName("cust1");
c1.setPassword("password");

Account ac=new Account();
ac.setId(123);
ac.setName("sbi");
List accounts=new ArrayList();
accounts.add(ac);
ac=new Account();
ac.setId(10005);
ac.setName("ramu");
accounts.add(ac);
c1.setMyaccounts(accounts);
Test.display(c1);



}
}