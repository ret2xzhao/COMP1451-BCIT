package ca.bcit.comp1451.a00898485;

/**
 * class IPhoneSeven
 *
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class IPhoneSeven extends IPhone{
    // Instance Variables:
    private boolean highResolutionCamera;
    private int     gigabytesOfMemory;

    /**
     * Constructor for objects of class IPhoneSeven.
     * @param purpose A String to set the purpose of the IPhoneSeven.
     * @param minutesRemainingOnPhonePlan A double to set the number of minutes remaining on phone plan of the IPhoneSeven.
     * @param carrier A String to set the carrier of the IPhoneSeven.
     * @param highResolutionCamera A boolean to indicate that if the IPhoneSeven has a high resolution camera or not.
     * @param gigabytesOfMemory An integer to set the giga bytes of memory of the IPhoneSeven.
     */
    public IPhoneSeven(String purpose, double minutesRemainingOnPhonePlan, String carrier,
                       boolean highResolutionCamera, int gigabytesOfMemory) {
        super(purpose, minutesRemainingOnPhonePlan, carrier);
        setHighResolutionCamera(highResolutionCamera);
        setGigabytesOfMemory(gigabytesOfMemory);
    }

    /**
     * @return A boolean to indicate that if the IPhoneSeven has a high resolution camera or not.
     */
    public boolean getHighResolutionCamera() {
        return this.highResolutionCamera;
    }

    /**
     * @param highResolutionCamera A boolean to indicate that if the IPhoneSeven has a high resolution camera or not.
     */
    public void setHighResolutionCamera(boolean highResolutionCamera) {
        this.highResolutionCamera = highResolutionCamera;
    }

    /**
     * @return The giga bytes of memory of the IPhoneSeven in integer.
     */
    public int getGigabytesOfMemory() {
        return this.gigabytesOfMemory;
    }

    /**
     * @param gigabytesOfMemory An integer to set the giga bytes of memory of the IPhoneSeven.
     */
    public void setGigabytesOfMemory(int gigabytesOfMemory) {
        if(gigabytesOfMemory >= 0) {
            this.gigabytesOfMemory = gigabytesOfMemory;
        }
        else {
            throw new IllegalArgumentException("Invalid IPhoneSeven::gigabytesOfMemory.");
        }
    }

    /**
     * Overrides the toString() method.
     */
    @Override
    public String toString() {
        return super.toString() + "\n             [Has a high resolution camera: " + getHighResolutionCamera()
                                + ", The giga bytes of memory: " + getGigabytesOfMemory() + "]";
    }

    /**
     * Overrides the hashCode() method.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + (highResolutionCamera ? 1231 : 1237);
        return result;
    }

    /**
     * Overrides the equals() method. IPhoneSevens that have +/- 10 minutes of each other¡¯s number of minutes
     * remaining on their phone plan are considered equal, but only if they also have the same value for
     * "high-resolution camera".
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IPhoneSeven other = (IPhoneSeven) obj;
        double difference = Math.abs(this.getMinutesRemainingOnPhonePlan() - other.getMinutesRemainingOnPhonePlan());
        if((highResolutionCamera == other.highResolutionCamera) && (difference <= DIFFERENCE)) {
            return true;
        }
        return false;
    }
}