package service;

import java.util.ArrayList;
import paymentMethod.PaymentMethod;
import service.obj.PaymentDetail;
import service.obj.ProductRow;

public class Receipt implements Printable {

    private ArrayList<ProductRow> productRows;
    private PaymentMethod paymentMethod;

    public Receipt(ArrayList<ProductRow> productRows, PaymentMethod paymentMethod) {
        this.productRows = productRows;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void printReceipt() {
        int paidAmount = paymentMethod.getBalance();
        int totalPrice = 0;

        System.out.println("🖨 영수증을 출력합니다.");
        System.out.println();
        System.out.printf("%-8s %5s %5s %5s\n", "상품명", "단가", "수량", "금액");
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");

        for (ProductRow productRow : productRows) {
            totalPrice += productRow.getUnitTotal();
            System.out.printf("%-10s %5d %5d %6d\n",
                productRow.getUnitName(),
                productRow.getUnitPrice(),
                productRow.getUnitQuantity(),
                productRow.getUnitTotal());
        }
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        System.out.printf("합   계 %24d\n", totalPrice);
        System.out.printf("결제방법 %23s\n", paymentMethod.getName());
        System.out.printf("받은금액 %24d\n", totalPrice);
        int change = 0;
        if (paymentMethod.isCash()) {
            change = paidAmount - totalPrice;
        }
        System.out.printf("거스름돈 %24d\n", change);
    }
}
