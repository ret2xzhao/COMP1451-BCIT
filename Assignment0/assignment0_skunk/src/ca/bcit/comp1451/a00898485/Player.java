package ca.bcit.comp1451.a00898485;

import java.util.Random;
import java.util.Scanner;

/**
 * Class Player
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Player {
    // Symbolic Constants:
    public static final int    NUMBER_OF_DECISIONS =  2 ;
    public static final String PLAY                = "P";
    public static final String STOP                = "S";
    public static final String INTERRUPT           = "I";

    // Instance Variables:
    private String name;
    private String choice;
    private int[]  scoresOfRound = new int[Board.SKUNK_LENGTH];

    /**
     * Constructor for objects of class Player.
     */
    public Player(String name) {
        setName(name);
        initScoresOfRound();
        setChoice(PLAY);
    }

    /**
     * Sets the name of the player.
     * @param name A String to set the name of the player.
     */
    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Invalid Player::name.");
        }
        // System.out.println(this.name + " is all set.");
    }

    /**
     * @return The name of the player in String.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the choice of the player.
     * @param choice A String to set the choice (PLAY, STOP or INTERRUPT) of the player.
     */
    public void setChoice(String choice) {
        if(choice.equalsIgnoreCase(PLAY) || choice.equalsIgnoreCase(STOP) || choice.equalsIgnoreCase(INTERRUPT)) {
            this.choice = choice.toUpperCase();
        }
        else {
            throw new IllegalArgumentException("Invalid Player::choice.");
        }
        // System.out.println(this.getName() + "'s choice is " + this.getChoice());
    }

    /**
     * @return The choice of the player in String.
     */
    public String getChoice() {
        return this.choice;
    }

    /**
     * Resets the choice of the player as PLAY if it is not INTERRUPT.
     */
    public void resetChoice() {
        if(this.getChoice() != INTERRUPT) {
            this.setChoice(PLAY);
        }
    }

    /**
     * Sets the scores of the specific round.
     * @param scores An integer to set the scores of the specific round.
     * @param index An integer to set the specific round.
     */
    public void setScoresOfRound(int scores, int index) {
        if(scores >= 0) {
            this.scoresOfRound[index] = scores;
        }
        else {
            throw new IllegalArgumentException("Invalid Player::scores.");
        }
    }

    /**
     * @return The scores of the specific round in integer.
     * @param index An integer to set the specific round.
     */
    public int getScoresOfRound(int index) {
        return this.scoresOfRound[index];
    }

    /**
     * Adds the scores to a specific round.
     * @param scores An integer to add the scores to a specific round.
     * @param index An integer to set the specific round.
     */
    public void addScores(int scores, int index) {
        if(scores >= 0) {
            this.scoresOfRound[index] = this.scoresOfRound[index] + scores;
        }
        else {
            throw new IllegalArgumentException("Invalid Player::scores.");
        }
    }

    /**
     * Initializes the int[] scoresOfRound.
     */
    public void initScoresOfRound() {
        for(int i=0; i<Board.SKUNK_LENGTH; i++) {
            this.scoresOfRound[i] = 0;
        }
        // System.out.println("Initialization of " + this.getName() + "'s int[] scoresOfRound is done.");
    }

    /**
     * @return The total scores of the game this player played in integer.
     */
    public int getScoresOfGame() {
        int count = 0;
        for(int i=0; i<Board.SKUNK_LENGTH; i++) {
            count = count + scoresOfRound[i];
        }
        return count;
    }

    /**
     * Displays the scores of the specific round.
     * @param index An integer to set the specific round.
     */
    public void displayScoresOfRound(int index) {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("         This round: " + this.getName() + "'s scores are " + this.getScoresOfRound(index) + ".");
        System.out.println("---------------------------------------------------------------------------------------");
    }

    /**
     * Prompts the computer's choice (PLAY or STOP).
     */
    public void promptComputerChoice() {
        Random random = new Random();
        int result = random.nextInt(NUMBER_OF_DECISIONS);
        if(result == 0) {
            setChoice(STOP);
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("||||||||||||||||||||||||||<<<<    AI's choice is STOP.    >>>>|||||||||||||||||||||||||");
            System.out.println("---------------------------------------------------------------------------------------");
        }
        else {
            setChoice(PLAY);
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("||||||||||||||||||||||||||<<<<    AI's choice is PLAY.    >>>>|||||||||||||||||||||||||");
            System.out.println("---------------------------------------------------------------------------------------");
        }
    }

    /**
     * Prompts the player's choice (PLAY or STOP).
     */
    public void promptPlayerChoice() {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("|||||||||||||||||<<<<    Please choose P to play or S to stop:    >>>>|||||||||||||||||");
        System.out.println("---------------------------------------------------------------------------------------");
        Scanner keyboardScanner = new Scanner(System.in);

        while(keyboardScanner.hasNext()) {
            String choice = keyboardScanner.next();
            if(choice.equalsIgnoreCase(PLAY)) {
                setChoice(PLAY);
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("||||||||||||||||||||||||||<<<<    Your choice is PLAY.    >>>>|||||||||||||||||||||||||");
                System.out.println("---------------------------------------------------------------------------------------");
                return;
            }
            else if(choice.equalsIgnoreCase(STOP)) {
                setChoice(STOP);
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("||||||||||||||||||||||||||<<<<    Your choice is STOP.    >>>>|||||||||||||||||||||||||");
                System.out.println("---------------------------------------------------------------------------------------");
                return;
            }
            else {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("|||||||||<<<<    Invalid input! Please choose P to play or S to stop:    >>>>||||||||||");
                System.out.println("---------------------------------------------------------------------------------------");
            }
        }
    }
}