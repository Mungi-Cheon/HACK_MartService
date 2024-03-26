import paymentMethod.Money;
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
        Product seoulMilk = new Milk("서울우유", 1000);
        Product maeilMilk = new Milk("매일우유", 1100);
        Product organicEgg = new Egg("유기농 계란", 8000);
        Person songa = new Person("송아");
        Person hoon = new Person("정훈");
        Person tae = new Person("경태");
        Money money = new Money(20000);
        Cart cart = new Cart();
        Customer customer = new Customer(songa, money, cart);

        MarketWorker marketWorker = new MarketWorker(hoon);
        marketWorker.addProduct2Shelf(seoulMilk);
        marketWorker.addProduct2Shelf(maeilMilk);
        marketWorker.addProduct2Shelf(organicEgg);
        marketWorker.showShelfProducts();
        marketWorker.shelfSummary();

        customer.putInCart(seoulMilk, 1);
        customer.putInCart(maeilMilk, 2);
        customer.putInCart(organicEgg, 1);
        Cashier cashier = new Cashier(tae);
//        Cashier cashier = new Cashier(new Kiosk("Siri"));
//        Cashier cashier = new Cashier(new Kiosk("빅스비"));
        cart.view();
        Bill bill = cashier.generateBill(cart);
        Receipt receipt = customer.pay(bill);
        receipt.printReceipt();

    }
}