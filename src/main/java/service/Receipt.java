package service;

import paymentMethod.PaymentMethod;
import product.Product;

import java.util.StringJoiner;

public class Receipt implements Printable {

    private Products products;
    private PaymentMethod paymentMethod;

    public Receipt(Products products, PaymentMethod paymentMethod) {
        this.products = products;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void printReceipt() {
        int totalPrice = products.getTotalPrice();

        try {
            printDetails(totalPrice);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    private void printDetails(final int totalPrice) {
        System.out.println("\n🖨 영수증을 출력합니다.");
        System.out.printf("\n%-8s %5s %5s %5s\n", "상품명", "단가", "수량", "금액");
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");

        for (Product product : products.getValues()) {
            System.out.printf("%-10s %5d %5d %6d\n",
                    product.getName(),
                    product.getPrice(),
                    product.getQuantity(),
                    product.getUnitPrice());
        }

        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        System.out.printf("합   계 %24d\n", totalPrice);
        System.out.printf("결제방법 %23s\n", paymentMethod.getName());
    }
}