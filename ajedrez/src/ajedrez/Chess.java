/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Ramón
 */
public class Chess {

    private char[][] chessTable;
    private int rowSize;
    private int colSize;

    private Point startSelectedMov;

    private Point finalSelectedMov;

    private ArrayList<Point> chessPosList = new ArrayList();

    public static final char EMPTY = '.';
     public static final char WALL = '#';
    public static final char WHITE_KING = '+';
    public static final char WHITE_QUEEN = '*';
    public static final char WHITE_ROOK = 'r';
    public static final char WHITE_KNIGHT = 'k';
    public static final char WHITE_PAWN = 'p';
    public static final char WHITE_BISHOP = 'b';
    public static final char BLACK_KING = '^';
    public static final char BLACK_QUEEN = '$';
    public static final char BLACK_ROOK = 'R';
    public static final char BLACK_KNIGHT = 'K';
    public static final char BLACK_PAWN = 'P';
    public static final char BLACK_BISHOP = 'B';



    
    

    public Chess(int fileSize, int colSize) {
        //Asignar el valor de los datos para guardarlos arriba y que se puedan tener en otro método.
        this.rowSize = fileSize;
        this.colSize = colSize;
        chessTable = new char[fileSize][colSize];
        //Inicializamos el tablero con todo vacío
        for (int f = 0; f < fileSize; f++) {
            for (int c = 0; c < colSize; c++) {
                chessTable[f][c] = EMPTY;
            }
        }
        //NEGRAS
        chessTable[0][0] = WHITE_ROOK;
        chessTable[0][1] = WHITE_KNIGHT;
        chessTable[0][2] = WHITE_BISHOP;
        chessTable[0][3] = WHITE_KING;
        chessTable[0][4] = WHITE_QUEEN;
        chessTable[0][5] = WHITE_BISHOP;
        chessTable[0][6] = WHITE_KNIGHT;
        chessTable[0][7] = WHITE_ROOK;
        //Colocar el peón
        for (int i = 0; i <= 7; i++) {
            chessTable[1][i] = WHITE_PAWN;
        }

        //BLANCAS
        for (int i = 0; i <= 7; i++) {
            chessTable[6][i] = BLACK_PAWN;
        }
        chessTable[7][0] = BLACK_ROOK;
        chessTable[7][1] = BLACK_KNIGHT;
        chessTable[7][2] = BLACK_BISHOP;
        chessTable[7][3] = BLACK_QUEEN;
        chessTable[7][4] = BLACK_KING;
        chessTable[7][5] = BLACK_BISHOP;
        chessTable[7][6] = BLACK_KNIGHT;
        chessTable[7][7] = BLACK_ROOK;
    }

    public void setMovement(byte startRowMov, byte startColMov, byte finalRowMov, byte finalColMov) {
        char initialPiece;

        initialPiece = chessTable[startRowMov][startColMov];
        chessTable[startRowMov][startColMov] = EMPTY;
        chessTable[finalRowMov][finalColMov] = initialPiece;

    }

    public int getRowSize() {
        return rowSize;
    }

    public int getColSize() {
        return colSize;
    }
    public char[][] getChessTable() {
        return chessTable;
    }
    public String toString() {
        String retorno = "";
        for (int f = 0; f < rowSize; f++) {
            for (int c = 0; c < colSize; c++) {
                retorno += chessTable[f][c];
            }
            retorno += '\n';
        }
        return retorno;
    }
}
