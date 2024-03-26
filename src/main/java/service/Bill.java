package service;

import java.util.ArrayList;
import service.obj.ProductRow;

public class Bill {

    private ArrayList<ProductRow> productRows;

    public Bill(ArrayList<ProductRow> productRows) {
        this.productRows = productRows;
    }

    public ArrayList<ProductRow> getProductRows() {
        return productRows;
    }
}

