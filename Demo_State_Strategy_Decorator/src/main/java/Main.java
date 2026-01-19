import decorator.BasicOrder;
import decorator.InsuranceDecorator;
import decorator.OrderService;
import decorator.PriorityDecorator;
import model.Order;
import state.*;
import strategy.FastShipping;
import strategy.ShippingContext;

public class Main {
    public static void main(String[] args) {

        // STATE
        Order order = new Order();
        order.setState(new NewState());
        order.process();
        order.setState(new ProcessingState());
        order.process();
        order.setState(new DeliveredState());
        order.process();

        // STRATEGY
        ShippingContext shipping = new ShippingContext();
        shipping.setStrategy(new FastShipping());
        shipping.execute();

        // DECORATOR
        OrderService orderService = new BasicOrder();
        orderService = new InsuranceDecorator(orderService);
        orderService = new PriorityDecorator(orderService);

        System.out.println("Tổng tiền đơn hàng: " + orderService.cost());
    }
}
