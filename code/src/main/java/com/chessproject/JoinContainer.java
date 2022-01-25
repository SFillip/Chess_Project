package com.chessproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
    private Button joinGameButton;

    private boolean ipFieldFilled = false;
    private boolean nameFieldFilled = false;

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        Stage stage = (Stage) backToMenue.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void initialize(){


        ipTextfield.textProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue == "" || newValue == null){
                joinGameButton.setDisable(true);
                ipFieldFilled = false;
            }else{
                ipFieldFilled = true;
            }
            if (ipFieldFilled&& nameFieldFilled){
                joinGameButton.setDisable(false);
            }
        });
        playerName.textProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue == "" || newValue == null){
                joinGameButton.setDisable(true);






                nameFieldFilled = false;
            }else{

                nameFieldFilled = true;
            }
            if (ipFieldFilled && nameFieldFilled ){
                joinGameButton.setDisable(false);
            }
        });


    }
}
