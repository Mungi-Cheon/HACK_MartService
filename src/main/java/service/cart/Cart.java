package service.cart;

import product.Product;
import service.Products;

import java.util.Map;

public class Cart {

    private final Products products = new Products(); //"서울우유", Milk
    private int count = 0;
    private static final int MAX = 10;


    public void contain(Product product, int quantity) {
        if (count + quantity > MAX) {
            System.out.printf("\n🚫 상품은 최대 %d개까지 넣을 수 있습니다.\n", MAX);
            return;
        }

        String name = product.getName();
        this.count += quantity;
        products.addQuantity(name, product, quantity);

        System.out.printf("✚ %s (%d원) %d개가 카트에 추가되었습니다.\n(현재까지 %d / %d 개)\n", name,
                product.getPrice(), quantity, products.getTotalQuantity(), MAX);
    }

    public void show() {
        System.out.println("👜 카트 안의 모든 상품 목록입니다.\n");

        for (Map.Entry<String, Product> prod : products.getValue().entrySet()) {
            System.out.printf("• %s: %d개\n", prod.getKey(), prod.getValue().getQuantity());
        }
        System.out.println();
    }

    public Products getProducts() {
        return this.products;
    }
}
