package model;

import state.OrderState;

public class Order {
    private OrderState state;

    public void setState(OrderState state) {
        this.state = state;
    }

    public void process() {
        state.handle();
    }
}
