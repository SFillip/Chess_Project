package com.chessproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuContainer {

    @FXML
    private Button host_button;

    @FXML
    private Button close_button;

    @FXML
    private Button join_button;


    @FXML
    public void showHostGame(ActionEvent actionEvent) throws IOException {
        Parent parent=new FXMLLoader(getClass().getResource("host_view.fxml")).load();
        Scene scene=new Scene(parent);
        Stage stage=new Stage();

        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

        stage = (Stage) host_button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("lobby_view.fxml"));
        stage.getScene().setRoot(root);
    }

    @FXML
    public void showJoinLobby(ActionEvent actionEvent) throws IOException {
        Parent parent=new FXMLLoader(getClass().getResource("join_view.fxml")).load();
        Scene scene=new Scene(parent);
        Stage stage=new Stage();

        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

        stage = (Stage) host_button.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("lobby_view.fxml"));
        stage.getScene().setRoot(root);
    }

    @FXML
    public void Close(ActionEvent actionEvent) {
        Stage stage = (Stage) close_button.getScene().getWindow();
        stage.close();

    }


}