import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import paymentMethod.Card;
import paymentMethod.Cash;
import person.Cashier;
import person.Customer;
import person.Kiosk;
import person.MarketWorker;
import person.Person;
import product.Egg;
import product.Milk;
import product.Product;
import service.Bill;
import service.Cart;
import service.Receipt;

public class Main {

    public static void main(String[] args) {
        Person hoon = new Person("정훈");
        MarketWorker marketWorker = new MarketWorker(hoon);

        Product seoulMilk = new Milk("서울우유", 1000);
        Product maeilMilk = new Milk("매일우유", 1100);
        Product organicEgg = new Egg("유기농 계란", 8000);

        List<Product> products = Arrays.asList(seoulMilk, maeilMilk, organicEgg);
        marketWorker.display(products);
        marketWorker.showSummary();

        Person songa = new Person("송아");
//        Cash cash = new Cash(20000);
//        Customer customer = new Customer(songa, cash, new Cart());
        Customer customer = new Customer(songa, new Card(), new Cart());

        customer.putInCart(seoulMilk, 1);
        customer.putInCart(maeilMilk, 2);
        customer.putInCart(organicEgg, 1);

//        Person tae = new Person("경태");
//        Cashier cashier = new Cashier(tae);
        Cashier cashier = new Cashier(new Kiosk(1));
        customer.checkCart();

        Bill bill = cashier.generateBill(customer.getCart());
        Receipt receipt = customer.pay(bill);
        receipt.printReceipt();
    }
}