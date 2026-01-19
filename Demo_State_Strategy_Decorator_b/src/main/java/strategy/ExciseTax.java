package strategy;

public class ExciseTax implements TaxStrategy {
    public double calculateTax(double price) {
        return price * 0.20; // 20%
    }
}
