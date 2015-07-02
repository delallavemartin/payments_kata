package com.delallavem.paymentsKata.paymentDecorators;

import com.delallavem.paymentsKata.Payment;

public abstract class Decorator implements Payment {
  private Payment pay; // 4. "has a" relationship

  public Decorator( Payment p ) {
    this.pay = p;
  }

  @Override
  public Boolean proccess() {
    pay.proccess();
    return true;
  }
}