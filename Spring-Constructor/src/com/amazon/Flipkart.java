package com.amazon;
import Payment.PaymentGateway;
public class Flipkart {
    private PaymentGateway paymentGateway;
    public Flipkart(PaymentGateway paymentGateway){
        this.paymentGateway=paymentGateway;
    }
    public void PlaceOrder(){
        //PaymentGateway pay1 = PaymentFactory.getPayment("Upi");

        //paymentGateway =pay1;
        paymentGateway.pay();

        System.out.println("Flipkart Order Placed Successfully");
    }
}



