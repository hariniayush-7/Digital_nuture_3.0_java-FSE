package java_fse_CTS;

public class LinearSearch {
	
	    public static Product linearSearch(Product[] products, String targetProductId) {
	        for (Product product : products) {
	            if (product.getProductId().equals(targetProductId)) {
	                return product;
	            }
	        }
	        return null;
	    }
	}


