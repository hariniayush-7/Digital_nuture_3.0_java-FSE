package java_fse_CTS;

//StockMarket.java
import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
 private List<Observer> observers;
 private String stockName;
 private double stockPrice;

 public StockMarket(String stockName, double stockPrice) {
     this.stockName = stockName;
     this.stockPrice = stockPrice;
     this.observers = new ArrayList<>();
 }

 @Override
 public void registerObserver(Observer observer) {
     observers.add(observer);
 }

 @Override
 public void deregisterObserver(Observer observer) {
     observers.remove(observer);
 }

 @Override
 public void notifyObservers() {
     for (Observer observer : observers) {
         observer.update(stockName, stockPrice);
     }
 }

 public void setStockPrice(double stockPrice) {
     this.stockPrice = stockPrice;
     notifyObservers();
 }

 public String getStockName() {
     return stockName;
 }

 public double getStockPrice() {
     return stockPrice;
 }
}


