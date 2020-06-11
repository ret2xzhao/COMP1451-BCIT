/**
 * Store details of a club membership.
 * 
 * @author Bullwinkle Moose
 */
public class Member {

    public static final int FIRST_MONTH = 1;
    public static final int LAST_MONTH = 12;
    public static final int FIRST_YEAR = 0;
    public static final int CURRENT_YEAR = 2015;

    private String firstName;
    private String lastName;
    private int monthJoined; // month in which membership was taken out
    private int yearJoined;  // year in which membership was taken out

    /**
     * Default constructor for Member.
     */
    public Member(){  }

    /**
     * Constructor for objects of class Member.
     * @param firstName The first name of the member.
     * @param lastName The last name of the member.
     * @param month The month in which they joined. (1 ... 12)
     * @param year The year in which they joined.
     */
    public Member(String firstName, String lastName, int month, int year){
        setFirstName(firstName);
        setLastName(lastName);
        setMonthJoined(month);
        setYearJoined(year);      
    }
    
    /**
     * @return The member's first name.
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * @return The member's last name.
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * @return The month in which the member joined.
     *         A value in the range 1 ... 12
     */
    public int getMonthJoined(){
        return monthJoined;
    }

    /**
     * @return The year in which the member joined.
     */
    public int getYearJoined(){
        return yearJoined;
    }

    /**
     * @param firstName member's first name
     */
    public void setFirstName(String firstName){
        if(firstName != null){
            this.firstName = firstName;
        }
    }

    /**
     * @param lastName member's last name
     */
    public void setLastName(String lastName){
        if(lastName != null){
            this.lastName = lastName;
        }
    }

    /**
     * @param month the month this member joined
     */
    public void setMonthJoined(int month){
        if(month >= FIRST_MONTH && month <= LAST_MONTH){
            this.monthJoined = month;
        }
    }

    /**
     * @param year the year this member joined
     */
    public void setYearJoined(int year){
        if(year >= FIRST_YEAR && year <= CURRENT_YEAR){
            this.yearJoined = year;
        }
    }

    /**
     * @return a String depiction of a member
     */
    public String getMemberInfo(){
        return firstName + " " + lastName + " joined in year " + yearJoined + " month " + monthJoined;
    }
}