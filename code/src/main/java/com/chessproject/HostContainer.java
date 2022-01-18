package com.chessproject;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HostContainer {
    @javafx.fxml.FXML
    private Button backToMenue;
    @javafx.fxml.FXML
    private Button hostGame;
    @javafx.fxml.FXML
    private TextField playerName;
    @javafx.fxml.FXML
    private Label hiddenLabel;

    @javafx.fxml.FXML
    public void backToMenue(ActionEvent actionEvent) {
        Stage stage = (Stage) backToMenue.getScene().getWindow();
        stage.close();
    }
}
