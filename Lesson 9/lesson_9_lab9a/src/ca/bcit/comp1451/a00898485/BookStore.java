package ca.bcit.comp1451.a00898485;

import java.util.ArrayList;
import java.util.Collections;

/**
 * class BookStore
 *
 * @author Xin Zhao (A00898485) with Man Lee
 * @version 1.0
 */

public class BookStore {
    // Instance Variables:
    private ArrayList<Book> books;

    /**
     * Constructor for objects of class BookStore.
     */
    public BookStore() {
        books = new ArrayList<Book>();
    }

    /**
     * @return The books in bookstore in ArrayList<Book>.
     */
    public ArrayList<Book> getBooks() {
        return this.books;
    }

    /**
     * Sets the books in bookstore.
     * @param books An ArrayList<Book> to set the books in bookstore.
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    /**
     * Creates a new Book and adds it to the Bookstore.
     * @param  firstName     A  String to set the author's first name of a Book.
     * @param  lastName      A  String to set the author's last name of a Book.
     * @param  title         A  String to set the title of a Book.
     * @param  yearPublished An integer to set the year published of a Book.
     * @throws InvalidBookDateException
     * @throws InvalidArgumentException
     */
    public void addBook(String firstName, String lastName, String title, int yearPublished) throws InvalidArgumentException, InvalidBookDateException {
        books.add(new Book(new Name(firstName, lastName), title, yearPublished));
    }

    /**
     * Prints books before and after sorting them.
     */
    public void displayBooks() {
        if(books != null) {
            for(Book b: books) {
                System.out.println(b.toString());
            }
            Collections.sort(books);
            System.out.println();
            for(Book b: books) {
                System.out.println(b.toString());
            } 
        }
    }
}