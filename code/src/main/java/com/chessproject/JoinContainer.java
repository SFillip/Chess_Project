package com.chessproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

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

    @Deprecated
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

    @FXML
    public void ipTextField(ActionEvent actionEvent) {
    }

    @FXML
    public void playernameTextfield(ActionEvent actionEvent) {
    }

    @FXML
    public void joinGame(ActionEvent actionEvent) throws IOException {

        String playerNam = playerName.getText();
        String ipAddress = ipTextfield.getText();
        try(PrintWriter w = new PrintWriter(new File("getNamesAndIP.txt"))){
            w.println("2");
            w.println(playerNam);
            w.print(ipAddress);
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }catch(Exception e){
            e.printStackTrace();
        }
        Stage stage = (Stage) backToMenue.getScene().getWindow();
        stage.close();







    }
}
