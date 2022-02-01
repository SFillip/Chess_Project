package com.chessproject;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LobbyContainer {
    @javafx.fxml.FXML
    private Button backToMenue;
    @javafx.fxml.FXML
    private Button hostGame;
    @javafx.fxml.FXML
    private Label hiddenLabel;
    @javafx.fxml.FXML
    private Label enemyNameInLobby;
    @javafx.fxml.FXML
    private Label playerNameInLobby;



    @javafx.fxml.FXML
    public void close(ActionEvent actionEvent) {
        Stage stage = (Stage) backToMenue.getScene().getWindow();
        stage.close();
    }

    @javafx.fxml.FXML
    public void startGame(ActionEvent actionEvent) {
    }
}
