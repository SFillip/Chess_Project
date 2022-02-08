package com.chessproject.gameplay.figures;

import com.chessproject.gameplay.board.Field;

public class Pawn extends Figure{


    public Pawn(int pos_x, int pos_y, int playerInControl) {
        super(pos_x, pos_y, playerInControl);
    }

    @Override
    public boolean[][] determinMoveables(Field[][] chessboard) {
        boolean[][] moveAbles = new boolean[8][8];
        if (playerInControl == 0){
            try {
            moveAbles[pos_x][pos_y++] = true;
            }catch(IndexOutOfBoundsException e) {}

                try {
            if(chessboard[pos_x--][pos_y++].isHasFigure()){
                moveAbles[pos_x--][pos_y++] = true;
            }}catch(IndexOutOfBoundsException e) {}

                try {
            if(chessboard[pos_x++][pos_y++].isHasFigure()){
                moveAbles[pos_x++][pos_y++] = true;
            }}catch(IndexOutOfBoundsException e) {}
        }else{
                    try {
                        moveAbles[pos_x--][pos_y--] = true;
                    }catch(IndexOutOfBoundsException e) {}

                    try {
            if(chessboard[pos_x--][pos_y--].isHasFigure()){
                moveAbles[pos_x--][pos_y--] = true;
            }}catch(IndexOutOfBoundsException e) {
                    }
                        try {
            if(chessboard[pos_x++][pos_y--].isHasFigure()){
                moveAbles[pos_x++][pos_y--] = true;
            }}catch(IndexOutOfBoundsException e) {
                        }
        }
        return moveAbles;
    }
}
