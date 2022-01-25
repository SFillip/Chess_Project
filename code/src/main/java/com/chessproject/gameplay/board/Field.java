package com.chessproject.gameplay.board;

import com.chessproject.gameplay.figures.Figure;

public class Field {
    private boolean hasFigure;
    private Figure figure;

    public boolean isHasFigure() {
        return hasFigure;
    }
    public void setHasFigure(boolean hasFigure) {
        this.hasFigure = hasFigure;
    }

    public Figure getFigure() {
        return figure;
    }
    public void setFigure(Figure figure) {
        this.figure = figure;
    }
}
