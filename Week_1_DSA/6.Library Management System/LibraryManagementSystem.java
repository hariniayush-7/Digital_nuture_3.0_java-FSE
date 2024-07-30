package java_fse_CTS;

import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagementSystem {
    private Book[] books;
    private int size;

    public LibraryManagementSystem(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size == books.length) {
            books = Arrays.copyOf(books, size * 2); // Double the array size if full
        }
        books[size++] = book;
    }

    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Utility method to sort books by title
    private void sortBooksByTitle() {
        Arrays.sort(books, 0, size, Comparator.comparing(Book::getTitle));
    }

    public Book binarySearchByTitle(String title) {
        sortBooksByTitle();
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);
            if (comparison == 0) {
                return books[mid];
            }
            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Traverse and display all books
    public void traverseBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println("Book ID: " + books[i].getBookId() + 
                               ", Title: " + books[i].getTitle() + 
                               ", Author: " + books[i].getAuthor());
        }
    }
}

