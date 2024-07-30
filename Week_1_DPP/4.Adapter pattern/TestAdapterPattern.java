package java_fse_CTS;

//TestAdapterPattern.java
public class TestAdapterPattern {
 public static void main(String[] args) {
     // Using PayPal through adapter
     PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalGateway());
     payPalProcessor.processPayment(100.0);

     // Using Stripe through adapter
     PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
     stripeProcessor.processPayment(200.0);

     // Using Square through adapter
     PaymentProcessor squareProcessor = new SquareAdapter(new SquareGateway());
     squareProcessor.processPayment(300.0);
 }
}


