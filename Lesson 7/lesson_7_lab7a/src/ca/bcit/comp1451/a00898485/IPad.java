package ca.bcit.comp1451.a00898485;

/**
 * class IPad
 *
 * @author Xin Zhao (A00898485) with Manpreet Kaur
 * @version 1.0
 */

public class IPad extends IDevice{
    // Instance Variables:
    private boolean hasACase;
    private String  operatingSystemVersion;

    /**
     * Constructor for objects of class IPad.
     * @param purpose A String to set the purpose of the IPad.
     * @param hasACase A boolean to set if the IPad has a case or not.
     * @param operatingSystemVersion A String to set the operating system version of the IPad.
     */
    public IPad(String purpose, boolean hasACase, String operatingSystemVersion) {
        super(purpose);
        setHasACase(hasACase);
        setOperatingSystemVersion(operatingSystemVersion);
    }

    /**
     * @return A boolean to indicate that if the IPad has a case or not.
     */
    public boolean getHasACase() {
        return this.hasACase;
    }

    /**
     * @param hasACase A boolean to set if the IPad has a case or not.
     */
    public void setHasACase(boolean hasACase) {
        this.hasACase = hasACase;
    }

    /**
     * @return The operating system version of the IPad in String.
     */
    public String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }

    /**
     * @param operatingSystemVersion A String to set the operating system version of the IPad.
     */
    public void setOperatingSystemVersion(String operatingSystemVersion) {
        if(operatingSystemVersion != null && !operatingSystemVersion.isEmpty())
        {
            this.operatingSystemVersion = operatingSystemVersion;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Ipad::operatingSystemVersion.");
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
        result = prime * result + ((operatingSystemVersion == null) ? 0 : operatingSystemVersion.hashCode());
        return result;
    }

    /**
     * Overrides the equals() method. IPads with the same operating system version are considered equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IPad other = (IPad) obj;
        if (operatingSystemVersion == null) {
            if (other.operatingSystemVersion != null)
                return false;
        } else if (!operatingSystemVersion.equals(other.operatingSystemVersion))
            return false;
        return true;
    }

    /**
     * Overrides the toString() method.
     */
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "    [" + super.toString() + ", Has a case: " + this.getHasACase() +
                ", Operating System Version: " + this.getOperatingSystemVersion() + "]";
    }
}