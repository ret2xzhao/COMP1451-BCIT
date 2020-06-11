package a00898485_lab1b;

/**
 * Member:A member of a club. A member has first and last name, and month and year of joining.
 * 
 * @author Xin Zhao (A00898485)
 * @version 04/16/2020
 */

public class Member{
    // Symbolic Constants:
    public static final int FIRST_MONTH = 1;
    public static final int LAST_MONTH = 12;
    public static final int CURRENT_YEAR = 2018;
    public static final String DEFAULT_NAME = "unknown";

    // Instance Variable:
    private String firstName;
    private String lastName;
    private int monthOfJoin;
    private int yearOfJoin;

    /**
     * Default constructor for objects of class Member.
     */
    public Member(){
    }

    /**
     * Constructor for objects of class Member.
     * @param firstName A string to set the first name of the member.
     * @param lastName A string to set the last name of the member.
     * @param monthOfJoin An int to set the month of joining of the member.
     * @param yearOfJoin An int to set the year of joining of the member.
     */
    public Member(String firstName, String lastName, int monthOfJoin, int yearOfJoin){
        setFirstName(firstName);
        setLastName(lastName);
        setMonthOfJoin(monthOfJoin);
        setYearOfJoin(yearOfJoin);
    }

    /**
     * Sets the first name of the member.
     * @param firstName A string to set the first name of the member.
     */
    public void setFirstName(String firstName){
        if(firstName != null && !firstName.isEmpty()){
            this.firstName = firstName;
        }
        else{
            this.firstName = DEFAULT_NAME;
        }
    }

    /**
     * Gets the first name of the member.
     * @return the first name of the member as a String.
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * Sets the last name of the member.
     * @param lastName A string to set the last name of the member.
     */
    public void setLastName(String lastName){
        if(lastName != null && !lastName.isEmpty()){
            this.lastName = lastName;
        }
        else{
            this.lastName = DEFAULT_NAME;
        }
    }

    /**
     * Gets the last name of the member.
     * @return the last name of the member as a String.
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Sets the month of joining of the member.
     * @param monthOfJoin An int to set the month of joining of the member.
     */
    public void setMonthOfJoin(int monthOfJoin){
        if(monthOfJoin >= FIRST_MONTH && monthOfJoin <= LAST_MONTH){
            this.monthOfJoin = monthOfJoin;
        }
        else{
            this.monthOfJoin = FIRST_MONTH;
        }
    }

    /**
     * Gets the month of joining of the member.
     * @return the month of joining of the member as an int.
     */
    public int getMonthOfJoin(){
        return monthOfJoin;
    }

    /**
     * Sets the year of joining of the member.
     * @param yearOfJoin An int to set the year of joining of the member.
     */
    public void setYearOfJoin(int yearOfJoin){
        if(yearOfJoin >= 0 && yearOfJoin <= CURRENT_YEAR){
            this.yearOfJoin = yearOfJoin;
        }
        else{
            this.yearOfJoin = CURRENT_YEAR;
        }
    }

    /**
     * Gets the year of joining of the member.
     * @return the year of joining of the member as an int.
     */
    public int getYearOfJoin(){
        return yearOfJoin;
    }
}