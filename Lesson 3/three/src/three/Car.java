package three;

public class Car
{
    private String make;
    private String model;

    /**
     * @param make
     * @param model
     */
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }
}