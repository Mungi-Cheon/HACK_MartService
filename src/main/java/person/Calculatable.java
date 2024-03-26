package person;

import thing.Bill;
import thing.Cart;

public interface Calculatable {

    Bill generateBill(Cart cart);
    default void test(){
        System.out.println("sss");
    }
}
