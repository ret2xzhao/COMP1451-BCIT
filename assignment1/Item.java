/**
 * class Item
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public abstract class Item {
    // Instance Variables:
    private double weightKg;
    private double manufacturingPriceDollars;
    private double suggestedRetailPriceDollars;
    private String uniqueID;

    /**
     * Constructor for objects of class Item.
     * @param weightKg                    A double to set the weight in Kg of the Item.
     * @param manufacturingPriceDollars   A double to set the manufacturing price dollars of the Item.
     * @param suggestedRetailPriceDollars A double to set the suggested retail price dollars of the Item.
     * @param uniqueID                    A String to set the unique ID of the Item.
     */
    public Item(double weightKg, double manufacturingPriceDollars, double suggestedRetailPriceDollars, String uniqueID) {
        setWeightKg(weightKg);
        setManufacturingPriceDollars(manufacturingPriceDollars);
        setSuggestedRetailPriceDollars(suggestedRetailPriceDollars);
        setUniqueID(uniqueID);
    }

    /**
     * @return The weight in Kg of the Item in double.
     */
    public double getWeightKg() {
        return this.weightKg;
    }

    /**
     * Sets the weight in Kg of the Item.
     * @param weightKg A double to set the weight in Kg of the Item.
     */
    public void setWeightKg(double weightKg) {
        if(weightKg >= 0) {
            this.weightKg = weightKg;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Item::weightKg.");
        }
    }

    /**
     * @return The manufacturing price dollars of the Item in double.
     */
    public double getManufacturingPriceDollars() {
        return this.manufacturingPriceDollars;
    }

    /**
     * Sets the manufacturing price dollars of the Item.
     * @param manufacturingPriceDollars A double to set the manufacturing price dollars of the Item.
     */
    public void setManufacturingPriceDollars(double manufacturingPriceDollars) {
        if(manufacturingPriceDollars >= 0) {
            this.manufacturingPriceDollars = manufacturingPriceDollars;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Item::manufacturingPriceDollars.");
        }
    }

    /**
     * @return The suggested retail price dollars of the Item in double.
     */
    public double getSuggestedRetailPriceDollars() {
        return this.suggestedRetailPriceDollars;
    }

    /**
     * Sets the suggested retail price dollars of the Item.
     * @param suggestedRetailPriceDollars A double to set the suggested retail price dollars of the Item.
     */
    public void setSuggestedRetailPriceDollars(double suggestedRetailPriceDollars) {
        if(suggestedRetailPriceDollars >= 0) {
            this.suggestedRetailPriceDollars = suggestedRetailPriceDollars;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Item::suggestedRetailPriceDollars.");
        }
    }

    /**
     * @return The unique ID of the Item in String.
     */
    public String getUniqueID() {
        return this.uniqueID;
    }

    /**
     * Sets the unique ID of the Item.
     * @param uniqueID A String to set the unique ID of the Item.
     */
    public void setUniqueID(String uniqueID) {
        if(uniqueID != null && !uniqueID.trim().isEmpty()) {
            this.uniqueID = uniqueID;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Item::uniqueID.");
        }
    }
}