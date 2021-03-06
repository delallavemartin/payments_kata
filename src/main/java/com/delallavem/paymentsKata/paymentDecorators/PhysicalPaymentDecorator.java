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
		return true;
	}
}