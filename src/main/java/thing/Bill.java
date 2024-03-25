package thing;

import java.util.ArrayList;

public class Bill {

    private ArrayList<Row> rows;

    public Bill(ArrayList<Row> rows) {
        this.rows = rows;
    }

    public ArrayList<Row> getRows() {
        return rows;
    }
}

