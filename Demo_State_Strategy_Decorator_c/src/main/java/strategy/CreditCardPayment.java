package strategy;

public class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Thanh toán bằng Thẻ tín dụng: " + amount);
    }
}
