package java_fse_CTS;

import java.util.HashMap;

public class Inventory {
	
        private HashMap<String, Product> products;

	    public Inventory() {
	        products = new HashMap<>();
	    }

	    // Add a product
	    public void addProduct(Product product) {
	        products.put(product.getProductId(), product);
	    }

	    // Update a product
	    public void updateProduct(Product product) {
	        products.put(product.getProductId(), product);
	    }

	    // Delete a product
	    public void deleteProduct(String productId) {
	        products.remove(productId);
	    }

	    // Retrieve a product
	    public Product getProduct(String productId) {
	        return products.get(productId);
	    }
	}



