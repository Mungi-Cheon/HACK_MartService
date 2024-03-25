package person;
import product.Product;
import java.util.*;

public class MarketWorker {
    private List<Product> productListToDisplay;

    public MarketWorker(){
        productListToDisplay = new ArrayList<>();
    }

    public void addProductToDisplay(Product product) {
        productListToDisplay.add(product);
        System.out.println(product.getName()+ " 상품 진열을 준비합니다.");
    }

    public void showDisplayProductList() {
        System.out.println();
        System.out.println("진열할 상품 목록:");
        for (Product product : productListToDisplay) {
            System.out.println(product.getName());
        }
        System.out.println();
    }

    public void displaySummary() {
        int totalTypes = productListToDisplay.size();
        System.out.println("총 " + totalTypes + " 종류의 상품을 진열합니다.");
        System.out.println();
    }
}
