import paymentMethod.Card;
import paymentMethod.PaymentMethod;
import person.*;
import product.Egg;
import product.Milk;
import product.Product;
import service.Bill;
import service.Receipt;
import service.cart.Cart;

public class Main {

    public static void main(String[] args) {
        Person hoon = new Person("정훈");
        MarketWorker marketWorker = new MarketWorker(hoon);

        Product seoulMilk = new Milk("서울우유", 800);
        Product maeilMilk = new Milk("서울우유", 700);
        Product organicEgg = new Egg("유기농 계란", 2000);

        marketWorker.display(seoulMilk, maeilMilk, organicEgg);

        Person songa = new Person("송아");
//        PaymentMethod cash = new Cash(10000);
        PaymentMethod card = new Card();
//        Customer customer = new Customer(songa, cash, new Cart());
        Customer customer = new Customer(songa, card, new Cart());

        customer.putInCart(seoulMilk, 1);
        customer.putInCart(maeilMilk, 4);
        customer.putInCart(organicEgg, 5);

        Person tae = new Person("경태");
        Calculable calculable = new Cashier(tae);
//        Cashier cashier = new Kiosk(1);
        customer.checkCart();

        Bill bill = calculable.generateBill(customer.getCart());

        Receipt receipt = customer.pay(bill);
        receipt.printReceipt();
    }
}