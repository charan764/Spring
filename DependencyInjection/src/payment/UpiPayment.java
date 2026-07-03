package payment;

public class UpiPayment implements PaymentGateway {
    @Override
    public void pay() {
        System.out.println("UpiPayment Successfull");
    }
}
