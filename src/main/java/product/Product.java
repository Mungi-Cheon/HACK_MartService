package product;

public abstract class Product {

    private final String name;
    private final int price;
    private Integer quantity;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
            "name='" + name + '\'' +
            ", price=" + price +
            ", quantity=" + quantity +
            '}';
    }
}
