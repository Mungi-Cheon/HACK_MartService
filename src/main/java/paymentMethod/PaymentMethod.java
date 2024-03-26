package paymentMethod;

public abstract class PaymentMethod {

    // 불필요한 로직은 주석처리보다 삭제
    private String name;
    public int balance;

    protected boolean isCash;

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
