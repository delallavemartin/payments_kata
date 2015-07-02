package com.delallavem.paymentsKata.paymentDecorators;

import com.delallavem.paymentsKata.Payment;

public class PhysicalPaymentDecorator extends Decorator{

	public PhysicalPaymentDecorator(Payment pay){
		super(pay);
	}

	@Override
	public Boolean proccess(){
		super.proccess();
		System.out.println("Packing Slip generated for Shipping!!");
		//TODO - Code duplicated with Book.
		System.out.println("Commission payment send it to the agent!!");
		return true;
	}
}