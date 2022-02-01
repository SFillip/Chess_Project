package com.chessproject;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class ChessboardController {


    @FXML
    private GridPane gridPane;

    @FXML
    public void initialize(){
        for(Node child : gridPane.getChildren()){

            child.setOnMouseEntered(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent mouseEvent) {
                    Pane p=(Pane) mouseEvent.getSource();

                }
            });
        }
    }
}
