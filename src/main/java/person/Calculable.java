package person;

import service.Bill;
import service.cart.Cart;

public interface Calculable {

    default Bill generateBill(Cart cart) {
        introduce();
        return new Bill(cart.getProducts());
    }

    void introduce();
}

