package decorator;

public class FeeDecorator extends PaymentDecorator {

    public FeeDecorator(Payment payment) {
        super(payment);
    }

    public double getAmount() {
        return payment.getAmount() + 50;
    }

    public String getDescription() {
        return payment.getDescription() + " + Phí xử lý";
    }
}
