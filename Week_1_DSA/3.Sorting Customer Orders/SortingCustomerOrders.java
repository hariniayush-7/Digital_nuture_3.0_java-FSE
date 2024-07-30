package java_fse_CTS;

public class SortingCustomerOrders {
	
	    public static void main(String[] args) {
	        Order[] orders = {
	            new Order("001", "Alice", 300.50),
	            new Order("002", "Bob", 150.75),
	            new Order("003", "Charlie", 500.25)
	        };

	        // Bubble Sort
	        System.out.println("Bubble Sort:");
	        BubbleSort.bubbleSort(orders);
	        for (Order order : orders) {
	            System.out.println(order.getCustomerName() + ": " + order.getTotalPrice());
	        }

	        // Quick Sort
	        Order[] ordersForQuickSort = {
	            new Order("001", "Alice", 300.50),
	            new Order("002", "Bob", 150.75),
	            new Order("003", "Charlie", 500.25)
	        };

	        System.out.println("\nQuick Sort:");
	        QuickSort.quickSort(ordersForQuickSort, 0, ordersForQuickSort.length - 1);
	        for (Order order : ordersForQuickSort) {
	            System.out.println(order.getCustomerName() + ": " + order.getTotalPrice());
	        }
	    }
	}



