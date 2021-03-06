package com.chessproject.gameplay.board;

import com.chessproject.gameplay.figures.*;

public class Board {
    public Field[][] board = new Field[8][8];

    public Board(){
        for (int i = 0; i <board.length; i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j] = new Field();
            }
        }

        board[0][0].setFigure(new Tower(0,0,1));
        board[1][0].setFigure(new Knight(1,0,1));
        board[2][0].setFigure(new Bishop(2,0,1));
        board[3][0].setFigure(new Queen(3,0,1));
        board[4][0].setFigure(new King(4,0,1));
        board[5][0].setFigure(new Bishop(5,0,1));
        board[6][0].setFigure(new Knight(6,0,1));
        board[7][0].setFigure(new Tower(7,0,1));

        board[0][1].setFigure(new Pawn(0,1,1));
        board[1][1].setFigure(new Pawn(1,1,1));
        board[2][1].setFigure(new Pawn(2,1,1));
        board[3][1].setFigure(new Pawn(3,1,1));
        board[4][1].setFigure(new Pawn(4,1,1));
        board[5][1].setFigure(new Pawn(5,1,1));
        board[6][1].setFigure(new Pawn(6,1,1));
        board[7][1].setFigure(new Pawn(7,1,1));

        board[0][7].setFigure(new Tower(0,7,0));
        board[1][7].setFigure(new Knight(1,7,0));
        board[2][7].setFigure(new Bishop(2,7,0));
        board[3][7].setFigure(new Queen(3,7,0));
        board[4][7].setFigure(new King(4,7,0));
        board[5][7].setFigure(new Bishop(5,7,0));
        board[6][7].setFigure(new Knight(6,7,0));
        board[7][7].setFigure(new Tower(7,7,0));

        board[0][6].setFigure(new Pawn(0,6,0));
        board[1][6].setFigure(new Pawn(1,6,0));
        board[2][6].setFigure(new Pawn(2,6,0));
        board[3][6].setFigure(new Pawn(3,6,0));
        board[4][6].setFigure(new Pawn(4,6,0));
        board[5][6].setFigure(new Pawn(5,6,0));
        board[6][6].setFigure(new Pawn(6,6,0));
        board[7][6].setFigure(new Pawn(7,6,0));
    }

    public void moveFigure(int oldFigureX,int oldFigureY,int newFigureX,int newFigureY){
        board[oldFigureX][oldFigureY].getFigure().move(newFigureX,newFigureY,board);
    }

    /** Returns Figure on position if the right Player is in control
     *  Value will be null if Player is selecting inCorrect Figures*/
    public Figure selectFigure(int posX, int posY, int player){
        if(player==board[posX][posY].getFigure().playerInControl) {
            return board[posX][posY].getFigure();
        }
        return null;
    }

    public Field[][] getBoard() {
        return board;
    }
}