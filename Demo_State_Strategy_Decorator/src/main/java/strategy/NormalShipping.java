package strategy;

public class NormalShipping implements ShippingStrategy {
    public void ship() {
        System.out.println("Vận chuyển thường (3-5 ngày)");
    }
}