package thing;

import java.util.ArrayList;
import paymentMethod.Card;
import paymentMethod.Money;
import paymentMethod.PaymentMethod;


public class Receipt implements Printable{
	ArrayList<Row> rows;
	PaymentMethod paymentMethod;


	public Receipt(ArrayList<Row> rows, PaymentMethod paymentMethod) {
		this.rows = rows;
		this.paymentMethod = paymentMethod;
	}

	@Override
	public void printReceipt() {

		int totalPrice = 0;

		System.out.println("상품명    단가    수량    금액");
		System.out.println("=========================");
		for (Row row : rows) {
			totalPrice += row.getUnitTotal();
			System.out.println(row.getUnitName() + "    " + row.getUnitPrice() + "    "
								+ row.getUnitQuantity() + "    " + row.getUnitTotal());
		}
		System.out.println("=========================");
		System.out.println("합   계               " + totalPrice);
		if (paymentMethod instanceof Card) {
			System.out.println("결제 방법              " + "카드");
			System.out.println("받은 금액              " + totalPrice);
			System.out.println("거스름돈               " + "0");
		} else if (paymentMethod instanceof Money) {
			System.out.println("결제 방법              " + "현금");
			System.out.println("받은 금액              " + paymentMethod.price);
			int chanhe = ((Money) paymentMethod).price - totalPrice;
			System.out.println("거스름돈               " + chanhe);

		}
	}

}
