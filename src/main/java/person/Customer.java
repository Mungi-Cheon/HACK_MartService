package person;

import java.util.ArrayList;
import paymentMethod.PaymentMethod;
import product.Product;
import thing.Bill;
import thing.Cart;
import thing.Receipt;
import thing.Row;

public class Customer {

    private Person person;
    private PaymentMethod paymentMethod;
    private Cart cart;

    public Customer(Person person, Cart cart) {
        this.person = person;
        this.cart = cart;
    }

    public Customer(Person person, PaymentMethod paymentMethod, Cart cart) {
        this.person = person;
        this.paymentMethod = paymentMethod;
        this.cart = cart;
    }

    public void putInCart(Product product, Integer quantity) {
        cart.add(product, quantity);
    }

    //TODO: 문기+문영+태민
    //TODO: 미완성
    //TODO: 리턴타입 Receipt로 나중에 변경
    public void pay(Bill bill) { //customer의 페이

        ArrayList<Row> rows = bill.getRows();
        int totalPrice = 0;
        for (Row row : rows) {
            totalPrice += row.getUnitTotal();
        }
        int paid = 0; //내가낸돈
        int change = paid - totalPrice;
        if (change < 0) {
            System.out.println("잔액이 부족합니다");
            ;
        }
//        Receipt receipt = paymentMethod.transact("뭔가넘겨야됌");

//        예외처리, 에러처리
//       return receipt;

        //Receipt한테 뭘 넘겨줄까..
    }
}
