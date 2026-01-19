import decorator.BasicPayment;
import decorator.DiscountDecorator;
import decorator.FeeDecorator;
import decorator.Payment;
import state.PaymentContext;
import strategy.PaymentStrategy;
import strategy.PaypalPayment;

public class Main {
    public static void main(String[] args) {

        // DECORATOR
        Payment payment = new BasicPayment(1000);
        payment = new FeeDecorator(payment);
        payment = new DiscountDecorator(payment);

        System.out.println(payment.getDescription());
        System.out.println("Số tiền phải trả: " + payment.getAmount());

        // STRATEGY
        PaymentStrategy strategy = new PaypalPayment();
        strategy.pay(payment.getAmount());

        // STATE
        PaymentContext context = new PaymentContext();
        context.process();
    }
}
