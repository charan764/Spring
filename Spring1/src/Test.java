import Flipkart.Flipkart;
import Payment.PaymentGateway;
import Payment.Upipayment;

public class Test{
    public static void main(String[] args){
        PaymentGateway paymentGateway = new Upipayment();
        Flipkart flip = new Flipkart();
        flip.setPaymentGateway(paymentGateway);
        flip.placeorder();



    }
}
