package state;

public class FailedState implements PaymentState {
    public void handle(PaymentContext context) {
        System.out.println("Thanh toán thất bại!");
    }
}
