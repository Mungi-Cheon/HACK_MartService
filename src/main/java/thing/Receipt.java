package thing;


import java.util.ArrayList;
import paymentMethod.Card;
import paymentMethod.Money;
import paymentMethod.PaymentMethod;

public class Receipt implements Printable {

    private Bill bill;
    private PaymentDetail paymentDetail;

    public Receipt(Bill bill, PaymentDetail paymentDetail) {
        this.bill = bill;
        this.paymentDetail = paymentDetail;
    }

    @Override
    public void printReceipt() {
        ArrayList<ProductRow> rows = bill.getRows();
        PaymentMethod paymentMethod = paymentDetail.getPaymentMethod();
        int paidAmount = paymentDetail.getPaymentMethod().balance;
        int totalPrice = 0;

        System.out.println("🖨 영수증을 출력합니다.");
        System.out.println();
        System.out.printf("%-8s %5s %5s %5s\n", "상품명", "단가", "수량", "금액");
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        for (ProductRow row : rows) {
            totalPrice += row.getUnitTotal();
//            System.out.println(row.getUnitName() + "    " + row.getUnitPrice() + "    "
//                + row.getUnitQuantity() + "    " + row.getUnitTotal());
            System.out.printf("%-10s %5d %5d %6d\n", row.getUnitName(), row.getUnitPrice(),
                row.getUnitQuantity(),
                row.getUnitTotal());
        }
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        System.out.printf("합   계 %24d\n", totalPrice);
        if (paymentMethod instanceof Card) {
            System.out.printf("결제방법 %22s\n", "💳카드");
            System.out.printf("받은금액 %22d\n", totalPrice);
            System.out.printf("거스름돈 %22d\n", 0);
        } else if (paymentMethod instanceof Money) {
            System.out.printf("결제방법 %23s\n", "💰현금");
            System.out.printf("받은금액 %24d\n", paidAmount);
            int change = paidAmount - totalPrice;
            System.out.printf("거스름돈 %24d\n", change);

        }
    }

}
