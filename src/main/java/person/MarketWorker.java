package person;

import product.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MarketWorker {

    private List<Product> displayedProducts;
    private Person person;

    public MarketWorker(Person person) {
        this.person = person;
        displayedProducts = new ArrayList<>();
        System.out.printf("\n👦🏻 안녕하세요. 마트 직원 %s입니다.\n\n", person.getName());
    }

    public void display(Product... products) {
        Arrays.stream(products).forEach(product -> {
            displayedProducts.add(product);
            System.out.printf("🫳🏻 %s 진열 중...\n", product.getName());
        });
        showSummary();
    }

    private void showSummary() {
        int totalTypes = getCountOfProductKinds();
        System.out.println("\n✅ 총 " + totalTypes + " 종의 상품이 진열되었습니다.\n");
    }

    private int getCountOfProductKinds() {
        return (int) displayedProducts.stream()
                .map(Product::getName)
                .distinct()
                .count();
    }
}