package ca.bcit.comp1451.a00898485;

/**
 * class Employee
 *
 * @author Xin Zhao (A00898485) with Nazar Poverlo
 * @version 1.0
 */

public abstract class Employee implements Employable{
    // Instance Variables:
    private String name;

    /**
     * Constructor for objects of class Employee.
     * @param name A String to set the name of the Employee.
     */
    public Employee(String name) {
        setName(name);
    }

    /**
     * @return The name of the Employee in String.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the Employee.
     * @param name A String to set the name of the Employee.
     */
    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Employee::name.");
        }
    }

    public abstract double getOverTimePayRate();
}