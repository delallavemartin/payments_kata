package com.delallavem.paymentsKata;

public class RegularPayment implements Payment{
	
	private final String stuffs;

	RegularPayment(String stuffs){
		this.stuffs = stuffs;
	}

	@Override
	public Boolean proccess(){
		System.out.println(stuffs);
		return true;
	}
}
