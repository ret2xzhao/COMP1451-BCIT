package ca.bcit.comp1451.a00898485;

/**
 * class Main
 * @author Xin Zhao (A00898485) with Saiedeh Zabihirad
 * @version 1.0
 */

public class Main {
    // Symbolic Constants:
    public static final int CHESSBOARD_RANKS = 8; // Denoted 1 to 8 from bottom to top according to White's perspective.
    public static final int CHESSBOARD_FILES = 8; // Denoted a to h from left to right according to White's perspective.
    public static final int RANK_ONE         = 7;
    public static final int RANK_TWO         = 6;
    public static final int RANK_THREE       = 5;
    public static final int RANK_FOUR        = 4;
    public static final int RANK_FIVE        = 3;
    public static final int RANK_SIX         = 2;
    public static final int RANK_SEVEN       = 1;
    public static final int RANK_EIGHT       = 0;
    public static final int FILE_A           = 0;
    public static final int FILE_B           = 1;
    public static final int FILE_C           = 2;
    public static final int FILE_D           = 3;
    public static final int FILE_E           = 4;
    public static final int FILE_F           = 5;
    public static final int FILE_G           = 6;
    public static final int FILE_H           = 7;

    // Instance Variables:
    private ChessPiece[][] chessBoard = new ChessPiece[CHESSBOARD_RANKS][CHESSBOARD_FILES];

    public static void main(String[] args) {
        Main main = new Main();
        // main.chessPieceTest1();
        // main.chessPieceTest2();
        main.setUpChessBoard();
        main.printChessBoard();
    }

    // ChessPiece Testing 1:
    public void chessPieceTest1() {
        ChessPiece cp1 = new ChessPiece(ChessPiece.WHITE_COLOR, ChessPiece.PAWN);
        ChessPiece cp2 = new ChessPiece(ChessPiece.BLACK_COLOR, ChessPiece.KNIGHT);
        ChessPiece cp3 = new ChessPiece(ChessPiece.WHITE_COLOR, ChessPiece.BISHOP);
        ChessPiece cp4 = new ChessPiece(ChessPiece.BLACK_COLOR, ChessPiece.ROOK);
        ChessPiece cp5 = new ChessPiece(ChessPiece.WHITE_COLOR, ChessPiece.QUEEN);
        ChessPiece cp6 = new ChessPiece(ChessPiece.BLACK_COLOR, ChessPiece.KING);
        // ChessPiece cp7 = new ChessPiece(ChessPiece.BLACK_COLOR, 4);
        // ChessPiece cp8 = new ChessPiece(ChessPiece.BLACK_COLOR, 10);
        System.out.println("--------------------------------------------------");
        cp1.move();
        System.out.println(cp1.toString());
        System.out.println(cp2.toString());
        System.out.println(cp3.toString());
        System.out.println(cp4.toString());
        System.out.println(cp5.toString());
        System.out.println(cp6.toString());
        System.out.println("chessPieceTest passed.");
        System.out.println("--------------------------------------------------");
    }

    // ChessPiece Testing 2:
    public void chessPieceTest2() {
        // Pawn Test:
        Pawn p1 = new Pawn(ChessPiece.WHITE_COLOR, ChessPiece.PAWN);
        Pawn p2 = new Pawn(ChessPiece.BLACK_COLOR, ChessPiece.PAWN);
        System.out.println("--------------------------------------------------");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        p1.move();
        p2.move();
        System.out.println("pawnTest passed.");

        // Knight Test:
        Knight kt1 = new Knight(ChessPiece.WHITE_COLOR, ChessPiece.KNIGHT);
        Knight kt2 = new Knight(ChessPiece.BLACK_COLOR, ChessPiece.KNIGHT);
        System.out.println("--------------------------------------------------");
        System.out.println(kt1.toString());
        System.out.println(kt2.toString());
        kt1.move();
        kt2.move();
        System.out.println("knightTest passed.");
        System.out.println("--------------------------------------------------");

        // Bishop Test:
        Bishop bs1 = new Bishop(ChessPiece.WHITE_COLOR, ChessPiece.BISHOP);
        Bishop bs2 = new Bishop(ChessPiece.BLACK_COLOR, ChessPiece.BISHOP);
        System.out.println("--------------------------------------------------");
        System.out.println(bs1.toString());
        System.out.println(bs2.toString());
        bs1.move();
        bs2.move();
        System.out.println("bishopTest passed.");
        System.out.println("--------------------------------------------------");

        // Rook Test:
        Rook r1 = new Rook(ChessPiece.WHITE_COLOR, ChessPiece.ROOK);
        Rook r2 = new Rook(ChessPiece.BLACK_COLOR, ChessPiece.ROOK);
        System.out.println("--------------------------------------------------");
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        r1.move();
        r2.move();
        System.out.println("rookTest passed.");
        System.out.println("--------------------------------------------------");

        // Queen Test:
        Queen q1 = new Queen(ChessPiece.WHITE_COLOR, ChessPiece.QUEEN);
        Queen q2 = new Queen(ChessPiece.BLACK_COLOR, ChessPiece.QUEEN);
        System.out.println("--------------------------------------------------");
        System.out.println(q1.toString());
        System.out.println(q2.toString());
        q1.move();
        q2.move();
        System.out.println("queenTest passed.");
        System.out.println("--------------------------------------------------");

        // King Test:
        King kg1 = new King(ChessPiece.WHITE_COLOR, ChessPiece.KING);
        King kg2 = new King(ChessPiece.BLACK_COLOR, ChessPiece.KING);
        System.out.println("--------------------------------------------------");
        System.out.println(kg1.toString());
        System.out.println(kg2.toString());
        kg1.move();
        kg2.move();
        System.out.println("kingTest passed.");
        System.out.println("--------------------------------------------------");
    }

    /**
     * Sets up a chess board on a two-dimensional array of ChessPiece.
     */
    public void setUpChessBoard() {
    // Black chess pieces:
        // Rank 8:
        chessBoard[RANK_EIGHT][FILE_A] = new Rook   (ChessPiece.BLACK_COLOR, ChessPiece.ROOK);
        chessBoard[RANK_EIGHT][FILE_B] = new Knight (ChessPiece.BLACK_COLOR, ChessPiece.KNIGHT);
        chessBoard[RANK_EIGHT][FILE_C] = new Bishop (ChessPiece.BLACK_COLOR, ChessPiece.BISHOP);
        chessBoard[RANK_EIGHT][FILE_D] = new Queen  (ChessPiece.BLACK_COLOR, ChessPiece.QUEEN);
        chessBoard[RANK_EIGHT][FILE_E] = new King   (ChessPiece.BLACK_COLOR, ChessPiece.KING);
        chessBoard[RANK_EIGHT][FILE_F] = new Bishop (ChessPiece.BLACK_COLOR, ChessPiece.BISHOP);
        chessBoard[RANK_EIGHT][FILE_G] = new Knight (ChessPiece.BLACK_COLOR, ChessPiece.KNIGHT);
        chessBoard[RANK_EIGHT][FILE_H] = new Rook   (ChessPiece.BLACK_COLOR, ChessPiece.ROOK);
        // Rank 7:
        chessBoard[RANK_SEVEN][FILE_A] = new Pawn   (ChessPiece.BLACK_COLOR, ChessPiece.PAWN);
        chessBoard[RANK_SEVEN][FILE_B] = new Pawn   (ChessPiece.BLACK_COLOR, ChessPiece.PAWN);
        chessBoard[RANK_SEVEN][FILE_C] = new Pawn   (ChessPiece.BLACK_COLOR, ChessPiece.PAWN);
        chessBoard[RANK_SEVEN][FILE_D] = new Pawn   (ChessPiece.BLACK_COLOR, ChessPiece.PAWN);
        chessBoard[RANK_SEVEN][FILE_E] = new Pawn   (ChessPiece.BLACK_COLOR, ChessPiece.PAWN);
        chessBoard[RANK_SEVEN][FILE_F] = new Pawn   (ChessPiece.BLACK_COLOR, ChessPiece.PAWN);
        chessBoard[RANK_SEVEN][FILE_G] = new Pawn   (ChessPiece.BLACK_COLOR, ChessPiece.PAWN);
        chessBoard[RANK_SEVEN][FILE_H] = new Pawn   (ChessPiece.BLACK_COLOR, ChessPiece.PAWN);

    // White chess pieces:
        // Rank 1:
        chessBoard[RANK_ONE][FILE_A] = new Rook   (ChessPiece.WHITE_COLOR, ChessPiece.ROOK);
        chessBoard[RANK_ONE][FILE_B] = new Knight (ChessPiece.WHITE_COLOR, ChessPiece.KNIGHT);
        chessBoard[RANK_ONE][FILE_C] = new Bishop (ChessPiece.WHITE_COLOR, ChessPiece.BISHOP);
        chessBoard[RANK_ONE][FILE_D] = new Queen  (ChessPiece.WHITE_COLOR, ChessPiece.QUEEN);
        chessBoard[RANK_ONE][FILE_E] = new King   (ChessPiece.WHITE_COLOR, ChessPiece.KING);
        chessBoard[RANK_ONE][FILE_F] = new Bishop (ChessPiece.WHITE_COLOR, ChessPiece.BISHOP);
        chessBoard[RANK_ONE][FILE_G] = new Knight (ChessPiece.WHITE_COLOR, ChessPiece.KNIGHT);
        chessBoard[RANK_ONE][FILE_H] = new Rook   (ChessPiece.WHITE_COLOR, ChessPiece.ROOK);
        // Rank 2:
        chessBoard[RANK_TWO][FILE_A] = new Pawn   (ChessPiece.WHITE_COLOR, ChessPiece.PAWN);
        chessBoard[RANK_TWO][FILE_B] = new Pawn   (ChessPiece.WHITE_COLOR, ChessPiece.PAWN);
        chessBoard[RANK_TWO][FILE_C] = new Pawn   (ChessPiece.WHITE_COLOR, ChessPiece.PAWN);
        chessBoard[RANK_TWO][FILE_D] = new Pawn   (ChessPiece.WHITE_COLOR, ChessPiece.PAWN);
        chessBoard[RANK_TWO][FILE_E] = new Pawn   (ChessPiece.WHITE_COLOR, ChessPiece.PAWN);
        chessBoard[RANK_TWO][FILE_F] = new Pawn   (ChessPiece.WHITE_COLOR, ChessPiece.PAWN);
        chessBoard[RANK_TWO][FILE_G] = new Pawn   (ChessPiece.WHITE_COLOR, ChessPiece.PAWN);
        chessBoard[RANK_TWO][FILE_H] = new Pawn   (ChessPiece.WHITE_COLOR, ChessPiece.PAWN);
    }

    /**
     * Loops through the chess board and prints each piece (thus triggering its toString() method).
     */
    public void printChessBoard() {
        for(int i=0; i<CHESSBOARD_RANKS; i++) {
            for(int j=0; j<CHESSBOARD_FILES; j++) {
                if(chessBoard[i][j] == null) {
                    System.out.println("chessBoard[" + i + "][" + j + "] is an empty square.");
                }
                else {
                    System.out.println("chessBoard[" + i + "][" + j + "] is a " + chessBoard[i][j].toString());
                }
            }
            System.out.println();
        }
    }
}