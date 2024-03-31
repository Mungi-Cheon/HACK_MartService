package service;

import product.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Products {

    private Map<String, Product> value = new HashMap<>();

    public Products() {
    }

    public int getTotalPrice() {
        return value.values().stream()
                .mapToInt(Product::getUnitPrice)
                .sum();
    }

    public List<Product> getValues() {
        return this.value.values().stream().toList();
    }

    public Map<String, Product> getValue() {
        return this.value;
    }

    public void addQuantity(final String name, final Product product, final int quantity) {
        Product current = this.value.getOrDefault(name, product);
        current.setQuantity(quantity);
        value.put(name, current);
    }

    public int getTotalQuantity() {
        return this.value.values().stream().mapToInt(Product::getQuantity).sum();
    }
}
