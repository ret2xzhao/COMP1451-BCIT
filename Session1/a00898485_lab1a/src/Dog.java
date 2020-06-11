/**
 * Dog has instance variables for name, breed, and age in years.
 * 
 * @author Xin Zhao (A00898485)
 * @version 04/16/2020
 */

public class Dog{
    private String name;
    private String breed;
    private int ageInYears;

    /**
     * Default constructor for objects of class Dog.
     */
    public Dog(){
    }

    /**
     * Constructor for objects of class Dog.
     * @param name A string to set the dog name.
     * @param breed A string to set the dog breed.
     * @param ageInYears An int to set the dog age in years.
     */
    public Dog(String name, String breed, int ageInYears){
        setName(name);
        setBreed(breed);
        setAgeInYears(ageInYears);
    }
    
    /**
     * Sets the dog name.
     * @param name A string to set the dog name.
     */
    public void setName(String name){
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
        else{
            //throw new IllegalArgumentException("ERROR: invalid input.");
            System.out.println("ERROR: invalid input.");
        }
    }
    
    /**
     * Gets the dog name.
     * @return the dog name as a String.
     */
    public String getName(){
        return name;
    }
    
    /**
     * Sets the dog breed.
     * @param breed A string to set the dog breed.
     */
    public void setBreed(String breed){
    	if(breed != null && !breed.isEmpty()){
            this.breed = breed;
        }
        else{
            //throw new IllegalArgumentException("ERROR: invalid input.");
            System.out.println("ERROR: invalid input.");
        }
    }
    
    /**
     * Gets the dog breed.
     * @return the dog breed as a String.
     */
    public String getBreed(){
        return breed;
    }
    
    /**
     * Sets the dog age in years.
     * @param ageInYears An int to set the dog age in years.
     */
    public void setAgeInYears(int ageInYears){
        if(ageInYears >= 0){
            this.ageInYears = ageInYears;
        }
        else{
            //throw new IllegalArgumentException("ERROR: invalid input.");
            System.out.println("ERROR: invalid input.");
        }
    }
    
    /**
     * Gets the dog age in years.
     * @return the dog age in years as an int.
     */
    public int getAgeInYears(){
        return ageInYears;
    }
}