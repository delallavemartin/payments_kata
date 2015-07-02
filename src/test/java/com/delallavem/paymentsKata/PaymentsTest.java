package com.delallavem.paymentsKata;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.assertTrue;

import com.delallavem.paymentsKata.paymentDecorators.*;
import com.delallavem.paymentsKata.Payment;
import com.delallavem.paymentsKata.RegularPayment;

/**
 * Unit test for Payments Apps.
 */
public class PaymentsTest{
   
   	//Settings
	@Before
	public void setUp(){
		System.out.println("----------------START-----------------------");
	}

	@After
	public void tearDown(){
		System.out.println("----------------END-----------------------");
	}

	//Test Methods
    @Test
    public void testRegularPayment(){
        Payment payment = new RegularPayment("Stuffs related to Payment");
        assertTrue(payment.proccess());
    }

    @Test
    public void testPhysicalPayment(){
        Payment payment = new PhysicalPaymentDecorator(new RegularPayment("Stuffs related to Payment"));
        assertTrue(payment.proccess());
    }

    @Test
    public void testBookPayment(){
        Payment payment = new BookPaymentDecorator(new RegularPayment("Stuffs related to Payment"));
        assertTrue(payment.proccess());
    }

     @Test
    public void testMembershipPayment(){
        Payment payment = new MembershipPaymentDecorator(new RegularPayment("Stuffs related to Payment"));
        assertTrue(payment.proccess());
    }

    @Test
    public void testUpgradeToMembershipPayment(){
        Payment payment = new UpgradeToMembershipPaymentDecorator(new RegularPayment("Stuffs related to Payment"));
        assertTrue(payment.proccess());
    }

    @Test
    public void testVideoLToSkiPayment(){
        Payment payment = new VideoLToSkiPaymentDecorator(new RegularPayment("Stuffs related to Payment"));
        assertTrue(payment.proccess());
    }
}
