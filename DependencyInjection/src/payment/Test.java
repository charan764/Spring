package payment;

import PaymentF.BeanFactory;
import com.amazon.Amazon;
import com.amazon.Flipkart;

public class Test {
    public static void main (String[] args) throws Exception {

        Amazon amazon = (Amazon) BeanFactory.getBean("amazon");
        PaymentGateway paymentGateway = (PaymentGateway) BeanFactory.getBean("payment");
        amazon.setPaymentGateway(paymentGateway);
        amazon.PlaceOrder();
        Flipkart flipkart = (Flipkart) BeanFactory.getBean("flipkart");
        PaymentGateway paymentGateway1 = (PaymentGateway) BeanFactory.getBean("payment1");
        flipkart.setPaymentGateway(paymentGateway1);
        flipkart.PlaceOrder();
    }

}


