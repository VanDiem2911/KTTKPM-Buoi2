package state;

public class SuccessState implements PaymentState {
    public void handle(PaymentContext context) {
        System.out.println("Thanh toán thành công!");
    }
}
