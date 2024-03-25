package person;

import java.util.ArrayList;
import java.util.Map;
import product.Product;
import thing.Bill;
import thing.Cart;
import thing.ProductRow;

public class Cashier implements Calculatable {

    private Person person;
    private Kiosk kiosk;
    private int totalPrice;
    private Calculatable calculatable;

    public Cashier(Person person) {
        System.out.printf("🙍‍ 안녕하세요. 계산원 %s입니다.\n", person.getName());
        System.out.println();
    }

    public Cashier(Kiosk kiosk) {
        this.kiosk = kiosk; //받아주기만 함.
        System.out.println("🤖 키오스크에서 계산을 도와드리겠습니다.");
        System.out.println();
    }

    @Override
    public Bill generateBill(Cart cart) {
        totalPrice = 0;
        Map<String, Product> map = cart.getProducts();
        ArrayList<ProductRow> productRows = new ArrayList<>();

        System.out.printf("%-8s %5s %5s %5s\n", "상품명", "단가", "수량", "금액");
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        for (Map.Entry<String, Product> product : map.entrySet()) {
            //TODO: 밑의 꺼 한줄로 구현 가능 stream 람다로. row를 어떻게 녹일지 고려할 것.
            String unitName = product.getValue().getName();
            int unitPrice = product.getValue().getPrice();
            int unitQuantity = product.getValue().getQuantity();
            int unitTotal = unitPrice * unitQuantity;
            //TODO 여기까지^
            totalPrice += unitTotal;

            System.out.printf("%-10s %5d %5d %6d\n", unitName, unitPrice, unitQuantity,
                unitTotal);

            ProductRow productRow = new ProductRow(unitName, unitPrice, unitQuantity, unitTotal);
            productRows.add(productRow);
        }

        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        System.out.printf("%-25s %d\n", "합 계", totalPrice);
        System.out.println();

        return new Bill(productRows);
    }

}
