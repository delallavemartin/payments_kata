package com.delallavem.paymentsKata.paymentDecorators;

import com.delallavem.paymentsKata.Payment;

public class VideoLToSkiPaymentDecorator extends Decorator{

	public VideoLToSkiPaymentDecorator(Payment pay){
		super(pay);
	}

	@Override
	public Boolean proccess(){
		super.proccess();
		System.out.println("'First Aid' video added to Packing Slip!!");
		return true;
	}
}