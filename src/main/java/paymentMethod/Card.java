package paymentMethod;

import service.Bill;

public class Card implements PaymentMethod {

    private int limit;

    public Card() {
        this.limit = 30_0000;
    }

    @Override
    public String getName() {
        return "카드";
    }


    @Override
    public void pay(final Bill bill) {
        validateEnoughMoneyForPurchase(bill.getTotalPrice());
        System.out.printf("승인번호 %24d\n", (int) (Math.random() * 899999) + 100000);
    }

    @Override
    public void validateEnoughMoneyForPurchase(final int totalPrice) {
        if (totalPrice > limit) {
            int remainingBalance = totalPrice - this.limit;
            throw new IllegalArgumentException("받은 금액이 " + remainingBalance + "원 부족합니다.");
        }
    }
}
