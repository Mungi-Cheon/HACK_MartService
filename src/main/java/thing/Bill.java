package thing;

import java.util.ArrayList;

public class Bill {

    private ArrayList<ProductRow> productRows;

    public Bill(ArrayList<ProductRow> productRows) {
        this.productRows = productRows;
    }

    public ArrayList<ProductRow> getRows() {
        return productRows;
    }
}

