package decorator;

public class LuxuryDecorator extends TaxDecorator {

    public LuxuryDecorator(Product product) {
        super(product);
    }

    public String getDescription() {
        return product.getDescription() + ", Thuế xa xỉ 30%";
    }

    public double getPrice() {
        return product.getPrice() * 1.30;
    }
}
