/**
 * class Vehicle
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public abstract class Vehicle {
    // Instance Variables:
    private int    yearManufactured;
    private String make;
    private String model;

    /**
     * Constructor for objects of class Vehicle.
     * @param yearManufactured An integer to set the year manufactured of the Vehicle.
     * @param make             A  String to set the make of the Vehicle.
     * @param model            A  String to set the model of the Vehicle.
     */
    public Vehicle(int yearManufactured, String make, String model) {
        setYearManufactured(yearManufactured);
        setMake(make);
        setModel(model);
    }

    /**
     * @return The year manufactured of the Vehicle in integer.
     */
    public int getYearManufactured() {
        return this.yearManufactured;
    }

    /**
     * Sets the year manufactured of the Vehicle.
     * @param yearManufactured An integer to set the year manufactured of the Vehicle.
     */
    public void setYearManufactured(int yearManufactured) {
        if(yearManufactured >= 0) {
            this.yearManufactured = yearManufactured;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Vehicle::yearManufactured.");
        }
    }

    /**
     * @return The make of the Vehicle in String.
     */
    public String getMake() {
        return this.make;
    }

    /**
     * Sets the make of the Vehicle.
     * @param make A String to set the make of the Vehicle.
     */
    public void setMake(String make) {
        if(make != null && !make.isEmpty()) {
            this.make = make;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Vehicle::make.");
        }
    }

    /**
     * @return The model of the Vehicle in String.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Sets the model of the Vehicle.
     * @param model A String to set the model of the Vehicle.
     */
    public void setModel(String model) {
        if(model != null && !model.isEmpty()) {
            this.model = model;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Vehicle::model.");
        }
    }
}