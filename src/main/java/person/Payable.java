package person;

import thing.Bill;
import thing.Receipt;

public interface Payable {

    Receipt pay(Bill bill);
}
