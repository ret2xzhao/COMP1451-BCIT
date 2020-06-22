import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 3.What are the naming conventions and guidelines for selecting a package name for Java classes?
 * Ans: Package names are written in all lower case to avoid conflict with the names of classes or interfaces. Companies use
 *      their reversed Internet domain name to begin their package names. Packages in the Java language itself begin with java.
 *      or javax..
 */

/**
 * 4.Write a class that declares a HashMap of book titles whose keys are Integers and whose values are Strings. Add the
 * following values to the HashMap in the constructor:
 * 1984=>"nineteen eighty four"
 * 5=>"slaughterhouse five"
 * 2=>"a tale of two cities"
 * Also create a method with the signature String getTItleWith(int numberInTitle) which returns the value of the book whose
 * key is passed as the parameter; it returns null if there is no such key in the Map.
 * Finally, create a method with the signature void displayAllKeysAndValues() which prints all of the Map¡¯s keys and values
 * in the format of "1984 is the key for nineteen eighty four", etc¡­
 */

public class Q4 {
// public class BookTitle {
    private HashMap<Integer, String> bookTitles;
    public Q4() {
    //public BookTitle() {
        bookTitles = new HashMap<Integer, String>();
        if(bookTitles != null){
            bookTitles.put(1984, "nineteen eighty four");
            bookTitles.put(5, "slaughterhouse five");
            bookTitles.put(2, "a tale of two cities");
        }
    }

    public String getTItleWith(int numberInTitle) {
        boolean ifContain = bookTitles.containsKey(numberInTitle);
        if(ifContain)
        {
            System.out.println(bookTitles.get(numberInTitle));
            return bookTitles.get(numberInTitle);
        }
        else
        {
            System.out.println("null checking");
            return null;
        }
    }

    public void displayAllKeysAndValues() {
        Set<Integer> intKeys = bookTitles.keySet();
        Iterator<Integer> it = intKeys.iterator();

        while(it.hasNext())
        {
            int integer = it.next();
            String bookTitle = bookTitles.get(integer);
            System.out.println(integer + " is the key for " + bookTitle);
        }
    }
}