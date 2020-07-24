/**
 * Class Student
 *
 * @author Xin Zhao (A00898485) with Rajat
 * @version 1.0
 */

class Student {
    // Instance Variables:
	public String FIRSTNAME;
	public String LASTNAME;
	public int    YEAROfBIRTH;
	public gender GENDER;
	public String STUDENTNUMBER;
    public String MAJOR;
    public double GRADEPOINTAVERAGE;

    /**
     * Constructor for objects of class Student.
     */
    public Student(String FIRSTNAME, String LASTNAME, int YEAROfBIRTH, gender gender, String STUDENTNUMBER, String MAJOR) {
        this.FIRSTNAME = FIRSTNAME.toUpperCase().charAt(0) + FIRSTNAME.substring(1).toLowerCase();
    	this.LASTNAME  = LASTNAME.toUpperCase().charAt(0) + LASTNAME.substring(1).toLowerCase();
    	this.YEAROfBIRTH = YEAROfBIRTH;
    	if(gender == gender.male) {
            this.GENDER = gender.male;
        }
    	if(gender == gender.female) {
            this.GENDER = gender.female;
        }
    	this.STUDENTNUMBER = STUDENTNUMBER.substring(0).toLowerCase();
    	this.MAJOR = MAJOR.substring(0).toLowerCase();
    }

    /**
     * @param GRADEPOINTAVERAGE A double to set the grade point average of a student.
     */
    public void GRADEPOINTAVERAGE(double GRADEPOINTAVERAGE) {
        if(GRADEPOINTAVERAGE >= 0) {
            this.GRADEPOINTAVERAGE = GRADEPOINTAVERAGE;
        }
        else {
            System.out.println("Error: Invalid gradePointAverage.");
        }
    }

    /**
     * @return The first name of a student in String.
     */
    public String FIRSTNAME() {
        return this.FIRSTNAME;
    }

    /**
     * @return The last name of a student in String.
     */
    public String LASTNAME() {
        return this.LASTNAME;
    }

    /**
     * @return The year of birth of a student in integer.
     */
    public int YEAROfBIRTH() {
        return this.YEAROfBIRTH;
    }

    /**
     * @return The gender of a student in gender.
     */
    public gender GENDER() {
        return this.GENDER;
    }
    
    /**
     * @return The student number of a student in String.
     */
    public String STUDENTNUMBER() {
        return this.STUDENTNUMBER;	
    }

    /**
     * @return The major of a student in String.
     */
    public String MAJOR() {
        return this.MAJOR;
    }

    /**
     * @return The grade point average of a student in double.
     */
    public double GRADEPOINTAVERAGE() {
        return this.GRADEPOINTAVERAGE;
    }

    /**
     * Displays details of the male Student.
     */
    public void printMaleDetails() {
        if(this.GENDER == gender.male) {
            System.out.println(this.FIRSTNAME + " " + this.LASTNAME + " is a " + this.getClass().getSimpleName() +
                               " of " + this.MAJOR + " (st# " + this.STUDENTNUMBER + "). He was born in " +
                               this.YEAROfBIRTH + ".");
        }
    }

    /**
     * Displays details of the female Student.
     */
    public void printFemaleDetails() {
        if(this.GENDER == gender.female) {
            System.out.println(this.FIRSTNAME + " " + this.LASTNAME + " is a " + this.getClass().getSimpleName() +
                               " of " + this.MAJOR + " (st# " + this.STUDENTNUMBER + "). She was born in " +
                               this.YEAROfBIRTH + ".");
        }
    }
}