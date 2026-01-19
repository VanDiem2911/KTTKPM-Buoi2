package strategy;

public class FastShipping implements ShippingStrategy {
    public void ship() {
        System.out.println("Vận chuyển nhanh (1-2 ngày)");
    }
}