package com.tips.claim.stub.service;

public class ErrorInjector {
	
	public String concatNameWithNullPointerError(String name) {
		if(name.equals("Admin")) {
			return "Hello Admin";
		}
		return "Hello " + name;
	} 
	
	public int devideWithDivisionByZero(int num) {
		int num2 = 10;
		return num2/ num;
	} 	
	
	

}
