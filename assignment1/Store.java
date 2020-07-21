import java.util.Collection;
import java.util.HashMap;

/**
 * class Store
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public abstract class Store {
    // Instance Variables:
    private Address streetAddress;
    private String  name;
    private HashMap<String, Item> itemsForSale;

    /**
     * Constructor for objects of class Store.
     * @param streetAddress An Address to set the street address of the Store.
     * @param name          A  String to set the name of the Store.
     */
    public Store(Address streetAddress, String name) {
        setStreetAddress(streetAddress);
        setName(name);
        initItemsForSale();
    }

    /**
     * @return The street address of the Store in Address.
     */
    public Address getStreetAddress() {
        return this.streetAddress;
    }

    /**
     * Sets the street address of the Store.
     * @param streetAddress An Address to set the street address of the Store.
     */
    public void setStreetAddress(Address streetAddress) {
        if(streetAddress != null) {
            this.streetAddress = streetAddress;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Store::streetAddress.");
        }
    }

    /**
     * @return The name of the Store in String.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the Store.
     * @param name A String to set the name of the Store.
     */
    public void setName(String name) {
        if(name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Store::name.");
        }
    }

    /**
     * Initializes a HashMap of items for sale of the Store.
     */
    public void initItemsForSale() {
        itemsForSale = new HashMap<String, Item>();
    }

    /**
     * Adds the specific item to the items for sale of the Store.
     * @param item An Item to be added.
     */
    public void addItem(Item item){
        if(item != null) {
            itemsForSale.put(item.getUniqueID(), item);
        }
    }

    /**
     * @return An Item that indicated by the unique ID.
     * @param uniqueID A String to indicate the unique ID of an item.
     */
    public Item getItemByKey(String uniqueID){
        if(uniqueID != null && !uniqueID.trim().isEmpty()) {
            return itemsForSale.get(uniqueID);
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Store::uniqueID.");
        }
    }

    /**
     * @return A Collection of items for sale of the Store.
     */
    public Collection<Item> getCollectionOfItems(){
        return itemsForSale.values();
    }
}