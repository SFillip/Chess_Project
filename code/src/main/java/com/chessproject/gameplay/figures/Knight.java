package com.chessproject.gameplay.figures;

import com.chessproject.gameplay.board.Field;

public class Knight extends Figure{

    public Knight(Field[][] chessboard) {
        this.chessboard = chessboard;
    }
    @Override
    public boolean[][] determinMoveables() {
        boolean[][] moveAbles = new boolean[8][8];
        try {
            moveAbles[pos_x--][pos_y + 2] = true;
        }catch(IndexOutOfBoundsException e) {}

        try{
        moveAbles[pos_x++][pos_y+2] = true;
        }catch(IndexOutOfBoundsException e) {}

        try{
        moveAbles[pos_x+2][pos_y++] = true;
        }catch(IndexOutOfBoundsException e) {}

        try{
        moveAbles[pos_x+2][pos_y--] = true;
        }catch(IndexOutOfBoundsException e) {}

        try{
        moveAbles[pos_x--][pos_y-2] = true;
        }catch(IndexOutOfBoundsException e) {}

        try{
        moveAbles[pos_x++][pos_y-2] = true;
        }catch(IndexOutOfBoundsException e) {}

        try{
        moveAbles[pos_x-2][pos_y++] = true;
        }catch(IndexOutOfBoundsException e) {}

        try{
        moveAbles[pos_x-2][pos_y--] = true;
        }catch(IndexOutOfBoundsException e) {}

        return moveAbles;
    }
}
