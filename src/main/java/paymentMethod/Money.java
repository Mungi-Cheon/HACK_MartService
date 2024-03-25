package paymentMethod;

import thing.Receipt;

public class Money extends PaymentMethod {

    public Money(int balance) {
        super(balance);
    }

    @Override
    public Receipt transact() {

        //뺄셈 계산 로직
        return null;
    }


}
