package java_fse_CTS;
//TestProxyPattern.java
public class TestProxyPattern {
 public static void main(String[] args) {
     Image image1 = new ProxyImage("http://example.com/image1.jpg");
     Image image2 = new ProxyImage("http://example.com/image2.jpg");

     // Display images
     System.out.println("Displaying image1 for the first time:");
     image1.display(); // Loads and displays image1

     System.out.println("\nDisplaying image1 for the second time:");
     image1.display(); // Directly displays image1 (cached)

     System.out.println("\nDisplaying image2 for the first time:");
     image2.display(); // Loads and displays image2

     System.out.println("\nDisplaying image2 for the second time:");
     image2.display(); // Directly displays image2 (cached)
 }
}


