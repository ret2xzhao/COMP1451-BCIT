package ca.bcit.comp1451.a00898485;

/**
 * class Main
 *
 * @author Xin Zhao (A00898485) with Man Lee
 * @version 1.0
 */

public class Main {
    /**
     * @param args
     * @throws InvalidArgumentException
     * @throws InvalidBookDateException
     */
    public static void main(String[] args) throws InvalidArgumentException, InvalidBookDateException {
        System.out.println("-------------------------------------------------------------------------------");
        BookStore bs = new BookStore();
        bs.addBook("robert",  "SEDGEWICK", "Algorithms",          2000);
        bs.addBook("ERic",    "MaTtHeS",   "PYTHON CRASH COURSE", 2015);
        bs.addBook("stephen", "prata",     "c++ primer plus",     2003);
        bs.addBook("Stephen", "Prata",     "C++ primer plus",     2003);
        System.out.println(bs.getBooks().get(0).equals(bs.getBooks().get(1)));
        System.out.println(bs.getBooks().get(1).equals(bs.getBooks().get(2)));
        System.out.println(bs.getBooks().get(2).equals(bs.getBooks().get(3)));
        System.out.println("-------------------------------------------------------------------------------");
        bs.displayBooks();
        System.out.println("-------------------------------------------------------------------------------");
        Name subject1 = new Name("Kindle", "Edition");
        Name subject2 = new Name("Paper", "Back");
        Biography bio1 = new Biography(new Name("Ron",    "Chernow"), "Alexander Hamilton",              2005, subject1);
        Biography bio2 = new Biography(new Name("Brett",  "Harper" ), "Roosevelt",                       2014, subject1);
        Biography bio3 = new Biography(new Name("Andrew", "Roberts"), "Churchill: Walking with Destiny", 2016, subject2);    
        System.out.println(bio1.equals(bio2));
        System.out.println(bio1.equals(bio3));
        System.out.println(bio2.equals(bio3));
        System.out.println("-------------------------------------------------------------------------------");
    }
}