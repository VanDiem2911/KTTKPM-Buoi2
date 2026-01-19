import decorator.*;
import state.LuxuryState;
import state.ProductContext;
import strategy.TaxStrategy;
import strategy.VATTax;

public class Main {
    public static void main(String[] args) {

        // STATE
        ProductContext context = new ProductContext();
        context.setState(new LuxuryState());

        // DECORATOR (chồng thuế)
        Product product = new BasicProduct(1000);
        product = new VATDecorator(product);
        product = new ExciseDecorator(product);
        product = new LuxuryDecorator(product);

        System.out.println(product.getDescription());
        System.out.println("Giá sau thuế: " + product.getPrice());

        // STRATEGY (tính riêng từng thuế)
        TaxStrategy vat = new VATTax();
        System.out.println("VAT: " + vat.calculateTax(1000));
    }
}
