package com.chessproject.gameplay.figures;

import com.chessproject.gameplay.board.Field;



/**
 *Abstract class that is to be inherited by any other Figures
 */
public abstract class Figure {

    public Field[][] chessboard;
    /**Position on X Axis of the Figure*/
    public int pos_x;
    /**Position on Y Axis of the Figure*/
    public int pos_y;

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

    /**@return Returns a list populated with the fields that can be moved to*/
    public abstract boolean[][] determinMoveables();
}