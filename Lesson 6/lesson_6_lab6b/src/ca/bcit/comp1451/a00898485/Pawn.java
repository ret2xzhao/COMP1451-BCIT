package ca.bcit.comp1451.a00898485;

/**
 * class Pawn
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Pawn extends ChessPiece{
    // Symbolic Constants:
    public static final boolean IS_PROMOTED = false;

    // Instance Variables:
    private boolean hasBeenPromoted;
    private ChessPiece newPiece;

    /**
     * Constructor for objects of class Pawn.
     * @param whiteColor A boolean to set if the Pawn is white or not.
     * @param value An integer to set the value of the Pawn.
     */
    public Pawn(boolean whiteColor, int value) {
        super(whiteColor, PAWN);
        setHasBeenPromoted();
    }

    /**
     * Initialize the Pawn as not promoted.
     */
    public void setHasBeenPromoted() {
        this.hasBeenPromoted = IS_PROMOTED;
    }

    /**
     * @return The boolean indicated that if this Pawn has been promoted or not.
     */
    public boolean getHasBeenPromoted() {
        return this.hasBeenPromoted;
    }

    /**
     * @return A ChessPiece indicated this Pawn has been promoted to.
     */
    public ChessPiece getNewPiece() {
        return this.newPiece;
    }

    /**
     * Displays a particular chess piece move.
     */
    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName() + "  \"forward 1\"");
    }

    /**
     * Overrides the toString() method and returns the name of its class in addition to its value.
     */
    @Override
    public String toString() {
        String result = super.toString() + "(" + this.getValue() + ")";
        return result;
    }

    /**
     * Overrides the equals() method.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Pawn pawn = (Pawn) obj;
        if((!this.hasBeenPromoted && pawn.hasBeenPromoted) || (this.hasBeenPromoted && !pawn.hasBeenPromoted)){
            return false;
        }
        else if(this.hasBeenPromoted && pawn.hasBeenPromoted){
            if(this.newPiece.getValue() != pawn.newPiece.getValue()){
                return false;
            }
        }
        return true;
    }

    /**
     * When a Pawn reaches the far side of the board, it is exchanged for another ChessPiece; for example, a Pawn
     * can "become" a Rook, or a Queen, etc¡­. It cannot become a King or Pawn though.
     * @param newPiece A ChessPiece to set the Pawn to be promoted to.
     */
    public void promote(ChessPiece newPiece) {
        if(newPiece != null) {
            if(this.getWhiteColor() == newPiece.getWhiteColor()) {
                if(!(newPiece instanceof King) || !(newPiece instanceof Pawn)) {
                    this.newPiece = newPiece;
                    this.hasBeenPromoted = !IS_PROMOTED;
                }
                else {
                    throw new IllegalArgumentException("The newPiece should not be King or Pawn.");
                }
            }
            else {
                throw new IllegalArgumentException("The newPiece should be the same color.");
            }
        }
        else {
            throw new IllegalArgumentException("The newPiece should not be null.");
        }
    }
}