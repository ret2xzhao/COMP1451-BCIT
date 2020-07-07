package ca.bcit.comp1451.a00898485;

/**
 * class Queen
 * @author Xin Zhao (A00898485) with Saiedeh Zabihirad
 * @version 1.0
 */

public class Queen extends ChessPiece{
    /**
     * Constructor for objects of class Queen.
     * @param whiteColor A boolean to set if the Queen is white or not.
     * @param value An integer to set the value of the Queen.
     */
    public Queen(boolean whiteColor, int value) {
        super(whiteColor, QUEEN);
    }

    /**
     * Displays a particular chess piece move.
     */
    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName() + "  \"like a bishop or a rook\"");
    }

    /**
     * Overrides the toString() method and returns the name of its class in addition to its value.
     */
    @Override
    public String toString() {
        String result = super.toString() + "(" + this.getValue() + ")";
        return result;
    }
}