/**
 * class Airplane
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Airplane extends Vehicle implements Steerable, Comparable<Airplane> {
    // Symbolic Constants:
    public static final int MAXIMUM_HEIGHT_FEET_DIFFERENCE = 1000;

    // Instance Variables:
    private int maximumHeightFeet;

    /**
     * Constructor for objects of class Airplane.
     * @param yearManufactured  An integer to set the year manufactured of the Airplane.
     * @param make              A  String to set the make of the Airplane.
     * @param model             A  String to set the model of the Airplane.
     * @param maximumHeightFeet An integer to set the maximum height in feet of the Airplane.
     */
    public Airplane(int yearManufactured, String make, String model, int maximumHeightFeet) {
        super(yearManufactured, make, model);
        setMaximumHeightFeet(maximumHeightFeet);
    }

    /**
     * @return The maximum height in feet of the Airplane in integer.
     */
    public int getMaximumHeightFeet() {
        return this.maximumHeightFeet;
    }

    /**
     * Sets the maximum height in feet of the Airplane.
     * @param maximumHeightFeet An integer to set the maximum height in feet of the Airplane.
     */
    public void setMaximumHeightFeet(int maximumHeightFeet) {
        if(maximumHeightFeet >= 0) {
            this.maximumHeightFeet = maximumHeightFeet;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Airplane::maximumHeightFeet.");
        }
    }

    /**
     * @return An integer to indicate the hash code value for the object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + maximumHeightFeet;
        return result;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Airplanes are equal if their maximumHeightFeet is within 1000 of one another.
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
        Airplane other = (Airplane) obj;
        if (Math.abs(this.getMaximumHeightFeet() - other.getMaximumHeightFeet()) > MAXIMUM_HEIGHT_FEET_DIFFERENCE)
            return false;
        return true;
    }

    /**
     * Returns a string representation of the object.
     * @return e.g. "This airplane is a 1998 ABC Motors Comac that can reach 10000 feet."
     */
    @Override
    public String toString() {
        return "This airplane is a " + this.getYearManufactured() + " " + this.getMake() + " " +  this.getModel() + " that can reach " + this.getMaximumHeightFeet() + " feet.";
    }

    /**
     * @return An integer to indicate the Airplanes that can reach higher maximum heights are "bigger".
     * @param  other The reference Airplane with which to compare.
     */
    @Override
    public int compareTo(Airplane other) {
        return (int)(this.getMaximumHeightFeet() - other.getMaximumHeightFeet());
    }

    /**
     * Displays information for the acceleration of an Airplane.
     */
    @Override
    public void accelerate() {
        System.out.println("fire engines on wings");
    }

    /**
     * Displays information for the steering left of an Airplane.
     */
    @Override
    public void steerLeft() {
        System.out.println("lift wing flaps to turn left");
    }

    /**
     * Displays information for the steering right of an Airplane.
     */
    @Override
    public void steerRight() {
        System.out.println("lift wing flaps to turn right");
    }
}