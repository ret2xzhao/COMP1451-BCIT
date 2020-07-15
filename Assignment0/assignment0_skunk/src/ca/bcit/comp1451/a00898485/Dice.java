package ca.bcit.comp1451.a00898485;

import java.util.Random;

/**
 * class Dice
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Dice {
    //Symbolic Constants:
    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 6;

    // Instance Variables:
    private int number;

    /**
     * Constructor for objects of class Dice.
     */
    public Dice() {
        setNumber(MIN_NUM);
    }

    /**
     * @return The number rolled in integer.
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * Sets the number rolled.
     * @param number An integer to set the number rolled (1 to 6 inclusive).
     */
    public void setNumber(int number) {
        if(number >= MIN_NUM && number <= MAX_NUM) {
            this.number = number;
        }
        else {
            throw new IllegalArgumentException("Invalid Dice::number.");
        }
    }

    /**
     * Rolls dice once.
     */
    public void rollDice() {
        Random random = new Random();
        number = random.nextInt(MAX_NUM) + MIN_NUM;
        setNumber(number);
    }
}