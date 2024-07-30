package java_fse_CTS;

//TestStrategyPattern.java
public class TestStrategyPattern {
 public static void main(String[] args) {
     PaymentContext context = new PaymentContext();

     // Paying with Credit Card
     PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe", "123", "12/24");
     context.setPaymentStrategy(creditCardPayment);
     context.executePayment(100.00);

     // Paying with PayPal
     PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "password");
     context.setPaymentStrategy(payPalPayment);
     context.executePayment(200.00);
 }
}


