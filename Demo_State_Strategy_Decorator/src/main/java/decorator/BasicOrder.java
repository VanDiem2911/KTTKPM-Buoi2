package decorator;

public class BasicOrder implements OrderService {
    public double cost() {
        return 100;
    }
}
