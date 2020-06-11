import java.util.ArrayList;
import java.util.Random;

/**
 * Kennel maintains a collection of Dog objects.
 * 
 * @author Xin Zhao (A00898485)
 * @version 04/16/2020
 */

public class Kennel{
    private ArrayList<Dog> allDogs;

    /**
     * Constructor for objects of class Kennel
     */
    public Kennel(){
        allDogs = new ArrayList<Dog>();
    }
    
    /**
     * Adds a dog to the kennel.
     * @param aDog A dog to add to the kennel.
     */
    public void addDog(Dog aDog){
        if(aDog != null){
            allDogs.add(aDog);
        }
        else{
            throw new IllegalArgumentException("ERROR: invalid input.");
        }
    }
    
    /**
     * Displays name, breed and age of all dogs in the kennel.
     */
    public void displayDetails(){
        if(allDogs != null && allDogs.size() > 0){
            for(Dog aDog : allDogs){
            	System.out.format("%s, %s, %d\n", aDog.getName(), aDog.getBreed(), aDog.getAgeInYears());
            }
        }
        else{
            System.out.println("No dog to display.");
        }
        System.out.println();
    }
    
    /**
     * Randomly selects a dog, returns it, and removes it from the kennel. Returns null if there are no dogs.
     * @return a randomly chosen dog as a Dog
     */
    public Dog getRandomDog(){
        if(allDogs == null || allDogs.size() == 0){
            return null;
        }
    	Random rand = new Random();
        int choosen = rand.nextInt(allDogs.size());
        Dog aDog = allDogs.remove(choosen);
        
        return aDog;
    }
    
    /**
     * Calls getRandomDog() to get a dog, and displays the dog's details on the screen.
     * If there are no dogs it displays this information.
     */
    public void adopt(){
        Dog aDog = getRandomDog();
        if(aDog == null){
            System.out.println("Sorry no dogs to adopt.");
        }
        else{
            System.out.format("You have adopted: %s, %s, %d\n", aDog.getName(), aDog.getBreed(), aDog.getAgeInYears());
        }
        System.out.println();
    }
}