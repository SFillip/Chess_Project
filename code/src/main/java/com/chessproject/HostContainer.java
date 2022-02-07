package com.chessproject;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

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

    @Deprecated
    public void initialize(){

        playerName.textProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue.equals("")|| newValue == null){
                hostGame.setDisable(true);

            }else{

                hostGame.setDisable(false);
            }

        });


    }

    @javafx.fxml.FXML
    public void createLobby(ActionEvent actionEvent) throws IOException {


        String playerNam = playerName.getText();
        try(PrintWriter w = new PrintWriter(new File("getNamesAndIP.txt"))){
        w.println("1");
        w.println(playerNam);
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }catch(Exception e){
            e.printStackTrace();
        }
        Stage stage = (Stage) backToMenue.getScene().getWindow();
        stage.close();





    }
}

