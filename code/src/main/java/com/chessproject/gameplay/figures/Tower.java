package com.chessproject.gameplay.figures;

import java.util.ArrayList;
import java.util.List;

public class Tower extends Figure {

    @Override
    public boolean[][] determinMoveables() {
        boolean[][] moveAbles = new boolean[8][8];
        try{
            for (int i = 0;true; i++) {

                moveAbles[this.pos_x+i][this.pos_y] = true;
            }
        }catch (IndexOutOfBoundsException e) {
            try{
                for (int i = 0;true; i++) {

                    moveAbles[this.pos_x-i][this.pos_y] = true;
                }
            }catch (IndexOutOfBoundsException ex) {
                try{
                    for (int i = 0;true; i++) {

                        moveAbles[this.pos_x][this.pos_y+i] = true;
                    }
                }catch (IndexOutOfBoundsException exc) {
                    try{
                        for (int i = 0;true; i++) {

                            moveAbles[this.pos_x+i][this.pos_y-i] = true;
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
