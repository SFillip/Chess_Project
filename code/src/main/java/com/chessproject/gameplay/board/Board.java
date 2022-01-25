package com.chessproject.gameplay.board;

import com.chessproject.gameplay.figures.Figure;

public class Board {
    public Field[][] board = new Field[8][8];

    public Board(){
        for (int i = 0; i <board.length; i++){
            for(int j=0;j<board[i].length;i++){
                board[i][j] = new Field();
            }
        }
    }

    public void moveFigure(int oldFigureX,int oldFigureY,int newFigureX,int newFigureY){
        board[oldFigureX][oldFigureY].getFigure().move(newFigureX,newFigureY);
    }

    /** Returns Figure on position if the right Player is in control
     *  Value will be null if Player is selecting inCorrect Figures*/
    public Figure selectFigure(int posX, int posY, int player){
        if(player==board[posX][posY].getFigure().playerInControl) {
            return board[posX][posY].getFigure();
        }
        return null;
    }
}