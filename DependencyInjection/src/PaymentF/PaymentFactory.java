package PaymentF;

import payment.CardPayment;
import payment.PaymentGateway;
import payment.UpiPayment;

public class PaymentFactory {

    public static PaymentGateway getPayment(String type){

        if(type.equalsIgnoreCase("Card")){
            return new CardPayment();
        } else if (type.equalsIgnoreCase("Upi")) {
            return new UpiPayment();
        }
        else {
            return null;
        }
    }
}

