package com.amazon;
import payment.PaymentGateway;
public class Flipkart {
    PaymentGateway paymentGateway= null;
    public void setPaymentGateway(PaymentGateway paymentGateway){
        this.paymentGateway=paymentGateway;
    }
    public void PlaceOrder(){
//        PaymentGateway pay1 = PaymentFactory.getPayment("Upi");

//        paymentGateway =pay1;
        paymentGateway.pay();

        System.out.println("Flipkart Order Placed Successfully");
    }
}

