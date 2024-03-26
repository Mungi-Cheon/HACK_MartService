import java.util.ArrayList;
import java.util.Arrays;
import paymentMethod.Card;
import paymentMethod.Cash;
import person.Cashier;
import person.Customer;
import person.MarketWorker;
import person.Person;
import product.Egg;
import product.Milk;
import product.Product;
import thing.Bill;
import thing.Cart;
import thing.Receipt;

public class Main {

    public static void main(String[] args) {
        //객체 생성
        Product seoulMilk = new Milk("서울우유", 1000);
        Product maeilMilk = new Milk("매일우유", 1100);
        Product organicEgg = new Egg("유기농 계란", 8000);
        Person songa = new Person("송아");
        Person hoon = new Person("정훈");
        Person tae = new Person("경태");
        Cash cash = new Cash(20000);
        Card card = new Card();
        Cart cart = new Cart();
        Customer customer = new Customer(songa, card, cart);
        ArrayList<Product> products = new ArrayList<>(
            Arrays.asList(seoulMilk, maeilMilk, organicEgg));
        MarketWorker marketWorker = new MarketWorker(hoon);

        //상품 진열하기
        for (Product product : products) {
            marketWorker.addProduct2Shelf(product);
        }
        marketWorker.showShelfProducts();
        marketWorker.shelfSummary();

        //카트에 담기
        customer.putInCart(seoulMilk, 1);
        customer.putInCart(maeilMilk, 2);
        customer.putInCart(organicEgg, 1);
        Cashier cashier = new Cashier(tae);
//        Cashier cashier = new Cashier(new Kiosk("1"));
//        Cashier cashier = new Cashier(new Kiosk("2"));
        cart.view();

        //계산하기
        Bill bill = cashier.generateBill(cart);
        Receipt receipt = customer.pay(bill);
        receipt.printReceipt();
    }
}