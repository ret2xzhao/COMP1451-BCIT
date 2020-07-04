package ca.bcit.comp1451.a00898485;

/**
 * Class Person
 *
 * @author Xin Zhao (A00898485) with Kirill Kuklin
 * @version 1.0
 */

public class Person {
    // Instance Variables:
    private String firstName;
    private String lastName;
    private int    yearOfBirth;
    private Gender gender;

    /**
     * Constructor for objects of class Person.
     */
    public Person(String firstName, String lastName, int yearOfBirth, Gender gender) {
        setFirstName(firstName);
        setLastName(lastName);
        setYearOfBirth(yearOfBirth);
        setGender(gender);
    }

    /**
     * @param firstName A String to set the first name of a person.
     */
    public void setFirstName(String firstName) {
        if(firstName != null && !firstName.isEmpty())
        {
            this.firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();
        }
        else
        {
            System.out.println("Error: Invalid firstName.");
        }
    }

    /**
     * @param lastName A String to set the last name of a person.
     */
    public void setLastName(String lastName) {
        if(lastName != null && !lastName.isEmpty())
        {
            this.lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();
        }
        else
        {
            System.out.println("Error: Invalid lastName.");
        }
    }

    /**
     * @param yearOfBirth An integer to set the year of birth of a person.
     */
    public void setYearOfBirth(int yearOfBirth) {
        if(yearOfBirth >= 0)
        {
            this.yearOfBirth = yearOfBirth;
        }
        else
        {
            System.out.println("Error: Invalid yearOfBirth.");
        }
    }

    /**
     * @param gender A Gender to set the gender of a person.
     */
    public void setGender(Gender gender) {
        if(gender == Gender.MALE || gender == Gender.FEMALE)
        {
            this.gender = gender;
        }
        else
        {
            System.out.println("Error: Invalid gender.");
        }
    }

    /**
     * @return The first name of a person in String.
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * @return The last name of a person in String.
     */
    public String getLastName(){
        return this.lastName;
    }

    /**
     * @return The year of birth of a person in integer.
     */
    public int getYearOfBirth(){
        return this.yearOfBirth;
    }

    /**
     * @return The gender of a person in Gender.
     */
    public Gender getGender() {
        return this.gender;
    }

    /**
     * Displays details in the following format:
     * "Oprah Winfrey is a Person. She was born in 1954."
     * or
     * "Tiger Woods is a Person. He was born in 1975."
     */
    public void printDetails() {
        if(this.gender == Gender.MALE) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is a " + this.getClass().getSimpleName() +
                               ". He was born in " + this.getYearOfBirth() + ".");
        }
        else {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is a " + this.getClass().getSimpleName() +
                               ". She was born in " + this.getYearOfBirth() + ".");
        }
    }
}