package paymentMethod;

import service.Bill;

public interface PaymentMethod {

    String getName();

    void pay(Bill bill);

    void validateEnoughMoneyForPurchase(int totalPrice);
}
