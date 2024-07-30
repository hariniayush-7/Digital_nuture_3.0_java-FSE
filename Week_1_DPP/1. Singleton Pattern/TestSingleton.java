package java_fse_CTS;

//TestSingleton.java
public class TestSingleton {
 public static void main(String[] args) {
     // Get the single instance of Logger
     Logger logger1 = Logger.getInstance();
     Logger logger2 = Logger.getInstance();
     
     // Log messages using both references
     logger1.log("First message");
     logger2.log("Second message");
     
     // Verify if both references point to the same instance
     if (logger1 == logger2) {
         System.out.println("Both logger1 and logger2 refer to the same instance.");
     } else {
         System.out.println("logger1 and logger2 refer to different instances.");
     }
 }
}

