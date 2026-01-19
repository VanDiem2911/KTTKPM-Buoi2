package decorator;

public class BasicProduct implements Product {
    private double price;

    public BasicProduct(double price) {
        this.price = price;
    }

    public String getDescription() {
        return "Sản phẩm cơ bản";
    }

    public double getPrice() {
        return price;
    }
}
