package java_fse_CTS;

//PayPalGateway.java
public class PayPalGateway {
 public void makePayment(double amount) {
     System.out.println("Payment of $" + amount + " processed through PayPal.");
 }
}

//StripeGateway.java
class StripeGateway {
 public void pay(double amount) {
     System.out.println("Payment of $" + amount + " processed through Stripe.");
 }
}

//SquareGateway.java
class SquareGateway {
 public void doPayment(double amount) {
     System.out.println("Payment of $" + amount + " processed through Square.");
 }
}


