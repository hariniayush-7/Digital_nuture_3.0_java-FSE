package java_fse_CTS;

//Computer.java
public class Computer {
 // Required parameters
 private String CPU;
 private String RAM;
 private String storage;

 // Optional parameters
 private String graphicsCard;
 private String soundCard;
 private String monitor;

 // Private constructor to take the builder object
 private Computer(ComputerBuilder builder) {
     this.CPU = builder.CPU;
     this.RAM = builder.RAM;
     this.storage = builder.storage;
     this.graphicsCard = builder.graphicsCard;
     this.soundCard = builder.soundCard;
     this.monitor = builder.monitor;
 }

 // Getters
 public String getCPU() {
     return CPU;
 }

 public String getRAM() {
     return RAM;
 }

 public String getStorage() {
     return storage;
 }

 public String getGraphicsCard() {
     return graphicsCard;
 }

 public String getSoundCard() {
     return soundCard;
 }

 public String getMonitor() {
     return monitor;
 }

 @Override
 public String toString() {
     return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage + 
             ", GraphicsCard=" + graphicsCard + ", SoundCard=" + soundCard + 
             ", Monitor=" + monitor + "]";
 }

 // Static nested Builder class
 public static class ComputerBuilder {
     // Required parameters
     private String CPU;
     private String RAM;
     private String storage;

     // Optional parameters
     private String graphicsCard;
     private String soundCard;
     private String monitor;

     public ComputerBuilder(String CPU, String RAM, String storage) {
         this.CPU = CPU;
         this.RAM = RAM;
         this.storage = storage;
     }

     public ComputerBuilder setGraphicsCard(String graphicsCard) {
         this.graphicsCard = graphicsCard;
         return this;
     }

     public ComputerBuilder setSoundCard(String soundCard) {
         this.soundCard = soundCard;
         return this;
     }

     public ComputerBuilder setMonitor(String monitor) {
         this.monitor = monitor;
         return this;
     }

     public Computer build() {
         return new Computer(this);
     }
 }
}


