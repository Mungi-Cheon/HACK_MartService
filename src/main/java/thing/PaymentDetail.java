package thing;

import paymentMethod.PaymentMethod;

public class PaymentDetail {

    private int paidAmount;
    private PaymentMethod paymentMethod;

    public PaymentDetail(int paidAmount, PaymentMethod paymentMethod) {
        this.paidAmount = paidAmount;
        this.paymentMethod = paymentMethod;
    }

    public int getPaid() {
        return paidAmount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
}
