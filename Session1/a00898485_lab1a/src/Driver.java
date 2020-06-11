/**
 * 
 * @author Xin Zhao (A00898485)
 * @version 04/16/2020
 * 
 */
public class Driver{
    /**
     * @param args
     */
    public static void main(String[] args){
        new Driver().test();
    }

    /**
      * Creates dogs and add them to the kennel for testing.
      */
    public void test(){
        // Adding dogs to the kennel:
        Kennel kennel = new Kennel();
        kennel.addDog(new Dog("WW", "Pekingese", 1));
        kennel.addDog(new Dog("Youki", "Golden Retriever", 14));
        kennel.addDog(new Dog("Mocha", "Golden Retriever", 7));
        kennel.addDog(new Dog("GB", "German Shepherd", 0));

        System.out.println("These are the dogs currently in the kennel:");
        kennel.displayDetails();

        // First call adopt():
        kennel.adopt();		
        System.out.println("These are the dogs currently in the kennel:");
        kennel.displayDetails();

        // Second call adopt():
        kennel.adopt();		
        System.out.println("These are the dogs currently in the kennel:");
        kennel.displayDetails();

        // Third call adopt():
        kennel.adopt();		
        System.out.println("These are the dogs currently in the kennel:");
        kennel.displayDetails();

        // Fourth call adopt():
        kennel.adopt();		
        System.out.println("These are the dogs currently in the kennel:");
        kennel.displayDetails();
		
        // There should be no dog.
        kennel.adopt();
    }
}