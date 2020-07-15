package ca.bcit.comp1451.a00898485;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * class Board
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Board {
    //Symbolic Constants:
    public static final int    SKUNK_LENGTH    =  5;
    public static final int    TWO_DICE_MODE   =  2;
    public static final int    THREE_DICE_MODE =  3;
    public static final String QUIT            = "Q";
    public static final int    TWO_SECONDS     =  2;

    // Instance Variables:
    private String playerName;
    private char[] skunk = {'S', 'K', 'U', 'N', 'K'};

    public static boolean END = false; // Game exits if END == true.

    /**
     * Constructor for objects of class Board.
     */
    public Board() {
    }

    /**
     * Initializes the Board.
     */
    public void initialBoard() {
        System.out.println("#######################################################################################");
        System.out.println("#########################            - S K U N K -            #########################");
        System.out.println("#######################################################################################");
        System.out.println("##                                                                                   ##");
        System.out.println("##  - There are five rounds in total.                                                ##");
        System.out.println("##                                                                                   ##");
        System.out.println("##  - The object of SKUNK is to accumulate the greatest possible scores total over   ##");
        System.out.println("##    five rounds. The rules for play are the same for each of the five rounds.      ##");
        System.out.println("##                                                                                   ##");
        System.out.println("##  - Each letter of SKUNK represents a different round of the game; play begins     ##");
        System.out.println("##    with the \"S\" round and continue through the \"K\" round.                         ##");
        System.out.println("##                                                                                   ##");
        System.out.println("##  - At the beginning of each roll, a pair of dice (or three dice) is rolled.       ##");
        System.out.println("##                                                                                   ##");
        System.out.println("##  - If a 1 comes up, play is over for that round and all the player's points in    ##");
        System.out.println("##    that round are wiped out.                                                      ##"); 
        System.out.println("##                                                                                   ##");
        System.out.println("##  - If Player1 is playing a round and Player2 rolls 1-1, players still playing     ##");
        System.out.println("##    get 0 for the game and the round is over.                                      ##");
        System.out.println("##                                                                                   ##");
        System.out.println("##  - If Player1 is playing a round and Player2 rolls ANY triples (e.g. 1-1-1),      ##");
        System.out.println("##    every player gets 100 if he/she is still playing.                              ##");
        System.out.println("##                                                                                   ##");
        System.out.println("#######################################################################################");
        pressEnterToContinue();
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("|||||||||||||<<<<  Please enter your name or enter \"Q\" to exit game:  >>>>|||||||||||||");
        System.out.println("---------------------------------------------------------------------------------------");
        setPlayerName();
    }

    /**
     * Sets the name of the player.
     */
    public void setPlayerName() {
        Scanner keyboardScanner = new Scanner(System.in);
        if(keyboardScanner.hasNext()) {
            this.playerName = keyboardScanner.next();
            if(this.playerName.equalsIgnoreCase(QUIT)) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("|||||||||||||||||||||||||<<<<The game is over. Thank you!>>>>||||||||||||||||||||||||||");
                System.out.println("---------------------------------------------------------------------------------------");
                Board.END = true;
                return;
            }
            else {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("                                     Hello " + playerName + "!");
                System.out.println("---------------------------------------------------------------------------------------");
                waitForSeconds(TWO_SECONDS);
            }
        }
    }

    /**
     * @return The name of the player in String.
     */
    public String getPlayerName() {
        return this.playerName;
    }

    /**
     * Sets the mode and plays the game.
     * @param p1 First Player to play the game.
     * @param p2 Second Player to play the game.
     */
    public void setModeAndPlay(Player p1, Player p2) {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("||||||||||||||||<<<<Welcome to SKUNK! There are two modes of SKUNK:>>>>||||||||||||||||");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("|||||||||<<  2---TWO DICE MODE     3---THREE DICE MODE      Q---Exit Game  >>||||||||||");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("|||||||||||||||||||||||||<<<<Please select (2 or 3 or Q):>>>>||||||||||||||||||||||||||");
        System.out.println("---------------------------------------------------------------------------------------");
        Scanner keyboardScanner = new Scanner(System.in);
        String  playerString;

        while(keyboardScanner.hasNext()) {
            // Integer:
            if(keyboardScanner.hasNextInt()) {
                int numOfDice = keyboardScanner.nextInt();
                if(numOfDice == TWO_DICE_MODE) {
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("||||||||||||||||||||||||||<<<<  TWO DICE MODE selected.  >>>>||||||||||||||||||||||||||");
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("|||||||||||||||||||||||||||||<<<<    Processing...    >>>>|||||||||||||||||||||||||||||");
                    System.out.println("---------------------------------------------------------------------------------------");
                    waitForSeconds(TWO_SECONDS);
                    pressEnterToContinue();
                    DiceRoller twoDiceRoller = new DiceRoller(TWO_DICE_MODE);
                    // Game starts here.
                    gamePlay(twoDiceRoller, p1, p2);
                    return;
                }
                else if(numOfDice == THREE_DICE_MODE) {
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("|||||||||||||||||||||||||<<<<  THREE DICE MODE selected.  >>>>|||||||||||||||||||||||||");
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("|||||||||||||||||||||||||||||<<<<    Processing...    >>>>|||||||||||||||||||||||||||||");
                    System.out.println("---------------------------------------------------------------------------------------");
                    waitForSeconds(TWO_SECONDS);
                    pressEnterToContinue();
                    DiceRoller threeDiceRoller = new DiceRoller(THREE_DICE_MODE);
                    // Game starts here.
                    gamePlay(threeDiceRoller, p1, p2);
                    return;
                }
                else {
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("||      " + numOfDice + " is not a valid mode!   Please select (2 or 3 or Q):");
                    System.out.println("---------------------------------------------------------------------------------------");
                }
            }
            // Not an integer:
            else {
                playerString = keyboardScanner.next();
                if(playerString.equalsIgnoreCase(Board.QUIT)) {
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("|||||||||||||||||||||||||<<<<The game is over. Thank you!>>>>||||||||||||||||||||||||||");
                    System.out.println("---------------------------------------------------------------------------------------");
                    Board.END = true;
                    return;
                }
                else {
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("|| " + playerString + " is not a valid mode!   Please select (2 or 3 or Q):");
                    System.out.println("---------------------------------------------------------------------------------------");
                }
            }
        }
    }

    /**
     * Plays the game.
     * @param diceRoller A DiceRoller to set the number of dice and run the game.
     * @param p1 First Player to play the game.
     * @param p2 Second Player to play the game.
     */
    public void gamePlay(DiceRoller diceRoller, Player p1, Player p2) {
        if(diceRoller.getNumberOfDice() == TWO_DICE_MODE) {
            for(int i=0; i<SKUNK_LENGTH; i++) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("|||||||||||||||||||||||||||||||||<<<<  Round " + skunk[i] + ":  >>>>||||||||||||||||||||||||||||||||||");
                System.out.println("---------------------------------------------------------------------------------------");
                diceRoller.twoDiceRound(p1, p2, i);
                pressEnterToContinue();
            }
        }
        else {
            for(int i=0; i<SKUNK_LENGTH; i++) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("|||||||||||||||||||||||||||||||||<<<<  Round " + skunk[i] + ":  >>>>||||||||||||||||||||||||||||||||||");
                System.out.println("---------------------------------------------------------------------------------------");
                diceRoller.threeDiceRound(p1, p2, i);
                pressEnterToContinue();
            }
        }
    }

    /**
     * Displays the scores of the specific player.
     * @param player A specific Player plays the game.
     */
    public void displayPlayerScores(Player player) {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("|||||||||||||||||||||||||||||<<<<    Processing...    >>>>|||||||||||||||||||||||||||||");
        System.out.println("---------------------------------------------------------------------------------------");
        waitForSeconds(TWO_SECONDS);
        for(int i=0; i<SKUNK_LENGTH; i++) {
            System.out.println("Round " + skunk[i] + ":  " + player.getName() + "'s scores are " + player.getScoresOfRound(i) + ".");
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("In total, " + player.getName() + "'s scores are " + player.getScoresOfGame() + ".");
        System.out.println("---------------------------------------------------------------------------------------");
    }

    /**
     * Compares and displays the scores of all the players.
     * @param p1 First Player plays the game.
     * @param p2 Second Player plays the game.
     */
    public void comparePlayersScores(Player p1, Player p2) {
        if(p1.getScoresOfGame() > p2.getScoresOfGame()) {
            System.out.println("#######################################################################################");
            System.out.println("#####                    -   AI wins!!! Please try again.   -                     #####");
            System.out.println("#######################################################################################");
        }
        else if(p1.getScoresOfGame() < p2.getScoresOfGame()) {
            System.out.println("#######################################################################################");
            System.out.println("                       Congratulations " + p2.getName() + ", you beat the AI !!!               ");
            System.out.println("#######################################################################################");
        }
        else {
            System.out.println("#######################################################################################");
            System.out.println("#####                        -   Tie! Please try again.   -                       #####");
            System.out.println("#######################################################################################");
        }
    }

    /**
     * Prompts the user to press "Enter" to continue.
     */
    public static void pressEnterToContinue() {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("||||||||||||||||||||||<<<<    Press \"Enter\" to continue...    >>>>|||||||||||||||||||||");
        System.out.println("---------------------------------------------------------------------------------------");
        try {
            System.in.read();
        }
        catch(Exception e) {}
    }

    /**
     * Sets the number of seconds to wait.
     * @param numberOfSeconds An integer to set the number of seconds to wait.
     */
    public static void waitForSeconds(int numberOfSeconds) {
        try {
            TimeUnit.SECONDS.sleep(numberOfSeconds);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}