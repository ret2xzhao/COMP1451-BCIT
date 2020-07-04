package ca.bcit.comp1451.a00898485;

/**
* Class BCITStudent
*
* @author Xin Zhao (A00898485) with Kirill Kuklin
* @version 1.0
*/

public class BCITStudent extends Student {
    // Instance Variables:
    private String studentNumber;
    private Campus campus;

    // Symbolic Constants:
    public static final int LENGTH_OF_BCIT_STUDENT_NUMBER = 9;

    /**
     * Constructor for objects of class BCITStudent.
     */
    public BCITStudent(String firstName, String lastName, int yearOfBirth, Gender gender,
                       String studentNumber, String major, Campus campus)
    {
        super(firstName, lastName, yearOfBirth, gender, studentNumber, major);
        setStudentNumber(studentNumber);
        setCampus(campus);
    }

    /**
     * @return The student number of a BCIT student in String.
     */
    public String getStudentNumber() {
        return this.studentNumber;
    }

    /**
     * @return The campus of a BCIT student in Campus.
     */
    public Campus getCampus() {
        return this.campus;
    }

    /**
     * @param studentNumber A String to set the student number of a BCIT student.
     */
    public void setStudentNumber(String studentNumber) {
        if(studentNumber!= null && !studentNumber.isEmpty())
        {
            if(studentNumber.length() == LENGTH_OF_BCIT_STUDENT_NUMBER && studentNumber.charAt(0) == 'A' ) {
                this.studentNumber = studentNumber;
            }
            else
            {
                System.out.println("Error: Invalid studentNumber.");
            }
        }
        else
        {
            System.out.println("Error: Invalid studentNumber.");
        }
    }

    /**
     * @param campus A Campus to set the campus of a BCIT student.
     */
    public void setCampus(Campus campus) {
        if(campus == Campus.Burnaby || campus == Campus.Downtown || campus == Campus.Richmond || campus == Campus.North_Vancouver)
        {
            this.campus = campus;
        }
        else
        {
            System.out.println("Error: Invalid campus.");
        }
    }

    /**
     * Displays details in the following format:
     * "Markus Frind is a BCITStudent of computer science (st# A12345678) at the Downtown campus. He was born in 1979."
     * or
     * "Gloria Macarenko is a BCITStudent of journalism (st# A88877777) at the Burnaby campus. She was born in 1962."
     */
    public void printDetails() {
        if(this.getGender() == Gender.MALE) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is a " + this.getClass().getSimpleName()
                               + " of " + this.getMajor() + " (st# " + this.getStudentNumber() + ") at the " + this.getCampus()
                               + " campus. He was born " + "in " + this.getYearOfBirth() + ".");
        }
        else {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is a " + this.getClass().getSimpleName()
                               + " of " + this.getMajor() + " (st# " + this.getStudentNumber() + ") at the " + this.getCampus()
                               + " campus. She was born " + "in " + this.getYearOfBirth() + ".");
        }
    }
}