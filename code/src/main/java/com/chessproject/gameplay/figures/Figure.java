package com.chessproject.gameplay.figures;

public abstract class Figure {
    public int pos_x, pos_y;

    public void move(int x, int y){
        //Not implemented yet
    }

    public abstract void determinMoveables();
}