package person;

import java.util.ArrayList;
import java.util.Map;
import product.Product;
import service.Bill;
import service.Cart;
import service.obj.ProductRow;

public class Cashier implements Calculatable {

    private Person person;
    private Kiosk kiosk;
    private int totalPrice;
    private Calculatable calculatable;

    public Cashier(Person person) {
        System.out.printf("\n🙍‍ 안녕하세요. 계산원 %s입니다.\n", person.getName());

    }

    public Cashier(Kiosk kiosk) {
        this.kiosk = kiosk;
        System.out.println("\n🤖 " + kiosk.getModel() + "에서 계산을 도와드리겠습니다.\n");
    }

    @Override
    public Bill generateBill(Cart cart) {

        totalPrice = 0;
        Map<String, Product> map = cart.getProducts();
        ArrayList<ProductRow> productRows = new ArrayList<>();

        System.out.println("️🗒️ 결제하실 내역입니다.\n");
        System.out.printf("%-8s %5s %5s %5s\n", "상품명", "단가", "수량", "금액");
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");

        map.values().forEach(product -> {
            int unitTotal = product.getPrice() * product.getQuantity();
            System.out.printf("%-10s %5d %5d %6d\n", product.getName(), product.getPrice(),
                product.getQuantity(), unitTotal);
            totalPrice += unitTotal;

            ProductRow productRow = new ProductRow(product.getName(), product.getPrice(),
                product.getQuantity(), unitTotal);
            productRows.add(productRow);
        });

        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        System.out.printf("%-25s %d\n", "합 계", totalPrice);

        return new Bill(productRows);
    }
}
