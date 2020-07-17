package ca.bcit.comp1451.a00898485;

/**
 * class Professor
 *
 * @author Xin Zhao (A00898485) with Nazar Poverlo
 * @version 1.0
 */

public class Professor extends Employee {
    // Symbolic Constants:
    public static final double OVERTIME_PAY_RATE = 2.0;

    // Instance Variables:
    private String teachingMajor;

    /**
     * Constructor for objects of class Professor.
     * @param teachingMajor A String to set the teaching major of the Professor.
     */
    public Professor(String name, String teachingMajor) {
        super(name);
        setTeachingMajor(teachingMajor);
    }

    /**
     * @return The name of the Professor in String.
     */
    @Override
    public String getName() {
        return "einstein";
    }

    /**
     * @return The teaching major of the Professor in String.
     */
    public String getTeachingMajor() {
        return this.teachingMajor;
    }

    /**
     * Sets the teaching major of the Professor.
     * @param teachingMajor A String to set the teaching major of the Professor.
     */
    public void setTeachingMajor(String teachingMajor) {
        if(teachingMajor != null && !teachingMajor.isEmpty()) {
            this.teachingMajor = teachingMajor;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Professor::teachingMajor.");
        }
    }

    /**
     * @return A String to indicate the dress code.
     */
    @Override
    public String getDressCode() {
        return "fancy";
    }

    /**
     * @return A boolean to indicate if the Professor is paid salary or not.
     */
    @Override
    public boolean isPaidSalary() {
        return true;
    }

    /**
     * @return A boolean to indicate if the post secondary education is required or not.
     */
    @Override
    public boolean postSecondaryEducationRequired() {
        return true;
    }

    /**
     * @return A String to indicate the work verb.
     */
    @Override
    public String getWorkVerb() {
        return "teach";
    }

    /**
     * @return A double to indicate the over time pay rate.
     */
    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }
}