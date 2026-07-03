package Payment;

public class Upipayment implements PaymentGateway{
    @Override
    public void pay() {
        System.out.println("UpiPayment Successfull");
    }
}
