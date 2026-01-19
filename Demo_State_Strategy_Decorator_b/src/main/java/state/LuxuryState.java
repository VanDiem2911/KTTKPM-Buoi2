package state;

public class LuxuryState implements ProductState {
    @Override
    public void applyState(ProductContext context) {
        System.out.println("Sản phẩm xa xỉ – áp dụng thuế đặc biệt.");
    }
}
