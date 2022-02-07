package com.chessproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

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
    public void close(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) backToMenue.getScene().getWindow();
        stage.close();

        stage = (Stage) backToMenue.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("menu_view.fxml"));
        stage.getScene().setRoot(root);
    }

    @javafx.fxml.FXML
    public void startGame(ActionEvent actionEvent) {
    }
}
