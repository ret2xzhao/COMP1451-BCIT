package ca.bcit.comp1451.a00898485;

/**
 * class IDevice
 *
 * @author Xin Zhao (A00898485) with Manpreet Kaur
 * @version 1.0
 */

public abstract class IDevice {
    // Instance Variables:
    private String purpose;

    /**
     * Constructor for objects of class IDevice.
     * @param purpose A String to set the purpose of the IDevice.
     */
    public IDevice(String purpose) {
        setPurpose(purpose);
    }

    /**
     * @return The purpose of the IDevice in String.
     */
    public String getPurpose() {
        return this.purpose;
    }

    /**
     * @param purpose A String to set the purpose of the IDevice.
     */
    public void setPurpose(String purpose) {
        if(purpose != null && !purpose.isEmpty())
        {
            this.purpose = purpose;
        }
        else
        {
            throw new IllegalArgumentException("Error: Invalid IDevice::purpose.");
        }
    }

    /**
     * Abstract method printDetails().
     */
    public abstract void printDetails();

    /**
     * Overrides the toString() method.
     */
    @Override
    public String toString() {
        return "Purpose: " + purpose;
    }
}