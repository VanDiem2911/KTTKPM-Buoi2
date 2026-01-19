package state;

public class NormalState implements ProductState {
    @Override
    public void applyState(ProductContext context) {
        System.out.println("Sản phẩm bình thường.");
    }
}

