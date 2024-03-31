package paymentMethod;

import service.Bill;

public class Cash implements PaymentMethod {

    private int balance;

    public Cash(int balance) {
        this.balance = balance;
    }

    @Override
    public String getName() {
        return "💰 현금";
    }

    @Override
    public void pay(final Bill bill) {
        validateEnoughMoneyForPurchase(bill.getTotalPrice());
        System.out.printf("받은금액 %24d\n", this.balance);
        System.out.printf("거스름돈 %24d\n", this.balance - bill.getTotalPrice());
    }

    @Override
    public void validateEnoughMoneyForPurchase(final int totalPrice) {
        if (balance < totalPrice) {
            int remainingBalance = totalPrice - this.balance;
            throw new IllegalArgumentException("받은 금액이 " + remainingBalance + "원 부족합니다.");
        }
    }
}
