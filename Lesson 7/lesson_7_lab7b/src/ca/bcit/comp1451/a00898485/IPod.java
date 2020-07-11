package ca.bcit.comp1451.a00898485;

/**
 * class IPod
 *
 * @author Xin Zhao (A00898485) with Manpreet Kaur
 * @version 1.0
 */

public class IPod extends IDevice{
    // Instance Variables:
    private int    numberOfSongsStored;
    private double maximumVolumeInDecibels;

    /**
     * Constructor for objects of class IPod.
     * @param purpose A String to set the purpose of the IPod.
     * @param numberOfSongsStored An integer to set the number of songs stored of the IPod.
     * @param maximumVolumeInDecibels A double to set the maximum volume in decibels of the IPod.
     */
    public IPod(String purpose, int numberOfSongsStored, double maximumVolumeInDecibels) {
        super(purpose);
        setNumberOfSongsStored(numberOfSongsStored);
        setMaximumVolumeInDecibels(maximumVolumeInDecibels);
    }

    /**
     * @return The number of songs stored of the IPod in integer.
     */
    public int getNumberOfSongsStored() {
        return this.numberOfSongsStored;
    }

    /**
     * @param numberOfSongsStored An integer to set the number of songs stored of the IPod.
     */
    public void setNumberOfSongsStored(int numberOfSongsStored) {
        if(numberOfSongsStored >= 0) {
            this.numberOfSongsStored = numberOfSongsStored;
        }
        else {
            throw new IllegalArgumentException("Invalid Ipod::numberOfSongsStored.");
        }
    }

    /**
     * @return The maximum volume in decibels of the IPod in double.
     */
    public double getMaximumVolumeInDecibels() {
        return this.maximumVolumeInDecibels;
    }

    /**
     * @param maximumVolumeInDecibels A double to set the maximum volume in decibels of the IPod.
     */
    public void setMaximumVolumeInDecibels(double maximumVolumeInDecibels) {
        if(maximumVolumeInDecibels >= 0) {
            this.maximumVolumeInDecibels = maximumVolumeInDecibels;
        }
        else {
            throw new IllegalArgumentException("Invalid Ipod::maximumVolumeInDecibels.");
        }
    }

    /**
     * Display the purpose of this IDevice.
     */
    public void printDetails() {
        System.out.println(this.getClass().getSimpleName() + ":   the purpose of this iDevice is " + "\"" + this.getPurpose() + "\"");
    }

    /**
     * Overrides the hashCode() method.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numberOfSongsStored;
        return result;
    }

    /**
     * Overrides the equals() method. IPods with the same number of songs stored are considered equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IPod other = (IPod) obj;
        if (numberOfSongsStored != other.numberOfSongsStored)
            return false;
        return true;
    }

    /**
     * Overrides the toString() method.
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "    [" + super.toString() + ", Number of songs stored: "
             + this.getNumberOfSongsStored() + ", Maximum volume in decibels: " + this.getMaximumVolumeInDecibels() + "]";
    }
}