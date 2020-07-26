/**
 * class Boat
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Boat extends Vehicle implements Steerable, Comparable<Boat> {
    // Instance Variables:
    private boolean motorized;

    /**
     * Constructor for objects of class Boat.
     * @param yearManufactured An integer to set the year manufactured of the Boat.
     * @param make             A  String to set the make of the Boat.
     * @param model            A  String to set the model of the Boat.
     * @param motorized        A  boolean to set if the Boat is motorized or not.
     */
    public Boat(int yearManufactured, String make, String model, boolean motorized) {
        super(yearManufactured, make, model);
        setMotorized(motorized);
    }

    /**
     * @return The boolean if the Boat is motorized or not.
     */
    public boolean getMotorized() {
        return this.motorized;
    }

    /**
     * Sets the boolean if the Boat is motorized or not.
     * @param motorized A boolean to set if the Boat is motorized or not.
     */
    public void setMotorized(boolean motorized) {
        this.motorized = motorized;
    }

    /**
     * @return An integer to indicate the hash code value for the object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (motorized ? 1231 : 1237);
        return result;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Boats are equal if they are both motorized, or both unmotorized.
     * @return A boolean to indicate if this object is the same as the obj argument.
     * @param obj The reference Object with which to compare.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Boat other = (Boat) obj;
        if (this.getMotorized() != other.getMotorized())
            return false;
        return true;
    }

    /**
     * Returns a string representation of the object.
     * @return e.g. "This boat is a 1980 Bayliner Extreme (with motor)."
     */
    @Override
    public String toString() {
        if(this.getMotorized()) {
            return "This boat is a " + this.getYearManufactured() + " " + this.getMake() + " " +  this.getModel() + " (with motor).";
        }
        else {
            return "This boat is a " + this.getYearManufactured() + " " + this.getMake() + " " +  this.getModel() + " (without motor).";
        }
    }

    /**
     * @return An integer to indicate the Boats that are newer are "bigger".
     * @param  other The reference Boat with which to compare.
     */
    @Override
    public int compareTo(Boat other) {
        return (int)(this.getYearManufactured() - other.getYearManufactured());
    }

    /**
     * Displays information for the acceleration of a Boat.
     */
    @Override
    public void accelerate() {
        System.out.println("jet water");
    }

    /**
     * Displays information for the steering left of a Boat.
     */
    @Override
    public void steerLeft() {
        System.out.println("turn tiller left");
    }

    /**
     * Displays information for the steering right of a Boat.
     */
    @Override
    public void steerRight() {
        System.out.println("turn tiller right");
    }
}