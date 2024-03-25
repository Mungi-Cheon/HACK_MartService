package thing;

import paymentMethod.PaymentMethod;

public class PaymentDetail {

    private PaymentMethod paymentMethod;

    public PaymentDetail(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
}
