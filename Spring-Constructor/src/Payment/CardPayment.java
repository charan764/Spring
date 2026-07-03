package Payment;

public class CardPayment implements PaymentGateway {
    @Override
    public void pay() {
        System.out.println("CardPayment Successfull");
    }
}

