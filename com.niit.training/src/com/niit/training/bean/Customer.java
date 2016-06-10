package com.niit.training.bean;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
	
	
	
	private List myaccounts=new ArrayList();
public List getMyaccounts() {
		return myaccounts;
	}
	public void setMyaccounts(List myaccounts) {
		this.myaccounts = myaccounts;
	}
private String shippingaddress;
private String permanentaddress;
public String getShippingaddress() {
	return shippingaddress;
}
public void setShippingaddress(String shippingaddress) {
	this.shippingaddress = shippingaddress;
}
public String getPermanentaddress() {
	return permanentaddress;
}
public void setPermanentaddress(String permanentaddress) {
	this.permanentaddress = permanentaddress;
}



}
