package state;

public class PaymentContext {
    private PaymentState state;

    public PaymentContext() {
        state = new NewState();
    }

    public void setState(PaymentState state) {
        this.state = state;
        state.handle(this);
    }

    public void process() {
        state.handle(this);
    }
}
