package ca.bcit.comp1451.a00898485;

/**
 * class HockeyPlayer
 *
 * @author Xin Zhao (A00898485) with Nazar Poverlo
 * @version 1.0
 */

public class HockeyPlayer extends Employee {
    // Symbolic Constants:
    public static final double OVERTIME_PAY_RATE = 0.0;

    // Instance Variables:
    private int numberOfGoals;

    /**
     * Constructor for objects of class HockeyPlayer.
     * @param numberOfGoals An integer to set the number of goals of the HockeyPlayer scored.
     */
    public HockeyPlayer(String name, int numberOfGoals) {
        super(name);
        setNumberOfGoals(numberOfGoals);
    }

    /**
     * @return The name of the HockeyPlayer in String.
     */
    @Override
    public String getName() {
        return "gretzky";
    }

    /**
     * @return The number of goals of the HockeyPlayer scored in integer.
     */
    public int getNumberOfGoals() {
        return this.numberOfGoals;
    }

    /**
     * Sets the number of goals of the HockeyPlayer scored.
     * @param numberOfGoals An integer to set the number of goals of the HockeyPlayer scored.
     */
    public void setNumberOfGoals(int numberOfGoals) {
        if(numberOfGoals >= 0) {
            this.numberOfGoals = numberOfGoals;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid HockeyPlayer::numberOfGoals.");
        }
    }

    /**
     * @return A String to indicate the dress code.
     */
    @Override
    public String getDressCode() {
        return "jersey";
    }

    /**
     * @return A boolean to indicate if the HockeyPlayer is paid salary or not.
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
        return false;
    }

    /**
     * @return A String to indicate the work verb.
     */
    @Override
    public String getWorkVerb() {
        return "play";
    }

    /**
     * @return A double to indicate the over time pay rate.
     */
    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }
}