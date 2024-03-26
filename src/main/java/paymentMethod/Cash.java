package paymentMethod;

public class Cash extends PaymentMethod {

    public Cash(int balance) {
        super(balance);
        isCash = true;
    }
}
