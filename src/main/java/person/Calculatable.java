package person;

import service.Bill;
import service.Cart;

public interface Calculatable {

    Bill generateBill(Cart cart);
}
