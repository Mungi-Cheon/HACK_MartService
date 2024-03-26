package person;

import product.Product;
import java.util.*;

public class MarketWorker {

    private List<Product> products2Display;
    private Person person;

    public MarketWorker(Person person) {
        this.person = person;
        products2Display = new ArrayList<>();
        System.out.printf("👦🏻 안녕하세요. 마트 직원 %s입니다.\n", person.getName());
        System.out.println();
    }

    public void addProduct2Shelf(Product product) {
        products2Display.add(product);
        System.out.printf("🫳🏻 %s 진열 중...\n", product.getName());
    }

    public void showShelfProducts() {
        System.out.println();
        System.out.println("📦 진열된 상품 목록입니다.");
        System.out.println();
        for (Product product : products2Display) {
            System.out.printf("• %s\n", product.getName());
        }
        System.out.println();
    }

    public void shelfSummary() {
        int totalTypes = products2Display.size();
        System.out.println("✅ 총 " + totalTypes + " 종류의 상품이 진열되었습니다.");
        System.out.println();
    }
}
