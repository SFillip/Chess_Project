package com.chessproject.gameplay.figures;

import java.util.List;

public abstract class Figure {
    public int pos_x, pos_y;
    public int playerInControl;

    /**Moves Figure Position*/
    public void move(int x, int y){
        pos_x=x;
        pos_y=y;
    }

    /**@return Returns a list populated with the field that can be moved to*/
    public abstract List<Integer[][]> determinMoveables();
}