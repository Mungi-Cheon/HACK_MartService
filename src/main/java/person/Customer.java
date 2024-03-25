package person;

import paymentMethod.PaymentMethod;
import product.Product;
import thing.Bill;
import thing.Cart;
import thing.PaymentDetail;
import thing.Receipt;

public class Customer {

    private Person person;
    private PaymentMethod paymentMethod;
    private Cart cart;

    public Customer(Person person, PaymentMethod paymentMethod, Cart cart) {
        this.person = person;
        this.paymentMethod = paymentMethod;
        this.cart = cart;
    }

    public void putInCart(Product product, Integer quantity) {
        cart.add(product, quantity);
    }

    public Receipt pay(Bill bill) {
        //TODO: 예외처리, 에러처리

        PaymentDetail paymentDetail = new PaymentDetail(paymentMethod);
        return new Receipt(bill, paymentDetail);
    }
}
