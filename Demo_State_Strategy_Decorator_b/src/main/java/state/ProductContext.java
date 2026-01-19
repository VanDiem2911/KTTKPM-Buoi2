package state;

public class ProductContext {
    private ProductState state;

    public void setState(ProductState state) {
        this.state = state;
        state.applyState(this);
    }
}

