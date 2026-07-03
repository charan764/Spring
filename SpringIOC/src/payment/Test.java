package payment;

import PaymentF.BeanFactory;
import com.amazon.Amazon;
import com.amazon.Flipkart;

public class Test {
    public static void main (String[] args) throws Exception {

        Amazon amazon = (Amazon) BeanFactory.getBean("amazon");
        amazon.PlaceOrder();
        Flipkart flipkart = (Flipkart) BeanFactory.getBean("flipkart");
        flipkart.PlaceOrder();
    }

}



