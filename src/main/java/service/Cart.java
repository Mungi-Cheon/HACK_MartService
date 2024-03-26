package service;

import java.util.HashMap;
import java.util.Map;
import product.Product;

public class Cart {

    private static final Map<String, Product> map = new HashMap<>(); //"서울우유", Milk
    private int count = 0;

    public void add(Product product, int quantity) {

        int max = 10;
        if (count + quantity > max) {
            System.out.printf("🚫 상품은 최대 %d개까지 넣을 수 있습니다.\n", max);
            return;
        }

        String name = product.getName();
        Product current;
        current = map.getOrDefault(name, product);
        current.setQuantity(quantity);
        count += quantity;
        map.put(name, current);

        System.out.printf("✚ %s (%d원) %d개가 카트에 추가되었습니다. (현재까지 %d / %d 개)\n", product.getName(),
            product.getPrice(), quantity, count, max);
    }

    public void view() {
        System.out.println("👜 카트 안의 모든 상품 목록입니다.");
        System.out.println();
        for (Map.Entry<String, Product> prod : map.entrySet()) {
            System.out.printf("• %s: %d개\n", prod.getKey(), prod.getValue().getQuantity());
        }
        System.out.println();
    }

    public Map<String, Product> getProducts() {
        return map;
    }
}
