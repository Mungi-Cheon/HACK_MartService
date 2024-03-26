package thing;

// record로 표현 가능할 듯
public class ProductRow {

    private final String unitName;
    private final int unitPrice;
    private final int unitQuantity;
    private final int unitTotal;

    public ProductRow(String unitName, int unitPrice, int unitQuantity, int unitTotal) {
        this.unitName = unitName;
        this.unitPrice = unitPrice;
        this.unitQuantity = unitQuantity;
        this.unitTotal = unitTotal;
    }

    public String getUnitName() {
        return unitName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getUnitQuantity() {
        return unitQuantity;
    }

    public int getUnitTotal() {
        return unitTotal;
    }
}
