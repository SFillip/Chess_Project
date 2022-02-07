package com.chessproject;

import com.chessproject.networking.ServerManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

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

    @Deprecated
    public void initialize(){
        try {
            Scanner sc = new Scanner(new File("getNamesAndIP.txt"));
            if(sc.nextLine().equals("1"))
            {
                playerNameInLobby.setText(sc.nextLine());

                //Thread fred = new Thread(new ServerManager());
                /** Geht nu ned **/

            }else if(sc.nextLine().equals("2")){
                playerNameInLobby.setText(sc.nextLine());

            }else{
                System.out.println("Es ist ein Fehler aufgetreten");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


    }
}
