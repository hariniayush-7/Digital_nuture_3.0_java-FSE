package java_fse_CTS;

public class Product {
	
	    private String productId;
	    private String productName;
	    private int quantity;
	    private double price;
	    private String category;

	    public Product(String productId, String productName, int quantity, double price) {
	        this.productId = productId;
	        this.productName = productName;
	        this.quantity = quantity;
	        this.price = price;
	    }

	    // Getters and setters
	    public String getProductId() {
	        return productId;
	    }

	    public void setProductId(String productId) {
	        this.productId = productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
	    
	    
	    //constructor 2
	    
	    

	        public Product(String productId, String productName, String category) {
	            this.productId = productId;
	            this.productName = productName;
	            this.category = category;
	        }

	        // Getters and setters
	        public String getProductID() {
	            return productId;
	        }

	        public void setProductID(String productId) {
	            this.productId = productId;
	        }

	        public String getproductName() {
	            return productName;
	        }

	        public void setproductName(String productName) {
	            this.productName = productName;
	        }

	        public String getCategory() {
	            return category;
	        }

	        public void setCategory(String category) {
	            this.category = category;
	        }
	    }

	


