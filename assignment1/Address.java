/**
 * class Address
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Address {
    // Instance Variables:
    private String streetNumber;
    private String streetName;
    private String city;
    private String postalCode;

    /**
     * Constructor for objects of class Address.
     * @param streetNumber A String to set the street number of an address.
     * @param streetName   A String to set the street name of an address.
     * @param city         A String to set the city of an address.
     * @param postalCode   A String to set the postal code of an address.
     */
    public Address(String streetNumber, String streetName, String city, String postalCode) {
        setStreetNumber(streetNumber);
        setStreetName(streetName);
        setCity(city);
        setPostalCode(postalCode);
    }

    /**
     * Sets the street number of an address.
     * @param streetNumber A String to set the street number of an address.
     */
    public void setStreetNumber(String streetNumber) {
        if(streetNumber != null && !streetNumber.trim().isEmpty()) {
            this.streetNumber = streetNumber;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Address::streetNumber.");
        }
    }

    /**
     * @return The street number of an address in String.
     */
    public String getStreetNumber() {
        return this.streetNumber;
    }

    /**
     * Sets the street name of an address.
     * @param streetName A String to set the street name of an address.
     */
    public void setStreetName(String streetName) {
        if(streetName != null && !streetName.trim().isEmpty()) {
            this.streetName = streetName;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Address::streetName.");
        }
    }

    /**
     * @return The street name of an address in String.
     */
    public String getStreetName() {
        return this.streetName;
    }

    /**
     * Sets the city of an address.
     * @param city A String to set the city of an address.
     */
    public void setCity(String city) {
        if(city != null && !city.trim().isEmpty()) {
            this.city = city;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Address::city.");
        }
    }

    /**
     * @return The city of an address in String.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Sets the postal code of an address.
     * @param postalCode A String to set the postal code of an address.
     */
    public void setPostalCode(String postalCode) {
        if(postalCode != null && !postalCode.trim().isEmpty()) {
            this.postalCode = postalCode;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Address::postalCode.");
        }
    }

    /**
     * @return The postal code of an address in String.
     */
    public String getPostalCode() {
        return this.postalCode;
    }
}