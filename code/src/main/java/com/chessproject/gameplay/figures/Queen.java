package com.chessproject.gameplay.figures;

import com.chessproject.gameplay.board.Field;

public class Queen extends Figure {

    public Queen(Field[][] chessboard) {
        this.chessboard = chessboard;
    }
    @Override
    public boolean[][] determinMoveables() {
        boolean[][] moveAbles = new boolean[8][8];
        try {
            for (int i = 0; true; i++) {

                moveAbles[this.pos_x + i][this.pos_y] = true;
                if(chessboard[this.pos_x + i][this.pos_y].isHasFigure()){
                    moveAbles[10][10]= true;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            try {
                for (int i = 0; true; i++) {

                    moveAbles[this.pos_x - i][this.pos_y] = true;
                    if(chessboard[this.pos_x - i][this.pos_y].isHasFigure()){
                        moveAbles[10][10]= true;
                    }
                }
            } catch (IndexOutOfBoundsException ex) {
                try {
                    for (int i = 0; true; i++) {

                        moveAbles[this.pos_x][this.pos_y + i] = true;
                        if(chessboard[this.pos_x][this.pos_y + i].isHasFigure()){
                            moveAbles[10][10]= true;
                        }
                    }
                } catch (IndexOutOfBoundsException exc) {
                    try {
                        for (int i = 0; true; i++) {

                            moveAbles[this.pos_x][this.pos_y - i] = true;
                            if(chessboard[this.pos_x][this.pos_y - i].isHasFigure()){
                                moveAbles[10][10]= true;
                            }
                        }
                    } catch (IndexOutOfBoundsException exce) {
                        try {
                            for (int i = 0; true; i++) {

                                moveAbles[this.pos_x + i][this.pos_y + i] = true;
                                if(chessboard[this.pos_x + i][this.pos_y + i].isHasFigure()){
                                    moveAbles[10][10]= true;
                                }
                            }
                        } catch (IndexOutOfBoundsException excep) {
                            try {
                                for (int i = 0; true; i++) {

                                    moveAbles[this.pos_x + i][this.pos_y - i] = true;
                                    if(chessboard[this.pos_x + i][this.pos_y - i].isHasFigure()){
                                        moveAbles[10][10]= true;
                                    }
                                }
                            } catch (IndexOutOfBoundsException except) {
                                try {
                                    for (int i = 0; true; i++) {

                                        moveAbles[this.pos_x - i][this.pos_y + i] = true;
                                        if(chessboard[this.pos_x - i][this.pos_y + i].isHasFigure()){
                                            moveAbles[10][10]= true;
                                        }
                                    }
                                } catch (IndexOutOfBoundsException excepti) {
                                    try {
                                        for (int i = 0; true; i++) {

                                            moveAbles[this.pos_x - i][this.pos_y - i] = true;
                                            if(chessboard[this.pos_x - i][this.pos_y - i].isHasFigure()){
                                                moveAbles[10][10]= true;
                                            }
                                        }
                                    } catch (IndexOutOfBoundsException exceptio) {
                                        return moveAbles;

                                    }

                                }
                            }

                        }

                    }

                }

            }

        } catch (Exception exception) {
            System.out.println("Error");
        }
        return null;
    }
}
