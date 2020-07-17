package ca.bcit.comp1451.a00898485;

/**
 * class GasStationAttendant
 *
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant> {
    // Symbolic Constants:
    public static final double OVERTIME_PAY_RATE = 1.5;

    // Instance Variables:
    private double numberOfDollarsStolenPerDay;

    /**
     * Constructor for objects of class GasStationAttendant.
     * @param numberOfDollarsStolenPerDay A double to set the number of dollars stolen per day of the GasStationAttendant.
     */
    public GasStationAttendant(String name, double numberOfDollarsStolenPerDay) {
        super(name);
        setnumberOfDollarsStolenPerDay(numberOfDollarsStolenPerDay);
    }

    ///**
    // * @return The name of the GasStationAttendant in String.
    // */
    //@Override
    //public String getName() {
    //    return "smith";
    //}

    /**
     * @return The number of dollars stolen per day of the GasStationAttendant in double.
     */
    public double getnumberOfDollarsStolenPerDay() {
        return this.numberOfDollarsStolenPerDay;
    }

    /**
     * Sets the number of dollars stolen per day of the GasStationAttendant.
     * @param numberOfDollarsStolenPerDay A double to set the number of dollars stolen per day of the GasStationAttendant.
     */
    public void setnumberOfDollarsStolenPerDay(double numberOfDollarsStolenPerDay) {
        if(numberOfDollarsStolenPerDay >= 0) {
            this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid GasStationAttendant::numberOfDollarsStolenPerDay.");
        }
    }

    /**
     * @return A String to indicate the dress code.
     */
    @Override
    public String getDressCode() {
        return "uniform";
    }

    /**
     * @return A boolean to indicate if the GasStationAttendant is paid salary or not.
     */
    @Override
    public boolean isPaidSalary() {
        return false;
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
        return "pump";
    }

    /**
     * @return A double to indicate the over time pay rate.
     */
    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }

    /**
     * @return An integer to indicate the GasStationAttendants who steal the most per week are considered "highest".
     */
    @Override
    public int compareTo(GasStationAttendant other) {
        return (int)(this.getnumberOfDollarsStolenPerDay() - other.getnumberOfDollarsStolenPerDay());
    }

    /**
     * Overrides the hashCode().
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(numberOfDollarsStolenPerDay);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * Overrides the equals().
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        GasStationAttendant other = (GasStationAttendant) obj;
        if (Double.doubleToLongBits(this.getnumberOfDollarsStolenPerDay()) != Double.doubleToLongBits(other.getnumberOfDollarsStolenPerDay()))
            return false;
        return true;
    }
}