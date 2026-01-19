package state;

public class CancelledState implements OrderState {
    public void handle() {
        System.out.println("Hủy: Hủy đơn và hoàn tiền");
    }
}
