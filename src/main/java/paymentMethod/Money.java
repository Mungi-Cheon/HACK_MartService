package paymentMethod;

public class Money extends PaymentMethod {

    public Money(int balance) {
        super(balance);

        isCash = true;
    }
}
