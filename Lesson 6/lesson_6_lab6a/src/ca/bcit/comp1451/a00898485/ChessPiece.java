package ca.bcit.comp1451.a00898485;

import java.util.HashMap;

/**
 * class ChessPiece
 * @author Xin Zhao (A00898485) with Saiedeh Zabihirad
 * @version 1.0
 */

public class ChessPiece {
    // Symbolic Constants:
    public static final boolean WHITE_COLOR = true;
    public static final boolean BLACK_COLOR = false;
    public static final int     PAWN        = 1;
    public static final int     KNIGHT      = 2;
    public static final int     BISHOP      = 3;
    public static final int     ROOK        = 5;
    public static final int     QUEEN       = 9;
    public static final int     KING        = 1000;

    // Instance Variables:
    private boolean whiteColor;
    private int     value;
    private HashMap<Integer, String> chessPieces = new HashMap<Integer, String>();

    /**
     * Constructor for objects of class ChessPiece.
     * @param whiteColor A boolean to set if the chess piece is white or not.
     * @param value An integer to set the value of the chess piece.
     */
    public ChessPiece(boolean whiteColor, int value) {
        initChessPieces();
        setWhiteColor(whiteColor);
        setValue(value);
    }

    /**
     * Initializes a HashMap of chessPieces.
     */
    public void initChessPieces() {
        if (chessPieces != null){
            chessPieces.put(PAWN,   "Pawn");
            chessPieces.put(KNIGHT, "Knight");
            chessPieces.put(BISHOP, "Bishop");
            chessPieces.put(ROOK,   "Rook");
            chessPieces.put(QUEEN,  "Queen");
            chessPieces.put(KING,   "King");
        }
    }

    /**
     * @param whiteColor A boolean to set if the chess piece is white or not.
     */
    public void setWhiteColor(boolean whiteColor) {
        if(whiteColor == WHITE_COLOR) {
            this.whiteColor = true;
        }
        else if(whiteColor == BLACK_COLOR) {
            this.whiteColor = false;
        }
        else {
            throw new IllegalArgumentException("Invalid ChessPiece::whiteColor.");
        }
    }

    /**
     * @return The boolean of the chess piece if it is white or not.
     */
    public boolean getWhiteColor() {
        return this.whiteColor;
    }

    /**
     * @param value An integer to set the value of the specific chess piece.
     */
    public void setValue(int value) {
        if(validateValue(value)) {
            this.value = value;
        }
        else {
            System.out.println("Invalid ChessPiece::value = " + value);
            throw new IllegalArgumentException("Invalid ChessPiece::value.");
        }
    }

    /**
     * @return The value of the specific chess piece in integer.
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Validates the value of the chess piece.
     * @param value An integer to validate the value of the specific chess piece.
     */
    public boolean validateValue(int value) {
        if(this.chessPieces.containsKey(value)) {
            return true;
        }
        return false;
    }

    /**
     * Displays "moving..." for a ChessPiece.
     */
    public void move() {
        System.out.println("moving...");
    }

    /**
     * Overrides the toString() method and returns the name of its class (e.g. "White Pawn" or "Black Knight", etc...).
     */
    @Override
    public String toString() {
        if(this.getWhiteColor()) {
            return "White " + this.chessPieces.get(this.getValue());
        }
        else {
            return "Black " + this.chessPieces.get(this.getValue());
        }
    }
}
