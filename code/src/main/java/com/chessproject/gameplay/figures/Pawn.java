package com.chessproject.gameplay.figures;

import com.chessproject.gameplay.board.Field;

public class Pawn extends Figure{

    public Pawn(Field[][] chessboard) {
        this.chessboard = chessboard;
    }
    @Override
    public boolean[][] determinMoveables() {
        boolean[][] moveAbles = new boolean[8][8];
        if (playerInControl == 0){
            moveAbles[pos_x][pos_y++] = true;
            if(chessboard[pos_x--][pos_y++].isHasFigure()){
                moveAbles[pos_x--][pos_y++] = true;
            }
            if(chessboard[pos_x++][pos_y++].isHasFigure()){
                moveAbles[pos_x++][pos_y++] = true;
            }
        }else{
            moveAbles[pos_x--][pos_y--] = true;
            if(chessboard[pos_x--][pos_y--].isHasFigure()){
                moveAbles[pos_x--][pos_y--] = true;
            }
            if(chessboard[pos_x++][pos_y--].isHasFigure()){
                moveAbles[pos_x++][pos_y--] = true;
            }
        }
        return moveAbles;
    }
}
