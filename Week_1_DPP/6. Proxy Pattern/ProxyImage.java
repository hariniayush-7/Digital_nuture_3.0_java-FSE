package java_fse_CTS;
//ProxyImage.java
public class ProxyImage implements Image {
 private String imageURL;
 private RealImage realImage;

 public ProxyImage(String imageURL) {
     this.imageURL = imageURL;
 }

 @Override
 public void display() {
     if (realImage == null) {
         realImage = new RealImage(imageURL); // Lazy initialization
     }
     realImage.display();
 }
}

