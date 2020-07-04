package ca.bcit.comp1451.a00898485;

/**
 * Class Student
 *
 * @author Xin Zhao (A00898485) with Kirill Kuklin
 * @version 1.0
 */

public class Student extends Person {
    // Instance Variables:
    private String studentNumber;
    private String major;             // e.g. "computer science"
    private double gradePointAverage; // e.g. 4.0

    /**
     * Constructor for objects of class Student.
     */
    public Student(String firstName, String lastName, int yearOfBirth, Gender gender, 
                   String studentNumber, String major)
    {
        super(firstName, lastName, yearOfBirth, gender);
        setStudentNumber(studentNumber);
        setMajor(major);
        //setGradePointAverage(gradePointAverage);
    }

    /**
     * @param studentNumber A String to set the student number of a student.
     */
    public void setStudentNumber(String studentNumber) {
        if(studentNumber != null && !studentNumber.isEmpty())
        {
            this.studentNumber = studentNumber.substring(0).toLowerCase();
        }
        else
        {
            System.out.println("Error: Invalid studentNumber.");
        }
    }

    /**
     * @param major A String to set the major of a student.
     */
    public void setMajor(String major) {
        if(major!= null && !major.isEmpty())
        {
            this.major = major.substring(0).toLowerCase();
        }
        else
        {
            System.out.println("Error: Invalid major.");
        }
    }

    /**
     * @param gradePointAverage A double to set the grade point average of a student.
     */
    public void setGradePointAverage(double gradePointAverage) {
        if(gradePointAverage >= 0)
        {
            this.gradePointAverage = gradePointAverage;
        }
        else
        {
            System.out.println("Error: Invalid gradePointAverage.");
        }
    }

    /**
     * @return The student number of a student in String.
     */
    public String getStudentNumber() {
        return this.studentNumber;	
    }

    /**
     * @return The major of a student in String.
     */
    public String getMajor() {
        return this.major;
    }

    /**
     * @return The grade point average of a student in double.
     */
    public double getGradePointAverage() {
        return this.gradePointAverage;
    }

    /**
     * Displays details in the following format:
     * "Mark Zuckerberg is a Student of computer science (st# 12345678). He was born in 1984."
     * or
     * "Michelle Obama is a Student of law (st# 98765432). She was born in 1964."
     */
    public void printDetails() {
        if(this.getGender() == Gender.MALE) {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is a " + this.getClass().getSimpleName() +
                               " of " + this.getMajor() + " (st# " + this.getStudentNumber() + "). He was born in " +
                               this.getYearOfBirth() + ".");
        }
        else {
            System.out.println(this.getFirstName() + " " + this.getLastName() + " is a " + this.getClass().getSimpleName() +
                               " of " + this.getMajor() + " (st# " + this.getStudentNumber() + "). She was born in " +
                               this.getYearOfBirth() + ".");
        }
    }
}