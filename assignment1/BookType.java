import java.util.Map;
import java.util.HashMap;

/**
 * enum BookType
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public enum BookType {
    FICTION        ("fiction"),
    NONFICTION     ("nonfiction"),
    SCIENCEFICTION ("sciencefiction"),
    REFERENCE      ("reference");

    private String theBookType;
    private static Map<String, BookType> lookup = new HashMap<String, BookType>();

    static{
        for (BookType b : BookType.values()){
            lookup.put(b.getTheBookType(), b);
        }
    }

    /**
     * Constructor for enum BookType.
     * @param theBookType A String to set the type of the book.
     */
    private BookType(String theBookType) {
        this.theBookType = theBookType;
    }

    /**
     * @return A String indicated the type of the book.
     */
    public String getTheBookType() {
        return theBookType;
    }

    /**
     * The following method allows me to create a BookType enum from a String!
     * e.g. in the Book class, I could set the BookType instance variable to:
     * bookType = BookType.get("fiction");
     * @param theBookType A String to set the type of the book.
     * @return A BookType enum.
     */
    public static BookType get(String theBookType) {
        return lookup.get(theBookType);
    }
}