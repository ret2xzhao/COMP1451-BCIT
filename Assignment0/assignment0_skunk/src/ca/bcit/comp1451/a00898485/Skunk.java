package ca.bcit.comp1451.a00898485;

/**
 * class Skunk
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Skunk {
    public static void main(String[] args) {
        Skunk skunk = new Skunk();
        skunk.play();
    }

    /**
     * Play the SKUNK game.
     */
    public void play() {
        // Initializes a new Board and prompt player's name:
        Board board = new Board();
        board.initialBoard();
        // System.out.println("END = " + Skunk.END);
        if(Board.END == true) {
            return;
        }

        // Initializes the Players:
        Player computer = new Player("AI");
        Player p1       = new Player(board.getPlayerName());

        // Sets the mode and plays:
        board.setModeAndPlay(computer, p1);
        // System.out.println("END = " + Skunk.END);
        if(Board.END == true) {
            return;
        }

        // Prints the scores:
        board.displayPlayerScores(computer);
        board.displayPlayerScores(p1);

        // Compares two players' scores:
        board.comparePlayersScores(computer, p1);
    }
}