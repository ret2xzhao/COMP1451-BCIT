package three;

public class Student
{
    private String studentNumber;
    private String lastName;
    private int    yearBorn;

    /**
     * @param studentNumber
     * @param lastName
     * @param yearBorn
     */
    public Student(String studentNumber, String lastName, int yearBorn) {
        this.studentNumber = studentNumber;
        this.lastName = lastName;
        this.yearBorn = yearBorn;
    }

    /**
     * @return the studentNumber
     */
    public String getStudentNumber() {
        return studentNumber;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the yearBorn
     */
    public int getYearBorn() {
        return yearBorn;
    }
}