package com.amazon;
import Payment.PaymentGateway;
public class Amazon {
   private PaymentGateway paymentGateway;
    public Amazon(PaymentGateway paymentGateway){
        this.paymentGateway=paymentGateway;
    }

    public void PlaceOrder(){
//        PaymentGateway pay1 = PaymentFactory.getPayment("Upi");

//        paymentGateway =pay1;
        paymentGateway.pay();

        System.out.println("Amazon Order Placed Successfully");
    }
}

