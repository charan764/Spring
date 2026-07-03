package com.app;

import payment.Payment;

public class PaymentFactory {
    private Payment payment;

    public PaymentFactory(Payment paymnet){
        System.out.println("Target class");
        this.payment=paymnet;
        System.out.println("Dependent class");
    }
    public void Placeorder(){
        System.out.println("RCB Match watched  Successfully");
        payment.pay();
    }

}
