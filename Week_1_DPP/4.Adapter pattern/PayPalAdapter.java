package java_fse_CTS;

//PayPalAdapter.java
public class PayPalAdapter implements PaymentProcessor {
 private PayPalGateway payPalGateway;

 public PayPalAdapter(PayPalGateway payPalGateway) {
     this.payPalGateway = payPalGateway;
 }

 @Override
 public void processPayment(double amount) {
     payPalGateway.makePayment(amount);
 }
}

//StripeAdapter.java
 class StripeAdapter implements PaymentProcessor {
 private StripeGateway stripeGateway;

 public StripeAdapter(StripeGateway stripeGateway) {
     this.stripeGateway = stripeGateway;
 }

 @Override
 public void processPayment(double amount) {
     stripeGateway.pay(amount);
 }
}

//SquareAdapter.java
 class SquareAdapter implements PaymentProcessor {
 private SquareGateway squareGateway;

 public SquareAdapter(SquareGateway squareGateway) {
     this.squareGateway = squareGateway;
 }

 @Override
 public void processPayment(double amount) {
     squareGateway.doPayment(amount);
 }
}
