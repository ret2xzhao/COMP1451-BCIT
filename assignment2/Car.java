/**
 * class Car
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Car extends Vehicle implements Steerable, Comparable<Car> {
    // Symbolic Constants:
    public static final int HORSEPOWER_DIFFERENCE = 10;

    // Instance Variables:
    private int horsepower;

    /**
     * Constructor for objects of class Car.
     * @param yearManufactured An integer to set the year manufactured of the Car.
     * @param make             A  String to set the make of the Car.
     * @param model            A  String to set the model of the Car.
     * @param horsepower       An integer to set the horsepower of the Car.
     */
    public Car(int yearManufactured, String make, String model, int horsepower) {
        super(yearManufactured, make, model);
        setHorsepower(horsepower);
    }

    /**
     * @return The horsepower of the Car in integer.
     */
    public int getHorsepower() {
        return this.horsepower;
    }

    /**
     * Sets the horsepower of the Car.
     * @param horsepower An integer to set the horsepower of the Car.
     */
    public void setHorsepower(int horsepower) {
        if(horsepower >= 0) {
            this.horsepower = horsepower;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Car::horsepower.");
        }
    }

    /**
     * @return An integer to indicate the hash code value for the object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + horsepower;
        return result;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Cars are equal if their horsepower is within 10 of one another.
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
        Car other = (Car) obj;
        if (Math.abs(this.horsepower - other.horsepower) > HORSEPOWER_DIFFERENCE)
            return false;
        return true;
    }

    /**
     * Returns a string representation of the object.
     * @return e.g. "This car is a 1999 Toyota Corrola with 140 hp."
     */
    @Override
    public String toString() {
        return "This car is a " + this.getYearManufactured() + " " + this.getMake() + " " +  this.getModel() + " with " + this.getHorsepower() + " hp.";
    }

    /**
     * @return An integer to indicate the Cars that have more horsepower are "bigger".
     * @param  other The reference Car with which to compare.
     */
    @Override
    public int compareTo(Car other) {
        return (int)(this.getHorsepower() - other.getHorsepower());
    }

    /**
     * Displays information for the acceleration of a Car.
     */
    @Override
    public void accelerate() {
        System.out.println("fire pistons, turn wheels");
    }

    /**
     * Displays information for the steering left of a Car.
     */
    @Override
    public void steerLeft() {
        System.out.println("turn wheels left");
    }

    /**
     * Displays information for the steering right of a Car.
     */
    @Override
    public void steerRight() {
        System.out.println("turn wheels right");
    }
}