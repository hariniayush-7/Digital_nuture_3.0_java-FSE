package java_fse_CTS;

//TestBuilderPattern.java
public class TestBuilderPattern {
 public static void main(String[] args) {
     // Create a computer with only required attributes
     Computer basicComputer = new Computer.ComputerBuilder("Intel i5", "8GB", "256GB SSD").build();
     System.out.println(basicComputer);

     // Create a computer with all attributes
     Computer gamingComputer = new Computer.ComputerBuilder("Intel i9", "32GB", "1TB SSD")
             .setGraphicsCard("NVIDIA RTX 3080")
             .setSoundCard("Creative Sound Blaster")
             .setMonitor("Dell 27-inch 4K")
             .build();
     System.out.println(gamingComputer);

     // Create a computer with some optional attributes
     Computer workComputer = new Computer.ComputerBuilder("Intel i7", "16GB", "512GB SSD")
             .setMonitor("HP 24-inch Full HD")
             .build();
     System.out.println(workComputer);
 }
}


