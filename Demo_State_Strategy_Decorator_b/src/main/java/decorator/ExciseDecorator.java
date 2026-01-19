package decorator;

public class ExciseDecorator extends TaxDecorator {

    public ExciseDecorator(Product product) {
        super(product);
    }

    public String getDescription() {
        return product.getDescription() + ", Thuế tiêu thụ đặc biệt 20%";
    }

    public double getPrice() {
        return product.getPrice() * 1.20;
    }
}
