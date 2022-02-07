package com.chessproject;

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

            //Switches on Power when hovered over
            child.setOnMouseEntered(new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent mouseEvent) {
                    Pane p=(Pane) mouseEvent.getSource();
                    p.setStyle("-fx-border: yellow");
                }
            });

            //Switches off border when hover exited
            child.setOnMouseExited(new EventHandler<MouseEvent>(){

                @Override
                public void handle(MouseEvent mouseEvent) {
                    Pane p=(Pane) mouseEvent.getSource();
                    p.setStyle("-fx-border: transparent");
                }
            });

            child.setOnMouseClicked(new EventHandler<MouseEvent>(){
                final int x=GridPane.getColumnIndex(child);
                final int y=GridPane.getRowIndex(child);

                @Override
                public void handle(MouseEvent mouseEvent) {

                }
            });
        }
    }
}
