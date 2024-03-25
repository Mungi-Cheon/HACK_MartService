package paymentMethod;

public abstract class PaymentMethod {

    public int balance;

    public PaymentMethod() {
        System.out.println("💳 카드로 결제합니다.");
    }

    public PaymentMethod(int balance) {
        this.balance = balance;
        System.out.println("💰 현금으로 결제합니다.");
    }
}
