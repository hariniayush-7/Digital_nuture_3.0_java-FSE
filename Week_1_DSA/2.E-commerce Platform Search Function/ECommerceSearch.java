package java_fse_CTS;

public class ECommerceSearch {
	
	    public static void main(String[] args) {
	        Product[] products = {
	            new Product("003", "Smartphone", "Electronics"),
	            new Product("001", "Laptop", "Electronics"),
	            new Product("002", "Tablet", "Electronics")
	        };

	        // Linear search
	        System.out.println("Linear Search:");
	        Product result = LinearSearch.linearSearch(products, "002");
	        if (result != null) {
	            System.out.println("Product found: " + result.getProductName());
	        } else {
	            System.out.println("Product not found.");
	        }

	        // Sort products for binary search
	        BinarySearch.sortProductsById(products);

	        // Binary search
	        System.out.println("Binary Search:");
	        result = BinarySearch.binarySearch(products, "002");
	        if (result != null) {
	            System.out.println("Product found: " + result.getProductName());
	        } else {
	            System.out.println("Product not found.");
	        }
	    }
	}



