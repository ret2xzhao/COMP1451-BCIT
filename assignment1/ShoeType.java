import java.util.HashMap;
import java.util.Map;

/**
 * enum ShoeType
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public enum ShoeType {
    WOMEN    ("women"),
    MEN      ("men"),
    CHILDREN ("children"),
    SPORTS   ("sports"),
    DRESS    ("dress");

    private String theShoeType;
    private static Map<String, ShoeType> lookup = new HashMap<String, ShoeType>();

    static{
        for (ShoeType s : ShoeType.values()){
            lookup.put(s.getTheShoeType(), s);
        }
    }

    /**
     * Constructor for enum ShoeType.
     * @param theShoeType A String to set the type of the shoe.
     */
    private ShoeType(String theShoeType) {
        this.theShoeType = theShoeType;
    }

    /**
     * @return A String indicated the type of the shoe.
     */
    public String getTheShoeType() {
        return theShoeType;
    }

    /**
     * The following method allows me to create a ShoeType enum from a String!
     * e.g. in the Shoe class, I could set the ShoeType instance variable to:
     * shoeType = ShoeType.get("women");
     * @param theShoeType A String to set the type of the shoe.
     * @return A ShoeType enum.
     */
    public static ShoeType get(String theShoeType) {
        return lookup.get(theShoeType);
    }
};