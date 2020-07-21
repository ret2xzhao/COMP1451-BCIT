import java.awt.Color;
import java.util.Collection;
import java.util.Iterator;

/**
 * class ShoeStore
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class ShoeStore extends Store{
    // Instance Variables:
    private ShoeType department;

    /**
     * Constructor for objects of class ShoeStore.
     * @param streetAddress An Address to set the street address of the ShoeStore.
     * @param name          A  String to set the name of the ShoeStore.
     * @param department    A  ShoeType to set the department of the ShoeStore.
     */
    public ShoeStore(Address streetAddress, String name, ShoeType department) {
        super(streetAddress, name);
        setDepartment(department);
        addShoes();
    }

    /**
     * Constructor for objects of class ShoeStore.
     * @param streetAddress An Address to set the street address of the ShoeStore.
     * @param name          A  String to set the name of the ShoeStore.
     * @param department    A  String to set the department of the ShoeStore.
     */
    public ShoeStore(Address streetAddress, String name, String department) {
        super(streetAddress, name);
        setDepartment(department);
        addShoes();
    }

    /**
     * Sets the department of the ShoeStore.
     * @param department A ShoeType to set the department of the ShoeStore.
     */
    public void setDepartment(ShoeType department) {
        if(department != null) {
            this.department = department;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid ShoeStore::department.");
        }
    }

    /**
     * Sets the department of the ShoeStore.
     * @param department A String to set the department of the ShoeStore.
     */
    public void setDepartment(String department) {
        if(department != null && !department.trim().isEmpty()) {
            this.department = ShoeType.get(department);
        }
        else {
            throw new IllegalArgumentException("Error: Invalid ShoeStore::department.");
        }
    }

    /**
     * @return The department of the shoe store in ShoeType.
     */
    public ShoeType getDepartment() {
        return this.department;
    }

    /**
     * Adds shoes to its (parent¡¯s) HashMap. The key is the Shoe Item¡¯s uniqueID String; and the value is the Shoe. 
     */    
    public void addShoes() {
        Name designer = new Name("Sketchers");
        ShoeType department = ShoeType.get("men");
        Shoe s = new Shoe(1, 58.5, 90, "Diameter", Material.LEATHER, 10, designer, department, Color.DARK_GRAY);
        addItem(s);

        designer = new Name("Robert", "Cobbler");
        department = ShoeType.get("dress");
        s = new Shoe(1.15, 104, 160, "Wave", Material.LEATHER, 12, designer, department, Color.BLACK);
        addItem(s);

        designer = new Name("Geox");
        department = ShoeType.get("men");
        s = new Shoe(1, 110.5, 170, "Monet", Material.CLOTH, 7, designer, department, Color.BLUE);
        addItem(s);

        designer = new Name("Nine", "West");
        department = ShoeType.get("women");
        s = new Shoe(0.85, 84.5, 130, "Camya Multi Glitter", Material.PLASTIC, 8, designer, department, Color.BLACK);
        addItem(s);

        designer = new Name("Geox");
        department = ShoeType.get("women");
        s = new Shoe(0.9, 97.5, 150, "Marieclaire", Material.PLASTIC, 10, designer, department, Color.GRAY);
        addItem(s);

        designer = new Name("Stride", "Rite");
        department = ShoeType.get("children");
        s = new Shoe(0.6, 45.5, 70, "Balance Of The Force", Material.RUBBER, 9, designer, department, Color.GRAY);
        addItem(s);

        designer = new Name("Sperry");
        department = ShoeType.get("children");
        s = new Shoe(0.7, 39, 60, "Top-Sider Unisex Bluefish H&L", Material.CLOTH, 9, designer, department, Color.ORANGE);
        addItem(s);

        designer = new Name("Sketchers");
        department = ShoeType.get("children");
        s = new Shoe(0.85, 32.5, 50, "Lite Kicks Rainbow Sprite", Material.PLASTIC, 10, designer, department, Color.PINK);
        addItem(s);

        designer = new Name("Robert", "Cobbler");
        department = ShoeType.get("children");
        s = new Shoe(0.5, 39, 60, "Toachi", Material.CLOTH, 5, designer, department, Color.BLUE);
        addItem(s);

        designer = new Name("Nike");
        department = ShoeType.get("sports");
        s = new Shoe(1.2, 117, 180, "Jordan Ace 23 II", Material.RUBBER, 13, designer, department, Color.WHITE);
        addItem(s);
    }

    /**
     * Displays all shoes and the designers.
     */
    public void displayAllShoesAndDesigners() {
        Collection<Item> shoes = getCollectionOfItems();
        Iterator  <Item> it    = shoes.iterator();
        while(it.hasNext()){
            Shoe s = (Shoe) it.next();
            System.out.println(s.getDesigner().getFullName() + " offers " + s.getMaterial().getTheMaterial() 
                               + " size-" + s.getSize() + " " + s.getShoeType().getTheShoeType() + "'s " + s.getDescription());
        }
    }

    /**
     * Displays all shoes by the specific designer.
     * @param designerName A String to indicate the name of the designer.
     */
    public void displayAllShoesByDesigner(String designerName) {
        if(designerName != null) {
            Collection<Item> shoes = getCollectionOfItems();
            Iterator  <Item> it    = shoes.iterator();
            while(it.hasNext()){
                Shoe s = (Shoe) it.next();
                if(s.getDesigner().getFullName().equals(designerName)) {
                    System.out.println(s.getDesigner().getFullName() + " offers a size-" + s.getSize() + " " + s.getShoeType().getTheShoeType() + "'s " + s.getDescription());
                }
            }
        }
    }

    /**
     * Displays all shoes made of the specific material.
     * @param material A Material to indicate the material.
     */
    public void displayAllShoesMadeOf(Material material) {
        if(material != null) {
            Collection<Item> shoes = getCollectionOfItems();
            Iterator  <Item> it    = shoes.iterator();
            while(it.hasNext()){
                Shoe s = (Shoe) it.next();
                if(s.getMaterial().equals(material)) {
                    System.out.println("The size-" + s.getSize() + " " + s.getDescription() + " is made of " + s.getMaterial().getTheMaterial());
                }
            }
        }
    }

    /**
     * Displays all shoes made of the specific material.
     * @param material A String to indicate the material.
     */
    public void displayAllShoesMadeOf(String material) {
        if(material != null) {
            Collection<Item> shoes = getCollectionOfItems();
            Iterator  <Item> it    = shoes.iterator();
            while(it.hasNext()){
                Shoe s = (Shoe) it.next();
                if(s.getMaterial().getTheMaterial().equals(material)) {
                    System.out.println("The size-" + s.getSize() + " " + s.getDescription() + " is made of " + s.getMaterial().getTheMaterial());
                }
            }
        }
    }

    /**
     * Displays the number of shoes designed by the indicated designer.
     * @param designer A Name to indicate the designer.
     */
    public void displayNumberOfShoesDesignedBy(Name designer) {
        if(designer != null) {
            int num = 0;
            Collection<Item> shoes = getCollectionOfItems();
            Iterator  <Item> it    = shoes.iterator();
            while(it.hasNext()){
                Shoe s = (Shoe) it.next();
                if(s.getDesigner().getFullName().equals(designer.getFullName())) {
                    num++;
                }
            }
            System.out.println("This store has " + num + " shoes designed by " + designer.getFullName());
        }
    }

    /**
     * Displays the number of shoes designed by the indicated designer.
     * @param designerLastName A String to indicate the last name of the designer.
     */
    public void displayNumberOfShoesDesignedBy(String designerLastName) {
        if(designerLastName != null) {
            int num = 0;
            Collection<Item> shoes = getCollectionOfItems();
            Iterator  <Item> it    = shoes.iterator();
            while(it.hasNext()){
                Shoe s = (Shoe) it.next();
                if(s.getDesigner().getLastName().equals(designerLastName)) {
                    num++;
                }
            }
            System.out.println("This store has " + num + " shoes designed by " + designerLastName);
        }
    }

    /**
     * Displays the smallest shoe size.
     */
    public void displaySmallestShoeSize () {
        int smallestSize = 999;
        Collection<Item> shoes = getCollectionOfItems();
        Iterator  <Item> it    = shoes.iterator();
        while(it.hasNext()){
            Shoe s = (Shoe) it.next();
            if(s.getSize() <= smallestSize) {
                smallestSize = s.getSize();
            }
        }
        System.out.println("smallest shoe size: " + smallestSize);
    }

    /**
     * Displays total weight of all shoes in Kg.
     */
    public void displayTotalWeightKgOfAllShoes() {
        double totalWeight = 0.0;
        Collection<Item> shoes = getCollectionOfItems();
        Iterator  <Item> it    = shoes.iterator();
        while(it.hasNext()){
            Shoe s = (Shoe) it.next();
            totalWeight = totalWeight + s.getWeightKg();
        }
        System.out.println("total kg of shoes: " + totalWeight);
    }

    /**
     * Displays all shoes made of the indicated material by the specific designer.
     * @param m A Material to indicate the material.
     * @param designer A Name to indicate the designer.
     */
    public void displayAllShoesOfThisMaterialMadeByThisDesigner(Material m, Name designer) {
        if(designer != null && m != null) {
            Collection<Item> shoes = getCollectionOfItems();
            Iterator  <Item> it    = shoes.iterator();
            boolean ifFound = false;
            while(it.hasNext()){
                Shoe s = (Shoe) it.next();
                if(s.getMaterial().equals(m) && s.getDesigner().getFullName().equals(designer.getFullName())) {
                    ifFound = true;
                    System.out.println("The " + s.getDescription() + " is a " + s.getMaterial().getTheMaterial() + " shoe offered by " + designer.getFullName());
                }
            }
            if(ifFound == false) {
                System.out.println("This store has no " + m.getTheMaterial() + " shoes designed by " + designer.getFullName());
            }
        }
    }

    /**
     * Displays all shoes not in the matching store.
     * e.g. For a shoe store with department ¡°WOMEN¡±, show all the shoes of type MEN, CHILDREN, SPORTS, and DRESS
     */
    public void displayAllShoesNotInMatchingStore() {
        Collection<Item> shoes = getCollectionOfItems();
        Iterator  <Item> it    = shoes.iterator();
        while(it.hasNext()){
            Shoe s = (Shoe) it.next();
            if(!s.getShoeType().getTheShoeType().equals(this.getDepartment().getTheShoeType())) {
                System.out.println("The " + s.getDescription() + " is a " + s.getShoeType().getTheShoeType() + "'s shoe offered by " + s.getDesigner().getFullName());
            }
        }
    }
}