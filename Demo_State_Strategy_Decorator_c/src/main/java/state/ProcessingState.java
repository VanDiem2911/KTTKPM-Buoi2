package state;

public class ProcessingState implements PaymentState {
    public void handle(PaymentContext context) {
        System.out.println("Đang xử lý thanh toán...");
        context.setState(new SuccessState());
    }
}
