package ca.bcit.comp1451.a00898485.lab1b;

/**
 * Person has instance variables for firstName, lastName and yearOfBirth.
 * 
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Person
{
    // Instance Variables:	
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    double x;

    // Symbolic Constants:
    public static final int MIN_YEAR = 0;
    public static final int CURRENT_YEAR = 2020;

    /**
     * Constructor for objects of class Person.
     * @param firstName An String to set the first name.
     * @param lastName An int to set the last name.
     * @param yearOfBirth An int to set the year of birth.
     */
    public Person(String firstName, String lastName, int yearOfBirth)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setYearOfBirth(yearOfBirth);
    }

    /**
     * Sets the firstName.
     * @param firstName A string to set the first name.
     */
    private void setFirstName(String firstName)
    {
        if(firstName != null && !firstName.isEmpty())
        {
            this.firstName = firstName;
        }
        else
        {
            throw new IllegalArgumentException("ERROR: Invalid Input.");
        }
    }

    /**
     * Gets the firstName.
     * @return the first name as a String.
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Sets the lastName.
     * @param lastName A string to set the last name.
     */
    private void setLastName(String lastName)
    {
        if(lastName != null && !lastName.isEmpty())
        {
            this.lastName = lastName;
        }
        else
        {
            throw new IllegalArgumentException("ERROR: Invalid Input.");
        }
    }

    /**
     * Gets the lastName.
     * @return the last name as a String.
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Sets the yearOfBirth.
     * @param yearOfBirth An int to set the year of birth.
     */
    private void setYearOfBirth(int yearOfBirth)
    {
        if(yearOfBirth > MIN_YEAR && yearOfBirth <= CURRENT_YEAR)
        {
            this.yearOfBirth = yearOfBirth;
        }
        else{
            throw new IllegalArgumentException("ERROR: Invalid Input.");
        }
    }

    /**
     * Gets the yearOfBirth.
     * @return the year of birth as an int.
     */
    public int getYearOfBirth()
    {
        return yearOfBirth;
    }
}