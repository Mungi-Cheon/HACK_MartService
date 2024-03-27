package person;

import product.Product;
import java.util.*;

public class MarketWorker {

    private List<Product> displayedProducts;
    private Person person;

    public MarketWorker(Person person) {
        this.person = person;
        displayedProducts = new ArrayList<>();
        System.out.printf("👦🏻 안녕하세요. 마트 직원 %s입니다.\n", person.getName());
        System.out.println();
    }

    public void display(List<Product> products) {
        products.forEach(this::display);
    }

    public void display(Product product) {
        displayedProducts.add(product);
        System.out.printf("🫳🏻 %s 진열 중...\n", product.getName());
    }

    public void showSummary() {
        int totalTypes = displayedProducts.size();
        System.out.println("\n✅ 총 " + totalTypes + " 종의 상품이 진열되었습니다.");
        System.out.println();
    }
}
