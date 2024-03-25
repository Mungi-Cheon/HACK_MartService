package thing;

public class Row { //만든 이유: Bill과 Receipt 모두에서 쓰기에 편하려고.

    private final String unitName;
    private final int unitPrice;
    private final int unitQuantity;
    private final int unitTotal;

    public Row(String unitName, int unitPrice, int unitQuantity, int unitTotal) {
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
