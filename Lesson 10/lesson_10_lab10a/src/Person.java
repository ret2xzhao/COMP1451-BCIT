/**
 * Class Person
 *
 * @author Xin Zhao (A00898485) with Rajat
 * @version 1.0
 */

class Person {
    // Instance Variables:
    public String FIRSTNAME;
    public String LASTNAME;
    public int    YEAROfBIRTH;
    public gender GENDER;
    public int    number;

    /**
     * Constructor for objects of class Person.
     */
    public Person(String FIRSTNAME, String LASTNAME, int yearofbirth, gender gender) {
        this.FIRSTNAME = FIRSTNAME.toUpperCase().charAt(0) + FIRSTNAME.substring(1).toLowerCase();
        this.LASTNAME  = LASTNAME.toUpperCase().charAt(0) + LASTNAME.substring(1).toLowerCase();
        this.YEAROfBIRTH = yearofbirth;
        if(gender == gender.male) {
            this.GENDER = gender.male;
        }
        if(gender == gender.female) {
            this.GENDER = gender.female;
        }
    }

    /**
     * @return The first name of a person in String.
     */
    public String FIRSTNAME() {
        return this.FIRSTNAME;
    }

    /**
     * @return The last name of a person in String.
     */
    public String LASTNAME() {
        return this.LASTNAME;
    }

    /**
     * @return The year of birth of a person in integer.
     */
    public int YEAROfBIRTH() {
        return this.YEAROfBIRTH;
    }

    /**
     * @return The gender of a person in gender.
     */
    public gender GENDER() {
        return this.GENDER;
    }

    /**
     * Displays details of the male Person.
     */
    public void printMaleDetails() {
        if(this.GENDER == gender.male) {
            System.out.println(this.FIRSTNAME + " " + this.LASTNAME + " is a " + this.getClass().getSimpleName() +
                               ". He was born in " + this.YEAROfBIRTH + ".");
        }
    }

    /**
     * Displays details of the female Person.
     */
    public void printFemaleDetails() {
        if(this.GENDER == gender.female) {
            System.out.println(this.FIRSTNAME + " " + this.LASTNAME + " is a " + this.getClass().getSimpleName() +
                               ". She was born in " + this.YEAROfBIRTH + ".");
        }
    }
}