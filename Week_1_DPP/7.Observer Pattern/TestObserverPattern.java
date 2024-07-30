package java_fse_CTS;

//TestObserverPattern.java
public class TestObserverPattern {
 public static void main(String[] args) {
     StockMarket googleStock = new StockMarket("Google", 1500.00);

     Observer mobileApp1 = new MobileApp("MobileApp1");
     Observer mobileApp2 = new MobileApp("MobileApp2");
     Observer webApp1 = new WebApp("WebApp1");

     googleStock.registerObserver(mobileApp1);
     googleStock.registerObserver(mobileApp2);
     googleStock.registerObserver(webApp1);

     System.out.println("Initial Stock Price: $" + googleStock.getStockPrice());
     googleStock.notifyObservers();

     System.out.println("\nUpdating Stock Price to $1600.00");
     googleStock.setStockPrice(1600.00);

     System.out.println("\nDeregistering MobileApp1 and updating Stock Price to $1700.00");
     googleStock.deregisterObserver(mobileApp1);
     googleStock.setStockPrice(1700.00);
 }
}

