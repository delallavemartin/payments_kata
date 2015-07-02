package com.delallavem.paymentsKata.paymentDecorators;

import com.delallavem.paymentsKata.Payment;

public class BookPaymentDecorator extends Decorator{

	public BookPaymentDecorator(Payment pay){
		super(pay);
	}

	@Override
	public Boolean proccess(){
		super.proccess();
		System.out.println("Packing Slip duplicated for Royalty Deparment!!");
		//TODO - Code duplicated with Physical.
		System.out.println("Commission payment send it to the agent!!");
		return true;
	}
}