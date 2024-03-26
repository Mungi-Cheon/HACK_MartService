package paymentMethod;

public abstract class PaymentMethod {

    public int balance;
    protected boolean isCash;
    private String name;

    public PaymentMethod() {
        this.name = "카드";
    }

    public PaymentMethod(int balance) {
        this.balance = balance;
        this.name = "현금";
    }

    public String getName() {
        return name;
    }

    public boolean isCash() {
        return isCash;
    }
}
