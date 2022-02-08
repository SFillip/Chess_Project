package com.chessproject;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class ChessboardController {

    @FXML
    private GridPane gridPane;

    private boolean figureSelected;

    @Deprecated
    public void initialize(){
        for(Node child : gridPane.getChildren()){
            child.setOnMousePressed(mouseEvent -> {
                if(!figureSelected){
                    System.out.println("a");
                    figureSelected=true;
                }else {
                    System.out.println("b");
                    figureSelected=false;
                }
            });
        }
    }
}
