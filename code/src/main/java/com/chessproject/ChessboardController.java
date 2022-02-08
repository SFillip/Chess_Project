package com.chessproject;

import com.chessproject.gameplay.GamePlayManager;
import com.chessproject.gameplay.board.Board;
import com.chessproject.gameplay.figures.Figure;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public class ChessboardController {

    @FXML
    private GridPane gridPane;

    private boolean figureSelected;

    private Board board;
    private Figure selected;
    private boolean[][]moveAbles;

    private int OriginalX;
    private int OriginalY;

    @Deprecated
    public void initialize(){
    board=new Board();

        for(Node child : gridPane.getChildren()){
            child.setOnMousePressed(mouseEvent -> {
                if(!figureSelected && GamePlayManager.playerInControl == GamePlayManager.localPlayer.getPlayerNumber()){

                    try {
                        OriginalX= GridPane.getColumnIndex(child);
                    }catch(NullPointerException e){
                        OriginalX=0;
                    }

                    try {
                        OriginalY= GridPane.getRowIndex(child);
                    }catch(NullPointerException e){
                        OriginalY=0;
                    }

                    System.out.println(OriginalX+" "+OriginalY);
                    if(board.selectFigure(OriginalX,OriginalY,GamePlayManager.localPlayer.getPlayerNumber())!=null){
                        selected=board.selectFigure(OriginalX,OriginalY,GamePlayManager.localPlayer.getPlayerNumber());

                        moveAbles=selected.determinMoveables()

                        figureSelected=true;
                    }
                }else if(figureSelected && GamePlayManager.playerInControl == GamePlayManager.localPlayer.getPlayerNumber()) {
                    System.out.println("b");
                    figureSelected=false;

                    GamePlayManager.changePlayer();
                }
            });
        }
    }
}
