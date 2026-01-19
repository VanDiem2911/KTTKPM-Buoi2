package state;

public class ProcessingState implements OrderState {
    public void handle() {
        System.out.println("Đang xử lý: Đóng gói và vận chuyển");
    }
}
