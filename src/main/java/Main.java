import person.Cashier;
import person.Customer;
import person.Kiosk;
import person.MarketWorker;
import person.Person;
import product.*;
import thing.Bill;
import thing.Cart;

public class Main {

    public static void main(String[] args) {
        Cart myCart = new Cart();
        Product seoulMilk = new Milk("서울우유", 1000);
        Product maeilMilk = new Milk("매일우유", 1100);
        Product organicEgg = new Egg("유기농 계란", 8000);
        MarketWorker marketWorker = new MarketWorker();
        marketWorker.addProductToDisplay(seoulMilk);
        marketWorker.addProductToDisplay(maeilMilk);
        marketWorker.addProductToDisplay(organicEgg);
        marketWorker.showDisplayProductList();
        marketWorker.displaySummary();
        myCart.add(seoulMilk, 4);// Milk
        myCart.add(maeilMilk, 3);
        myCart.add(organicEgg, 1);
        myCart.add(seoulMilk, 1);// Milk
        myCart.add(maeilMilk, 1);
        System.out.println();
        myCart.view();

//  Cashier cashier = new Cashier(new Person("박경태"));
        Cashier cashier = new Cashier(new Kiosk());
        Bill bill = cashier.generateBill(myCart);
        Person moon = new Person("문영");
        Customer customer = new Customer(moon, myCart);
//        customer.pay(bill);

    }
}