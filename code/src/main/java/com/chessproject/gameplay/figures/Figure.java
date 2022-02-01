package com.chessproject.gameplay.figures;

import java.util.List;

/**
 *Abstract class that is to be inherited by any other Figures
 */
public abstract class Figure {


    /**Position on X Axis of the Figure/*public int pos_x;
    /**Position on Y Axis of the Figure*/public int pos_y;

    /**Marks Player in Control
     * 0= Host
     * 1= Client
     */
    public int playerInControl;

    /**Moves Figure Position*/
    public void move(int x, int y){
        pos_x=x;
        pos_y=y;
    }

    /**@return Returns a list populated with the field that can be moved to*/
    public abstract List<Integer[][]> determinMoveables();
}