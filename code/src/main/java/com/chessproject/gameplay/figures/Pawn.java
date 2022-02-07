package com.chessproject.gameplay.figures;

public class Pawn extends Figure{
    @Override
    public boolean[][] determinMoveables() {
        boolean[][] moveAbles = new boolean[8][8];
        if (playerInControl == 0){
            moveAbles[pos_x++][pos_y++] = true;
        }else{
            moveAbles[pos_x--][pos_y--] = true;
        }
        return moveAbles;
    }
}
