package com.chessproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuContainer {

    @FXML
    private Button host_button;

    @FXML
    private Button close_button;

    @FXML
    private Button join_button;


    @FXML
    public void showHostGame(ActionEvent actionEvent){

    }

    @FXML
    public void showJoinLobby(ActionEvent actionEvent){

    }

    @FXML
    public void Close(ActionEvent actionEvent) {
        Stage stage = (Stage) close_button.getScene().getWindow();
        stage.close();
    }


}