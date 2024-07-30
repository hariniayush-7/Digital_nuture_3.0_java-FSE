package java_fse_CTS;
//RealImage.java
public class RealImage implements Image {
 private String imageURL;

 public RealImage(String imageURL) {
     this.imageURL = imageURL;
     loadImageFromServer();
 }

 private void loadImageFromServer() {
     System.out.println("Loading image from " + imageURL);
     // Simulate time taken to load image
     try {
         Thread.sleep(2000); // Simulate loading time
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
     System.out.println("Image loaded from " + imageURL);
 }

 @Override
 public void display() {
     System.out.println("Displaying image from " + imageURL);
 }
}


