package Flipkart;

import Payment.PaymentGateway;

public class Flipkart {
    PaymentGateway paymentGateway;
    public void setPaymentGateway(PaymentGateway paymentGateway){
        this.paymentGateway=paymentGateway;
    }
    public void placeorder(){
        paymentGateway.pay();
        System.out.println("order has been placed sucessfully");
    }
}
