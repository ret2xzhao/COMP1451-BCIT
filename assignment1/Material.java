import java.util.HashMap;
import java.util.Map;

/**
 * enum Material
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public enum Material {
    PLASTIC ("plastic"),
    LEATHER ("leather"),
    RUBBER  ("rubber"),
    CLOTH   ("cloth");

    private String theMaterial;
    private static Map<String, Material> lookup = new HashMap<String, Material>();

    static{
        for (Material m : Material.values()){
            lookup.put(m.getTheMaterial(), m);
        }
    }

    /**
     * Constructor for enum Material.
     * @param theMaterial A String to set the type of the material.
     */
    private Material(String theMaterial) {
        this.theMaterial = theMaterial;
    }

    /**
     * @return A String indicated the type of the material.
     */
    public String getTheMaterial() {
        return theMaterial;
    }

    /**
     * Creates a Material enum from a String.
     * @param theMaterial A String to set the type of the material.
     * @return A Material enum.
     */
    public static Material get(String theMaterial) {
        return lookup.get(theMaterial);
    }
}