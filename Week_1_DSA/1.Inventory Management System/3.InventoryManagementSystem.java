package java_fse_CTS;
import java.util.Scanner;
public class InventoryManagementSystem {
	    	    public static void main(String[] args) {
	    	        Scanner scanner = new Scanner(System.in);
	    	        Inventory inventory = new Inventory();

	    	        System.out.println("Enter the number of products to add:");
	    	        int numberOfProducts = scanner.nextInt();
	    	        scanner.nextLine();  // Consume newline

	    	        String[] productIds = new String[numberOfProducts];
	    	        String[] productNames = new String[numberOfProducts];
	    	        int[] quantities = new int[numberOfProducts];
	    	        double[] prices = new double[numberOfProducts];

	    	        for (int i = 0; i < numberOfProducts; i++) {
	    	            System.out.println("Enter details for product " + (i + 1) + ":");
	    	            System.out.print("Product ID: ");
	    	            productIds[i] = scanner.nextLine();
	    	            System.out.print("Product Name: ");
	    	            productNames[i] = scanner.nextLine();
	    	            System.out.print("Quantity: ");
	    	            quantities[i] = scanner.nextInt();
	    	            System.out.print("Price: ");
	    	            prices[i] = scanner.nextDouble();
	    	            scanner.nextLine();  // Consume newline
	    	        }

	    	        // Add products to inventory
	    	        for (int i = 0; i < numberOfProducts; i++) {
	    	            Product product = new Product(productIds[i], productNames[i], quantities[i], prices[i]);
	    	            inventory.addProduct(product);
	    	        }

	    	        // Update product
	    	        System.out.println("Enter product ID to update:");
	    	        String updateProductId = scanner.nextLine();
	    	        Product productToUpdate = inventory.getProduct(updateProductId);
	    	        if (productToUpdate != null) {
	    	            System.out.print("Enter new price: ");
	    	            double newPrice = scanner.nextDouble();
	    	            productToUpdate.setPrice(newPrice);
	    	            inventory.updateProduct(productToUpdate);
	    	        } else {
	    	            System.out.println("Product not found.");
	    	        }

	    	        // Retrieve and display product
	    	        System.out.println("Enter product ID to retrieve:");
	    	        String retrieveProductId = scanner.nextLine();
	    	        Product retrievedProduct = inventory.getProduct(retrieveProductId);
	    	        if (retrievedProduct != null) {
	    	            System.out.println("Product ID: " + retrievedProduct.getProductId());
	    	            System.out.println("Product Name: " + retrievedProduct.getProductName());
	    	            System.out.println("Quantity: " + retrievedProduct.getQuantity());
	    	            System.out.println("Price: " + retrievedProduct.getPrice());
	    	        } else {
	    	            System.out.println("Product not found.");
	    	        }

	    	        // Delete product
	    	        System.out.println("Enter product ID to delete:");
	    	        String deleteProductId = scanner.nextLine();
	    	        inventory.deleteProduct(deleteProductId);

	    	        System.out.println("Product deletion successful.");

	    	        scanner.close();
	    	    }
	    	
}
	    	
	       /* Inventory inventory = new Inventory();
	        Scanner sc=new Scanner(System.in);
	        Product[] p=new Product[sc.nextInt()];
	        for(int i=0;i<p.length;i++)
	        {
	        	p[i]=new Product(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
	        }

	        for (int i = 0; i < p.length; i++) {
	            inventory.addProduct(p[i]);
	        }
	        //Product[] p= {new Product("001", "Laptop", 10, 999.99),new Product("002", "Smartphone", 20, 499.99),
	         //new Product("007", "Smartphone", 80, 799.99),new Product("009", "Smartphone", 50, 589.99),
	         //new Product("004", "Smartphone", 30, 3459.99),new Product("005", "Smartphone", 70, 9879.99)};
	        
	        // Add products
	       
	        
	        //inventory.addProduct(product1);
	        //inventory.addProduct(product2);
	        //inventory.addProduct(product3);
	        //inventory.addProduct(product4);
	        //inventory.addProduct(product5);
	        //inventory.addProduct(product6);

	        // Update product
	       // p.setPrice(899.99);
	        //inventory.updateProduct(product1);

	        // Retrieve and display product
	        Product retrievedProduct = inventory.getProduct("001");
	        System.out.println("Product ID: " + retrievedProduct.getProductId());
	        System.out.println("Product Name: " + retrievedProduct.getProductName());
	        System.out.println("Quantity: " + retrievedProduct.getQuantity());
	        System.out.println("Price: " + retrievedProduct.getPrice());

	        // Delete product
	        inventory.deleteProduct("002");*/
	    

