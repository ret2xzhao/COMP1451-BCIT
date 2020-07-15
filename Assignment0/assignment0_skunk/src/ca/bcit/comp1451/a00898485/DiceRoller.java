package ca.bcit.comp1451.a00898485;

/**
 * Class DiceRoller
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class DiceRoller {
    // Symbolic Constants:
    public static final int ONE                            = 1;
    public static final int INDEX_ZERO                     = 0;
    public static final int INDEX_ONE                      = 1;
    public static final int INDEX_TWO                      = 2;
    public static final int ZERO_SCORES                    = 0;
    public static final int THREE_OF_ONE_KIND_BONUS_SCORES = 100;

    // Instance Variables:
    private int     numberOfDice;
    private Dice[]  dice;
    private int     scoresOfOneRoll;
    private boolean isFirstRoll;
    private boolean hasDoubleOnes;  // TWO DICE MODE only.
    private boolean threeOfOneKind; // THREE DICE MODE only.

    /**
     * Constructor for objects of class DiceRoller.
     */
    public DiceRoller(int numberOfDice) {
        setNumberOfDice(numberOfDice);
        setDice(numberOfDice);
        setScoresOfOneRoll(ZERO_SCORES);
    }

    /**
     * Sets the number of dice.
     * @param numberOfDice An integer to set the number of dice.
     */
    public void setNumberOfDice(int numberOfDice) {
        if(numberOfDice == Board.TWO_DICE_MODE || numberOfDice == Board.THREE_DICE_MODE) {
            this.numberOfDice = numberOfDice;
        }
        else {
            throw new IllegalArgumentException("Invalid DiceRoller::numberOfDice.");
        }
    }

    /**
     * @return The number of dice in integer.
     */
    public int getNumberOfDice() {
        return this.numberOfDice;
    }

    /**
     * Sets the Dice[] dice.
     * @param numberOfDice An integer to set the number of dice.
     */
    public void setDice(int numberOfDice) {
        dice = new Dice[numberOfDice];
        for(int i=0; i<numberOfDice; i++) {
            dice[i] = new Dice();
        }
        // System.out.println("The initialization of " + numberOfDice + " dice is done.");
    }

    /**
     * @return The Dice[] dice.
     */
    public Dice[] getDice() {
        return this.dice;
    }

    /**
     * Sets the scores of one roll.
     * @param scoresOfOneRoll An integer to set the scores of one roll.
     */
    public void setScoresOfOneRoll(int scoresOfOneRoll) {
        if(scoresOfOneRoll >= 0) {
            this.scoresOfOneRoll = scoresOfOneRoll;
        }
        else {
            throw new IllegalArgumentException("Invalid DiceRoller::scoresOfOneRoll.");
        }
    }

    /**
     * @return The scores of one roll in integer.
     */
    public int getScoresOfOneRoll() {
        return this.scoresOfOneRoll;
    }

    /**
     * Checks if there is one rolled.
     * If one rolled and it is the first roll, prints "Rolling Again...".
     * If one rolled and it is not the first roll, prints "Round is End".
     * @return A boolean if there is a one rolled or not in a roll.
     */
    public boolean checkOneIsRolled() {
        boolean oneIsRolled = false;
        for(int i=0; i<this.getNumberOfDice(); i++) {
            if(dice[i].getNumber() == ONE && isFirstRoll == true) {
                oneIsRolled = true;
                Board.waitForSeconds(Board.TWO_SECONDS);
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("|||||||||||||||||||||||||||||<<<<  Rolling Again...  >>>>||||||||||||||||||||||||||||||");
                System.out.println("---------------------------------------------------------------------------------------");
                Board.waitForSeconds(Board.TWO_SECONDS);
                break;
            }
            else if(dice[i].getNumber() == ONE && isFirstRoll == false) {
                oneIsRolled = true;
                Board.waitForSeconds(Board.TWO_SECONDS);
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("|||||||||||||||||||||||||||||||<<<<  Round is End.  >>>>|||||||||||||||||||||||||||||||");
                System.out.println("---------------------------------------------------------------------------------------");
                Board.waitForSeconds(Board.TWO_SECONDS);
                break;
            }
        }
        return oneIsRolled;
    }

    /**
     * TWO DICE MODE only.
     * If there are two ones rolled in the TWO DICE MODE. If any player's choice is PLAY, then sets the player's
     * choice as INTERRUPT. And sets the player's scores of this game equals zero.
     * @param p1 First Player to play the game.
     * @param p2 Second Player to play the game.
     */
    public void checkDoubleOnesRolled(Player p1, Player p2) {
        if(this.getNumberOfDice() == Board.TWO_DICE_MODE && dice[INDEX_ZERO].getNumber() == ONE && dice[INDEX_ONE].getNumber() == ONE) {
            this.hasDoubleOnes = true;
            if(p1.getChoice() == Player.PLAY) {
                p1.setChoice(Player.INTERRUPT);
                p1.initScoresOfRound();
            }
            if(p2.getChoice() == Player.PLAY) {
                p2.setChoice(Player.INTERRUPT);
                p2.initScoresOfRound();
            }
            System.out.println("\n---------------------------------------------------------------------------------------");
            System.out.println("||||||||||||||||||||||||||<<<<    Double ones rolled.    >>>>||||||||||||||||||||||||||");
            System.out.println("---------------------------------------------------------------------------------------");
        }
    }

    /**
     * THREE DICE MODE only.
     * @return A boolean if there is a three of one kind rolled or not.
     */
    public boolean checkThreeOfOneKind() {
        if((this.getNumberOfDice() == Board.THREE_DICE_MODE) && (dice[INDEX_ZERO].getNumber() == dice[INDEX_ONE].getNumber()) 
                                                             && (dice[INDEX_ZERO].getNumber() == dice[INDEX_TWO].getNumber())) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Rolls the Dice[] dice one time.
     * 1. Checks if there is double ones rolled or not in the TWO DICE MODE.
     * 2. If there is three of one kind rolled in the THREE DICE MODE. Add 100 scores to the current round.
     * @param p1 First Player to play the game.
     * @param p2 Second Player to play the game.
     */
    public void rollDiceOneTime(Player p1, Player p2) {
        System.out.println("---------------------------------------------------------------------------------------");
        int count = 0;
        for(int i=0; i<this.getNumberOfDice(); i++) {
            dice[i].rollDice();
            System.out.print("         Dice " + (i+1) + " is: " + dice[i].getNumber() + "       ");
            count = count + dice[i].getNumber();
        }

        checkDoubleOnesRolled(p1, p2);               // TWO DICE MODE ONLY.

        if(threeOfOneKind = checkThreeOfOneKind()) { // THREE DICE MODE ONLY.
            count = THREE_OF_ONE_KIND_BONUS_SCORES;
            System.out.println("\n---------------------------------------------------------------------------------------");
            System.out.println("|||||||||||||||||||||||<<<<    Three of one kind rolled.    >>>>|||||||||||||||||||||||");
            System.out.println("---------------------------------------------------------------------------------------");
        }

        // Prints the sum of this roll:
        this.setScoresOfOneRoll(count);
        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("         The sum of this roll is " + count + ".");
        System.out.println("---------------------------------------------------------------------------------------");
    }

    /**
     * Checks the specific player's choice. If the player's choice is PLAY, then add the scores of this roll to that player.
     * @param player A Player to set the specific player.
     * @param index  An integer to set the specific round.
     */
    public void checkChoiceAndAddScores(Player player, int index) {
        if(player.getChoice() == Player.PLAY) {
            player.addScores(this.getScoresOfOneRoll(), index);
        }
    }

    /**
     * Checks the specific player's choice.
     * If there is a one rolled and also that player's choice is PLAY, then sets the player's choice as STOP.
     * And sets the player's scores of that round equals zero.
     * @param oneIsRolled A boolean if there is a one rolled or not in a roll.
     * @param player A Player to set the specific player.
     * @param index  An integer to set the specific round.
     */
    public void checkChoiceAndSetZeroScore(boolean oneIsRolled, Player player, int index) {
        if(oneIsRolled && player.getChoice() == Player.PLAY) {
            player.setChoice(Player.STOP);
            player.setScoresOfRound(ZERO_SCORES, index);
        }
    }

    /**
     * Prompts all the players' choice.
     * @param p1 First Player to play the game.
     * @param p2 Second Player to play the game.
     */
    public void promptPlayersChoice(Player p1, Player p2) {
        if(p2.getChoice() == Player.PLAY) {
            p2.promptPlayerChoice();
        }
        if(p1.getChoice() == Player.PLAY) {
            p1.promptComputerChoice();
        }
    }

    /**
     * Starts a round of the two dice mode.
     * @param p1    First  Player to play the game.
     * @param p2    Second Player to play the game.
     * @param index An integer to set the specific round.
     */
    public void twoDiceRound(Player p1, Player p2, int index) {
        // Initialization:
        boolean roundEnd    = false;
        boolean ifContinue  = false;
        boolean isOneRolled;
        this.isFirstRoll    = true;
        this.hasDoubleOnes  = false;
        p1.resetChoice();
        p2.resetChoice();
        this.setScoresOfOneRoll(ZERO_SCORES);

        // Round starts:
        // Check if it is or not the first roll:
        while(roundEnd == false) {
            while(isFirstRoll) {
                // First roll:
                rollDiceOneTime(p1, p2);
                // If there is a one rolled.
                while(checkOneIsRolled()) {
                    // Rolls again.
                    rollDiceOneTime(p1, p2);
                }
                this.isFirstRoll = false;
            }
            isOneRolled = false;
            // Continues other rolls:
            if(ifContinue) {
                // Rolls again.
                rollDiceOneTime(p1, p2);
                // If it has double ones, round ends.
                if(hasDoubleOnes) {
                    return;
                }
                isOneRolled = checkOneIsRolled();
                if(isOneRolled == true) {
                    checkChoiceAndSetZeroScore(isOneRolled, p1, index);
                    checkChoiceAndSetZeroScore(isOneRolled, p2, index);
                }
            }
            checkChoiceAndAddScores(p1, index);
            checkChoiceAndAddScores(p2, index);
            ifContinue = true;
            p1.displayScoresOfRound(index);
            p2.displayScoresOfRound(index);
            promptPlayersChoice(p1, p2);
            if(p1.getChoice() != Player.PLAY && p2.getChoice() != Player.PLAY) {
                roundEnd = true;
            }
        }
        return; // Round ends.
    }

    /**
     * Starts a round of the three dice mode.
     * @param p1    First Player to play the game.
     * @param p2    Second Player to play the game.
     * @param index An integer to set the specific round.
     */
    public void threeDiceRound(Player p1, Player p2, int index) {
        // Initialization:
        boolean roundEnd    = false;
        boolean ifContinue  = false;
        boolean isOneRolled;
        this.isFirstRoll    = true;
        p1.resetChoice();
        p2.resetChoice();
        this.setScoresOfOneRoll(ZERO_SCORES);

        // Round starts:
        // Check if it is or not the first roll:
        while(roundEnd == false) {
            threeOfOneKind = false;
            while(isFirstRoll) {
                // First roll:
                rollDiceOneTime(p1, p2);
                // If there is three of one kind rolled.
                if(threeOfOneKind) {
                    isFirstRoll = false;
                    break;
                }
                else {
                    // If there is a one rolled.
                    while(checkOneIsRolled()) {
                        // Rolls again.
                        rollDiceOneTime(p1, p2);
                        if(threeOfOneKind) {
                            break;
                        }
                    }
                    isFirstRoll = false;
                }
            }
            isOneRolled = false;
            // Continues other rolls:
            if(ifContinue) {
                // Rolls again.
                rollDiceOneTime(p1, p2);
                if(!threeOfOneKind) {
                    isOneRolled = checkOneIsRolled();
                }
                if(isOneRolled == true) {
                    checkChoiceAndSetZeroScore(isOneRolled, p1, index);
                    checkChoiceAndSetZeroScore(isOneRolled, p2, index);
                }
            }
            checkChoiceAndAddScores(p1, index);
            checkChoiceAndAddScores(p2, index);
            ifContinue = true;
            p1.displayScoresOfRound(index);
            p2.displayScoresOfRound(index);
            promptPlayersChoice(p1, p2);
            if(p1.getChoice() == Player.STOP && p2.getChoice() == Player.STOP) {
                roundEnd = true;
            }
        }
        return; // Round ends.
    }
}