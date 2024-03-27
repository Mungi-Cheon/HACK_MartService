package person;

import java.util.ArrayList;
import paymentMethod.PaymentMethod;
import product.Product;
import service.Bill;
import service.Cart;
import service.Receipt;
import service.obj.ProductRow;


public class Customer implements Payable {

    private Person person;
    private PaymentMethod paymentMethod;
    private Cart cart;

    public Customer(Person person, PaymentMethod paymentMethod, Cart cart) {
        this.person = person;
        this.paymentMethod = paymentMethod;
        this.cart = cart;
    }

    public void putInCart(Product product, Integer quantity) {
        cart.contain(product, quantity);
    }

    @Override
    public Receipt pay(Bill bill) {
        ArrayList<ProductRow> productRows = bill.getProductRows();
        System.out.printf("\n%s 받았습니다, %s님.\n", paymentMethod.getName(), person.getName());
        return new Receipt(productRows, paymentMethod);
    }

    public Cart getCart() {
        return cart;
    }

    public void checkCart() {
        cart.show();
    }
}
