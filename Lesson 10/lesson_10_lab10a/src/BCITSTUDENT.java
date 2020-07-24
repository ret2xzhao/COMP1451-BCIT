/**
 * Class BCITSTUDENT
 *
 * @author Xin Zhao (A00898485) with Rajat
 * @version 1.0
 */

class BCITSTUDENT {
    // Instance Variables:
    public String FIRSTNAME;
    public String LASTNAME;
    public int    YEAROfBIRTH;
    public gender GENDER;
    public String STUDENTNUMBER;
    public String MAJOR;
    public double GRADEPOINTAVERAGE;
    public campus campus;

    /**
     * Constructor for objects of class BCITSTUDENT.
     */
    public BCITSTUDENT(String FIRSTNAME, String LASTNAME, int YEAROfBIRTH, gender gender,
                       String STUDENTNUMBER, String MAJOR, campus campus) {
        this.FIRSTNAME = FIRSTNAME.toUpperCase().charAt(0) + FIRSTNAME.substring(1).toLowerCase();
        this.LASTNAME  = LASTNAME.toUpperCase().charAt(0) + LASTNAME.substring(1).toLowerCase();
        this.YEAROfBIRTH = YEAROfBIRTH;
        if(gender == gender.male) {
            this.GENDER = gender.male;
        }
        if(gender == gender.female) {
            this.GENDER = gender.female;
        }
        this.STUDENTNUMBER = STUDENTNUMBER.toUpperCase().charAt(0) + STUDENTNUMBER.substring(1).toLowerCase();
        this.MAJOR = MAJOR.substring(0).toLowerCase();
        if(campus == campus.Burnaby) {
            this.campus = campus.Burnaby;
        }
        if(campus == campus.Downtown) {
            this.campus = campus.Downtown;
        }
        if(campus == campus.Richmond) {
            this.campus = campus.Richmond;
        }
        if(campus == campus.North_Vancouver) {
            this.campus = campus.North_Vancouver;
        }
    }

    /**
     * @return The campus of a BCIT student in campus.
     */
    public campus Campus() {
        return this.campus;
    }

    /**
     * @param GRADEPOINTAVERAGE A double to set the grade point average of a BCIT student.
     */
    public void GRADEPOINTAVERAGE(double GRADEPOINTAVERAGE) {
        this.GRADEPOINTAVERAGE = GRADEPOINTAVERAGE;
    }

    /**
     * @return The first name of a BCIT student in String.
     */
    public String FIRSTNAME() {
        return this.FIRSTNAME;
    }

    /**
     * @return The last name of a BCIT student in String.
     */
    public String LASTNAME() {
        return this.LASTNAME;
    }

    /**
     * @return The year of birth of a BCIT student in integer.
     */
    public int YEAROfBIRTH() {
        return this.YEAROfBIRTH;
    }

    /**
     * @return The gender of a BCIT student in gender.
     */
    public gender GENDER() {
        return this.GENDER;
    }

    /**
     * @return The student number of a BCIT student in String.
     */
    public String STUDENTNUMBER() {
        return this.STUDENTNUMBER;	
    }

    /**
     * @return The major of a BCIT student in String.
     */
    public String MAJOR() {
        return this.MAJOR;
    }

    /**
     * @return The grade point average of a BCIT student in double.
     */
    public double GRADEPOINTAVERAGE() {
        return this.GRADEPOINTAVERAGE;
    }

    /**
     * Displays details of the male BCITStudent.
     */
    public void printMaleDetails() {
        if(this.GENDER == gender.male) {
            System.out.println(this.FIRSTNAME + " " + this.LASTNAME + " is a " + this.getClass().getSimpleName().substring(0, 5).toUpperCase() 
                               + this.getClass().getSimpleName().substring(5).toLowerCase()
                               + " of " + this.MAJOR + " (st# " + this.STUDENTNUMBER + ") at the " + this.campus
                               + " campus. He was born " + "in " + this.YEAROfBIRTH + ".");
        }
    }

    /**
     * Displays details of the female BCITStudent.
     */
    public void printFemaleDetails() {
        if(this.GENDER == gender.female) {
            System.out.println(this.FIRSTNAME + " " + this.LASTNAME + " is a " + this.getClass().getSimpleName().substring(0, 5).toUpperCase() 
                               + this.getClass().getSimpleName().substring(5).toLowerCase()
                               + " of " + this.MAJOR + " (st# " + this.STUDENTNUMBER + ") at the " + this.campus
                               + " campus. She was born " + "in " + this.YEAROfBIRTH + ".");
        }
    }
}