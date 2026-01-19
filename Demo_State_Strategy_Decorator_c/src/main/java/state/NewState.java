package state;

public class NewState implements PaymentState {
    public void handle(PaymentContext context) {
        System.out.println("Thanh toán mới được tạo");
        context.setState(new ProcessingState());
    }
}
