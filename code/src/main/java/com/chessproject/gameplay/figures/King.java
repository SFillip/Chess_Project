package com.chessproject.gameplay.figures;

import com.chessproject.gameplay.board.Field;

public class King extends Figure{


    public King(int pos_x, int pos_y, int playerInControl) {
        super(pos_x, pos_y, playerInControl);
        name = "K";
    }

    @Override
    public boolean[][] determinMoveables(Field[][] chessboard) {

        boolean[][] moveAbles = new boolean[8][8];
        try {
            moveAbles[pos_x + 1][pos_y] = true;
        }catch(IndexOutOfBoundsException e) {}

        try {
            moveAbles[pos_x + 1][pos_y-1] = true;
        }catch(IndexOutOfBoundsException e) {}

        try {
            moveAbles[pos_x][pos_y-1] = true;
        }catch(IndexOutOfBoundsException e) {}

        try {
            moveAbles[pos_x-1][pos_y-1] = true;
        }catch(IndexOutOfBoundsException e) {}

        try {
            moveAbles[pos_x - 1][pos_y] = true;
        }catch(IndexOutOfBoundsException e) {}

        try {
            moveAbles[pos_x - 1][pos_y+1] = true;
        }catch(IndexOutOfBoundsException e) {}

        try {
            moveAbles[pos_x][pos_y+1] = true;
        }catch(IndexOutOfBoundsException e) {}

        try {
            moveAbles[pos_x + 1][pos_y + 1] = true;
        }catch(IndexOutOfBoundsException e) {}

        if(playerInControl == 0 && pos_x == 4 && pos_y == 0 && chessboard[7][0].getFigure().getName().equals("T") && !chessboard[5][0].isHasFigure()&& !chessboard[6][0].isHasFigure())
        {
            moveAbles[6][7] = true;
        }
        return moveAbles;

    }
}
