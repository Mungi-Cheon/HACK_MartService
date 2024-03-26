package paymentMethod;

public abstract class PaymentMethod {

    protected boolean isCash;
    private int balance;
    private String name;

    public PaymentMethod() {
        this.name = "💳 카드";
    }

    public PaymentMethod(int balance) {
        this.balance = balance;
        this.name = "💰 현금";
    }

    public boolean isCash() {
        return isCash;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }


}
