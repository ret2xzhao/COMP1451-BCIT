import java.awt.Color;

/**
 * class Shoe
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Shoe extends Item{
    // Instance Variables:
    private Material material;
    private int      size;
    private Name     designer;
    private ShoeType shoeType;
    private Color    color;

    /**
     * Constructor for objects of class Shoe.
     * @param weightKg                    A  double to set the weight in Kg of the Shoe.
     * @param manufacturingPriceDollars   A  double to set the manufacturing price dollars of the Shoe.
     * @param suggestedRetailPriceDollars A  double to set the suggested retail price dollars of the Shoe.
     * @param description                 A  String to set the description of the Shoe.
     * @param material                    A  Material to set the material of the Shoe.
     * @param size                        An integer to set the size of the Shoe.
     * @param designer                    A  Name to set the designer of the Shoe.
     * @param shoeType                    A  ShoeType to set the shoe type of the Shoe.
     * @param color                       A  Color to set the color of the Shoe.
     */
    public Shoe(double weightKg, double manufacturingPriceDollars, double suggestedRetailPriceDollars, String description,
                Material material, int size, Name designer, ShoeType shoeType, Color color) {
        super(weightKg, manufacturingPriceDollars, suggestedRetailPriceDollars, description);
        setMaterial(material);
        setSize(size);
        setDesigner(designer);
        setShoeType(shoeType);
        setColor(color);
    }

    /**
     * Sets the material of the Shoe.
     * @param material A Material to set the material of the Shoe.
     */
    public void setMaterial(Material material) {
        if(material != null) {
            this.material = material;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Shoe::material.");
        }
    }

    /**
     * @return The material of the Shoe in Material.
     */
    public Material getMaterial() {
        return this.material;
    }

    /**
     * Sets the size of the Shoe.
     * @param size An integer to set the size of the Shoe.
     */
    public void setSize(int size) {
        if(size > 0) {
            this.size = size;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Shoe::size.");
        }
    }

    /**
     * @return The size of the Shoe in integer.
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Sets the designer of the Shoe.
     * @param designer A Name to set the designer of the Shoe.
     */
    public void setDesigner(Name designer) {
        if(designer != null) {
            this.designer = designer;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Shoe::designer.");
        }
    }

    /**
     * @return The designer of the Shoe in Name.
     */
    public Name getDesigner() {
        return this.designer;
    }

    /**
     * Sets the shoe type of the Shoe.
     * @param shoeType A ShoeType to set the shoe type of the Shoe.
     */
    public void setShoeType(ShoeType shoeType) {
        if(shoeType != null) {
            this.shoeType = shoeType;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Shoe::shoeType.");
        }
    }

    /**
     * @return The shoe type of the Shoe in ShoeType.
     */
    public ShoeType getShoeType() {
        return this.shoeType;
    }

    /**
     * Sets the color of the Shoe.
     * @param color A Color to set the color of the Shoe.
     */
    public void setColor(Color color) {
        if(color != null) {
            this.color = color;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Shoe::color.");
        }
    }

    /**
     * @return The color of the Shoe in Color.
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * Sets the description of the Shoe.
     * @param description A String to set the description of the Shoe.
     */
    public void setDescription(String description){
        if(description != null && !description.trim().isEmpty()) {
            this.setUniqueID(description);
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Shoe::description.");
        }
    }

    /**
     * @return The description of the Shoe in String.
     */
    public String getDescription(){
        return this.getUniqueID();
    }
}