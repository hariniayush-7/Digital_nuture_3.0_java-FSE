package java_fse_CTS;

public class ain3 {
	
	    public static void main(String[] args) {
	        LibraryManagementSystem library = new LibraryManagementSystem(5);

	        // Add books
	        library.addBook(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
	        library.addBook(new Book("B002", "1984", "George Orwell"));
	        library.addBook(new Book("B003", "To Kill a Mockingbird", "Harper Lee"));

	        // Linear Search
	        Book book = library.linearSearchByTitle("1984");
	        if (book != null) {
	            System.out.println("Linear Search: Book found - " + book.getTitle() + " by " + book.getAuthor());
	        } else {
	            System.out.println("Linear Search: Book not found.");
	        }

	        // Binary Search
	        book = library.binarySearchByTitle("1984");
	        if (book != null) {
	            System.out.println("Binary Search: Book found - " + book.getTitle() + " by " + book.getAuthor());
	        } else {
	            System.out.println("Binary Search: Book not found.");
	        }

	        // Traverse and display all books
	        System.out.println("All books in the library:");
	        library.traverseBooks();
	    }
	}


