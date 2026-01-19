package decorator;

public class VATDecorator extends TaxDecorator {

    public VATDecorator(Product product) {
        super(product);
    }

    public String getDescription() {
        return product.getDescription() + ", VAT 10%";
    }

    public double getPrice() {
        return product.getPrice() * 1.10;
    }
}
