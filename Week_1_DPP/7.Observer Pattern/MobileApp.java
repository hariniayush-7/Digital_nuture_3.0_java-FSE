package java_fse_CTS;

//MobileApp.java
public class MobileApp implements Observer {
 private String appName;

 public MobileApp(String appName) {
     this.appName = appName;
 }

 @Override
 public void update(String stockName, double stockPrice) {
     System.out.println(appName + " - Stock: " + stockName + " is now $" + stockPrice);
 }
}

//WebApp.java
 class WebApp implements Observer {
 private String appName;

 public WebApp(String appName) {
     this.appName = appName;
 }

 @Override
 public void update(String stockName, double stockPrice) {
     System.out.println(appName + " - Stock: " + stockName + " is now $" + stockPrice);
 }
}


