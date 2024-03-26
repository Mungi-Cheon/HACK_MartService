package person;

import service.Bill;
import service.Receipt;

public interface Payable {

    Receipt pay(Bill bill);
}
