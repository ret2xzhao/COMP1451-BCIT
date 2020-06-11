package ca.bcit.comp1451.a00898485.lab1a;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * BookStore: an ArrayList of five ArrayList Book references.
 * 
 * @author Xin Zhao (A00898485) with Hirohide Shishido
 * @version 1.0
 */

public class BookStore
{
    // Instance Variables:
    private ArrayList<Book> allBooks1;
    private Book[] allBooks2;

    /**
     * Constructor for objects of class BookStore.
     */
    public BookStore()
    {
        allBooks1 = new ArrayList<Book>();
        allBooks1.add(new Book("Algorithms (4th Edition)", new Date(2011, 4, 3)));
        allBooks1.add(new Book("Cracking the Coding Interview", new Date(2015, 7, 1)));
        allBooks1.add(new Book("C++ Primer Plus (6th Edition)", 2013, 11, 26));
        allBooks1.add(new Book("Thinking in Java (4th Edition)", 2006, 2, 20));
        allBooks1.add(new Book("Effective Modern C++", 2014, 12, 5));

        allBooks2 = new Book[allBooks1.size()];
        allBooks2[0] = new Book(allBooks1.get(0).getTitle(), allBooks1.get(0).getDatePublished());
        allBooks2[1] = new Book(allBooks1.get(1).getTitle(), allBooks1.get(1).getDatePublished());
        allBooks2[2] = new Book(allBooks1.get(2).getTitle(), allBooks1.get(2).getDatePublished());
        allBooks2[3] = new Book(allBooks1.get(3).getTitle(), allBooks1.get(3).getDatePublished());
        allBooks2[4] = new Book(allBooks1.get(4).getTitle(), allBooks1.get(4).getDatePublished());
    }

    public void displayBooks()
    {
        if(allBooks1 == null)
        {
            throw new IllegalArgumentException("ERROR: ArrayList is null.");
        }

        if(allBooks2 == null)
        {
            throw new IllegalArgumentException("ERROR: Array is null.");
        }

        //iterator:
        Iterator<Book> it = allBooks1.iterator();
        while(it.hasNext())
        {
            Book oneBook = it.next();	
            if(oneBook != null)
            {
                System.out.println(oneBook.getTitle() + ": " + oneBook.getDatePublished().getDate());
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");

        //for-each loop:
        for(Book oneBook : allBooks2)
        {
            if(oneBook != null)
            {
                System.out.println(oneBook.getTitle() + ": " + oneBook.getDatePublished().getDate());
            }
        }
    }
}