package com.delallavem.paymentsKata.paymentDecorators;

import com.delallavem.paymentsKata.Payment;

public class SendToAgentPaymentDecorator extends Decorator{

	public SendToAgentPaymentDecorator(Payment pay){
		super(pay);
	}

	@Override
	public Boolean proccess(){
		super.proccess();
		System.out.println("Commission payment send it to the agent!!");
		return true;
	}
}