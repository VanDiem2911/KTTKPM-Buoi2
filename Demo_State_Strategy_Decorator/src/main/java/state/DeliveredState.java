package state;

public class DeliveredState implements OrderState {
    public void handle() {
        System.out.println("Đã giao: Cập nhật trạng thái đơn hàng");
    }
}
