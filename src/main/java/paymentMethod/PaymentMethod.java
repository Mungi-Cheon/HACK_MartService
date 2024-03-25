package paymentMethod;

import thing.Receipt;

public abstract class PaymentMethod {

    public int price;

    public PaymentMethod() { //카드

    }

    public PaymentMethod(int price) { //현금
        this.price = price;
    }

    public abstract Receipt transact();
}
