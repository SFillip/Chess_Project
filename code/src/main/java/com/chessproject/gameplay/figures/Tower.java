package com.chessproject.gameplay.figures;

import com.chessproject.gameplay.board.Field;

import java.util.ArrayList;
import java.util.List;

public class Tower extends Figure {


    public Tower(int pos_x, int pos_y, int playerInControl) {
        super(pos_x, pos_y, playerInControl);
    }

    @Override
    public boolean[][] determinMoveables(Field[][] chessboard) {
        boolean[][] moveAbles = new boolean[8][8];
        try{
            for (int i = 0;true; i++) {

                moveAbles[this.pos_x+i][this.pos_y] = true;
                if(chessboard[this.pos_x + i][this.pos_y].isHasFigure()){
                    moveAbles[10][10]= true;
                }
            }
        }catch (IndexOutOfBoundsException e) {
            try{
                for (int i = 0;true; i++) {

                    moveAbles[this.pos_x-i][this.pos_y] = true;
                    if(chessboard[this.pos_x - i][this.pos_y].isHasFigure()){
                        moveAbles[10][10]= true;
                    }
                }
            }catch (IndexOutOfBoundsException ex) {
                try{
                    for (int i = 0;true; i++) {

                        moveAbles[this.pos_x][this.pos_y+i] = true;
                        if(chessboard[this.pos_x][this.pos_y + i].isHasFigure()){
                            moveAbles[10][10]= true;
                        }
                    }
                }catch (IndexOutOfBoundsException exc) {
                    try{
                        for (int i = 0;true; i++) {

                            moveAbles[this.pos_x][this.pos_y-i] = true;
                            if(chessboard[this.pos_x][this.pos_y - i].isHasFigure()){
                                moveAbles[10][10]= true;
                            }
                        }
                    }catch (IndexOutOfBoundsException exce) {
                        return moveAbles;

                    }

                }

            }catch(Exception exception){
                System.out.println("Error");
            }


        }

        return null;
    }
}
