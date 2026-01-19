package state;

public class PromotionState implements ProductState {
    @Override
    public void applyState(ProductContext context) {
        System.out.println("Sản phẩm khuyến mãi – giảm thuế.");
    }
}
