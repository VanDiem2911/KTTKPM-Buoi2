package decorator;
public class BasicPayment implements Payment {
    private double amount;

    public BasicPayment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return "Thanh toán cơ bản";
    }
}

