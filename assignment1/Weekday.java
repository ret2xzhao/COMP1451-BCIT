import java.util.HashMap;
import java.util.Map;

/**
 * The seven names given to 24-hour periods in the Gregorian Calendar.
 *
 * @author  James Pede
 * @version Jul 12'14,1600h
 */

public enum Weekday{
    MONDAY    ("Monday"),
    TUESDAY   ("Tuesday"),
    WEDNESDAY ("Wednesday"),
    THURSDAY  ("Thursday"),
    FRIDAY    ("Friday"),
    SATURDAY  ("Saturday"),
    SUNDAY    ("Sunday");

    private String literal;
    private static Map<String, Weekday> lookup = new HashMap<String, Weekday>();

    static{
        for (Weekday w : Weekday.values()){
            lookup.put(w.toString(), w);
        }
    }

    /**
     * @param literal A String to set the literal of the Weekday.
     */
    private Weekday(String literal) {
        this.literal = literal;
    }

    /**
     * @param searchTerm A String to indicate the search term.
     * @return A Weekday by the specific search term.
     */
    public static Weekday get(String searchTerm) {
        return lookup.get(searchTerm);
    }

    /**
     * @return A String to indicate the literal of the Weekday.
     */
    public String toString() {
        return this.literal;
    }
}