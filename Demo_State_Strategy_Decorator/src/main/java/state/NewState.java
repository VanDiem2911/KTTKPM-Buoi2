package state;

public class NewState implements OrderState {
    public void handle() {
        System.out.println("Mới tạo: Kiểm tra thông tin đơn hàng");
    }
}