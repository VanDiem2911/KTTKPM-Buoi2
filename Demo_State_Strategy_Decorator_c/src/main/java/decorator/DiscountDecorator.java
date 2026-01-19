package decorator;

public class DiscountDecorator extends PaymentDecorator {

    public DiscountDecorator(Payment payment) {
        super(payment);
    }

    public double getAmount() {
        return payment.getAmount() - 100;
    }

    public String getDescription() {
        return payment.getDescription() + " + Mã giảm giá";
    }
}
