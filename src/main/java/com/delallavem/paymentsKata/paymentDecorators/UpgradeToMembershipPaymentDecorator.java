package com.delallavem.paymentsKata.paymentDecorators;

import com.delallavem.paymentsKata.Payment;

public class UpgradeToMembershipPaymentDecorator extends Decorator{

	public UpgradeToMembershipPaymentDecorator(Payment pay){
		super(pay);
	}

	@Override
	public Boolean proccess(){
		super.proccess();
		System.out.println("Upgrade Applied!!");
		return true;
	}
}