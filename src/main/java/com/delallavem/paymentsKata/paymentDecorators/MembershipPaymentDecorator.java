package com.delallavem.paymentsKata.paymentDecorators;

import com.delallavem.paymentsKata.Payment;

public class MembershipPaymentDecorator extends Decorator{

	public MembershipPaymentDecorator(Payment pay){
		super(pay);
	}

	@Override
	public Boolean proccess(){
		super.proccess();
		System.out.println("Activate Membership!!");
		//TODO - Code duplicated with UpgradeMembership.
		System.out.println("Activate Membership!!, email Send it to the owner");
		return true;
	}
}