package ca.bcit.comp1451.a00898485;

/**
 * class Name
 *
 * @author Xin Zhao (A00898485) with Man Lee
 * @version 1.0
 */

public class Name {
    // Instance Variables:
    private String firstName;
    private String lastName;

    /**
     * Constructor for objects of class Name.
     * @param  firstName A String to set the first name of a Name.
     * @param  lastName  A String to set the last name of a Name.
     * @throws InvalidArgumentException
     */
    public Name(String firstName, String lastName) throws InvalidArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
    }

    /**
     * @param firstName A String to set the first name of a Name.
     * @throws InvalidArgumentException
     */
    public void setFirstName(String firstName) throws InvalidArgumentException {
        if(firstName == null || firstName.trim().isEmpty()) {
            throw new InvalidArgumentException("Error: Invalid Name::firstName.");
        }
        else {
            this.firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();
        }
    }

    /**
     * @return The first name of a Name in String.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @param lastName A String to set the last name of a Name.
     * @throws InvalidArgumentException
     */
    public void setLastName(String lastName) throws InvalidArgumentException {
        if(lastName == null || lastName.trim().isEmpty()) {
            throw new InvalidArgumentException("Error: Invalid Name::lastName.");
        }
        else {
            this.lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();
        }
    }

    /**
     * @return The last name of a Name in String.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @return The full name in String.
     */
    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    /**
     * @return An integer to indicate the hash code value for the object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * @return A boolean to indicate if this object is the same as the obj argument.
     * @param obj The reference Object with which to compare.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Name other = (Name) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        return true;
    }
}