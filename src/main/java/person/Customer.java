package person;

import java.util.ArrayList;
import paymentMethod.PaymentMethod;
import product.Product;
import thing.Bill;
import thing.Cart;
import thing.PaymentDetail;
import thing.ProductRow;
import thing.Receipt;

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
        cart.add(product, quantity);
    }

    @Override
    public Receipt pay(Bill bill) {
        ArrayList<ProductRow> productRows = bill.getProductRows();
        PaymentDetail paymentDetail = new PaymentDetail(paymentMethod);
//
//        System.out.println(paymentDetail.getPaymentMethod().getName() + "로 결제합니다.");
        return new Receipt(productRows, paymentDetail);
    }
}
