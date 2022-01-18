package com.chessproject;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class JoinContainer {
    @javafx.fxml.FXML
    private TextField ipTextfield;
    @javafx.fxml.FXML
    private Button backToMenue;
    @javafx.fxml.FXML
    private TextField playerName;
    @javafx.fxml.FXML
    private Label hiddenLabel;
    @javafx.fxml.FXML
    private Button joinTheGame;

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        Stage stage = (Stage) backToMenue.getScene().getWindow();
        stage.close();
    }
}
