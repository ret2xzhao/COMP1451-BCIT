import java.util.Random;

/**
 * 1.Write a method with the signature int getRandomIntFrom25To35Inclusive() which does exactly what it says.
 */

public class Q1 {

    public Q1() {
        getRandomIntFrom25To35Inclusive();
    }

    int getRandomIntFrom25To35Inclusive() {
        Random  randomInt;
        randomInt = new Random();
        int result = randomInt.nextInt(11) + 25;
        System.out.println(result);
        return result;
    }
}