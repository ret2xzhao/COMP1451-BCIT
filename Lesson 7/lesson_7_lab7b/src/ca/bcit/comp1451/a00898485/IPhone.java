package ca.bcit.comp1451.a00898485;

/**
 * class IPhone
 *
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public abstract class IPhone extends IDevice{
    // Symbolic Constants:
    public static final double DIFFERENCE = 10.0;

    // Instance Variables:
    private double minutesRemainingOnPhonePlan;
    private String carrier;

    /**
     * Constructor for objects of class IPhone.
     * @param purpose A String to set the purpose of the IPhone.
     * @param minutesRemainingOnPhonePlan A double to set the number of minutes remaining on phone plan of the IPhone.
     * @param carrier A String to set the carrier of the IPhone.
     */
    public IPhone(String purpose, double minutesRemainingOnPhonePlan, String carrier) {
        super(purpose);
        setMinutesRemainingOnPhonePlan(minutesRemainingOnPhonePlan);
        setCarrier(carrier);
    }

    /**
     * @return The number of minutes remaining on phone plan of the IPhone in double.
     */
    public double getMinutesRemainingOnPhonePlan() {
        return this.minutesRemainingOnPhonePlan;
    }

    /**
     * @param minutesRemainingOnPhonePlan A double to set the number of minutes remaining on phone plan of the IPhone.
     */
    public void setMinutesRemainingOnPhonePlan(double minutesRemainingOnPhonePlan) {
        if(minutesRemainingOnPhonePlan >= 0) {
            this.minutesRemainingOnPhonePlan = minutesRemainingOnPhonePlan;
        }
        else {
            throw new IllegalArgumentException("Invalid Iphone::minutesRemainingOnPhonePlan.");
        }
    }

    /**
     * @return The carrier of the IPhone in String.
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * @param carrier A String to set the carrier of the IPhone.
     */
    public void setCarrier(String carrier) {
        if(carrier != null && !carrier.isEmpty())
        {
            this.carrier = carrier;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Iphone::carrier.");
        }
    }

    /**
     * Display the purpose of this IDevice.
     */
    public void printDetails() {
        System.out.println(this.getClass().getSimpleName() + ": the purpose of this iDevice is " + "\"" + this.getPurpose() + "\"");
    }

    /**
     * Overrides the hashCode() method.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(minutesRemainingOnPhonePlan);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * Overrides the equals() method. IPhones which have +/- 10 minutes of each other¡¯s number of minutes remaining
     * on their phone plan are considered equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IPhone other = (IPhone) obj;
        double difference = Math.abs(this.minutesRemainingOnPhonePlan - other.minutesRemainingOnPhonePlan);
        if (difference > DIFFERENCE) {
            return false;
        }
        return true;
    }

    /**
     * Overrides the toString() method.
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "  [" + super.toString() + ", Number of minutes remaining on phone plan: "
             + this.getMinutesRemainingOnPhonePlan() + ", Carrier: " + this.getCarrier() + "]";
    }
}
