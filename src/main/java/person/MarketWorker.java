package person;

import product.Product;
import java.util.*;

public class MarketWorker {

    private List<Product> products2Display;
    // To는 Map을 연상케하는 표현이라 여기선
    // displayingProductList, displayingProducts 와 같은 느낌이 더 좋을듯
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

        // 저번에 말씀드린 2 라는 말장난 표현은 프로젝트내의 컨벤션의 영향을 많이 받기때문에
        // 웬만하면 일반적인 표현을 쓰시는게 좋아요
    }

    public void showShelfProducts() {
        System.out.println();
        System.out.println("📦 진열된 상품 목록입니다.");
        System.out.println();
        products2Display.stream()
            .map(Product::getName)
            .forEach(name -> System.out.printf("• %s\n", name));
        System.out.println();
    }

    public void shelfSummary() { //동사로 변경
        int totalTypes = products2Display.size();
        System.out.println("✅ 총 " + totalTypes + " 종류의 상품이 진열되었습니다.");
        System.out.println();
    }
}
