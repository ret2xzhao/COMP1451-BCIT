/**
 * class Name
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Name {
    // Instance Variables:
    private String firstName;
    private String middleName;
    private String lastName;

    /**
     * Constructor for objects of class Name.
     * @param firstName  A String to set the first name of a Name.
     * @param middleName A String to set the middle name of a Name.
     * @param lastName   A String to set the last name of a Name.
     */
    public Name(String firstName, String middleName, String lastName) {
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
    }

    /**
     * Constructor for objects of class Name.
     * @param firstName A String to set the first name of a Name.
     * @param lastName  A String to set the last name of a Name.
     */
    public Name(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    /**
     * Constructor for objects of class Name.
     * @param lastName A String to set the last name of a Name.
     */
    public Name(String lastName) {
        setLastName(lastName);
    }

    /**
     * Sets the first name of a Name.
     * @param firstName A String to set the first name of a Name.
     */
    public void setFirstName(String firstName) {
        if(firstName != null) {
            this.firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Name::firstName.");
        }
    }

    /**
     * @return The first name of a Name in String.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Sets the middle name of a Name.
     * @param middleName A String to set the middle name of a Name.
     */
    public void setMiddleName(String middleName) {
        if(middleName != null && !middleName.trim().isEmpty()) {
            this.middleName = middleName.toUpperCase().charAt(0) + middleName.substring(1).toLowerCase();
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Name::middleName.");
        }
    }

    /**
     * @return The middle name of a Name in String.
     */
    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * Sets the last name of a Name.
     * @param lastName A String to set the last name of a Name.
     */
    public void setLastName(String lastName) {
        if(lastName != null && !lastName.trim().isEmpty()) {
            this.lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Name::lastName.");
        }
    }

    /**
     * @return The last name of a Name in String.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @return The full name (such as "Madonna", or "Tiger Woods", or "Andrew Lloyd Webber") in String.
     */
    public String getFullName() {
        if(middleName != null) {
            return this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName();
        }
        else if(firstName != null){
            return this.getFirstName() + " " + this.getLastName();
        }
        else {
            return this.getLastName();
        }
    }
}