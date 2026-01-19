package decorator;

public class PriorityDecorator extends OrderDecorator {
    public PriorityDecorator(OrderService order) {
        super(order);
    }

    public double cost() {
        return order.cost() + 30;
    }
}