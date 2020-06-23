package two;

import java.util.Random;
import java.util.Scanner;

public class Game
{
    public static final int MIN = 100;
    public static final int MAX = 200;
    public static final String QUIT = "Q";

    /**
     * randomly pick a number MIN-MAX inclusive
     * ask user to guess it
     * give feedback about user guess:
     * - not an int
     * - int, but out of range
     * - in range, but wrong
     * - correct guess
     * @param args
     */
    public static void main(String[] args) {
        Random  r;
        r = new Random();
        int computerNumber = r.nextInt(MAX-MIN+1) + MIN; // MIN-MAX, inclusive

        Scanner keyboardScanner;
        keyboardScanner = new Scanner(System.in); // System.in by default is keyboard

        boolean keepPlaying;
        keepPlaying = true;
        int userInt;
        String userString;
        System.out.print("Guess the number between " + MIN + " and " + MAX + " (or " + QUIT + " to quit): ");

        while(keepPlaying){
            if(keyboardScanner.hasNext()){
                if(keyboardScanner.hasNextInt()){
                    userInt = keyboardScanner.nextInt();
                    /*
                     * Validates the user's integer input compared to the computer number
                     */
                    if(userInt < MIN){
                        System.out.println(userInt + " is too low");}
                    else if(userInt > MAX){
                        System.out.println(userInt + " is too high");}
                    else if(userInt == computerNumber){
                        System.out.println(userInt + " is CORRECT!");
                        computerNumber = r.nextInt(MAX-MIN+1) + MIN; // MIN-MAX, inclusive
                    }
                    else {System.out.println(userInt + " is INCORRECT!");}
                }
                else{ // not an integer
                    userString = keyboardScanner.next();
                    if(userString.equalsIgnoreCase(QUIT)){
                        keepPlaying = false;
                        System.out.println("You chose to quit");
                        break; // end the whole loop
                    }
                    else{ // a string, but not QUIT string
                        System.err.println(userString + " is an error");}
                }
            }
            System.out.print("Play again; pick another number from " + MIN + " to " + MAX + " or " + QUIT + " to quit: ");
            // computerNumber = r.nextInt(MAX-MIN+1) + MIN; // MIN-MAX, inclusive
        }
        System.out.println("Thanks for playing");
    }
}