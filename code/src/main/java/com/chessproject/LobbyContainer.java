package com.chessproject;

import com.chessproject.gameplay.GamePlayManager;
import com.chessproject.gameplay.Player;
import com.chessproject.networking.NetworkConversationManager;
import com.chessproject.networking.ServerManager;
import com.chessproject.networking.ClientManager;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LobbyContainer {

    public static String remoteName;

    @FXML
    private Button backToMenu;
    @FXML
    private Button hostGame;
    @FXML
    private Label hiddenLabel;
    @FXML
    private Label enemyNameInLobby;
    @FXML
    private Label playerNameInLobby;

    private Alert clientJoinedAlert;
    private boolean clientConnected;

    @FXML
    public void close(ActionEvent actionEvent) {
        Stage stage = (Stage) backToMenu.getScene().getWindow();
        Parent root = null;

        try {
            root = new FXMLLoader(getClass().getResource("menu_view.fxml")).load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.getScene().setRoot(root);
    }

    @FXML
    public void startGame(ActionEvent actionEvent) {
    }

    @FXML
    public void initialize() {
        clientJoinedAlert = new Alert(Alert.AlertType.INFORMATION);
        clientJoinedAlert.setContentText("Client joined");


        String ip;
        String name;
        try (Scanner s = new Scanner(new File("getNamesAndIP.txt"))) {
            String line = s.nextLine();
            if (line.startsWith("1")) {
                name=s.nextLine();

                playerNameInLobby.setText(name);
                GamePlayManager.localPlayer=new Player(name,0);

                Thread f=new Thread(new ServerManager(() -> Platform.runLater(this::onClientConnected)));

                f.start();

            } else {
                name=s.nextLine();
                ip=s.nextLine();

                GamePlayManager.localPlayer=new Player(name,1);

                Thread f=new Thread(new ClientManager(("ip")));
                Thread f2=new Thread(()->Platform.runLater(this::onConnectedToHost));
                f.start();
                f2.start();

                playerNameInLobby.setText(name);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void onClientConnected(){
        clientJoinedAlert.showAndWait();
        clientConnected=true;

        NetworkConversationManager.write("request::name");

        while(LobbyContainer.remoteName==null){

        }

        enemyNameInLobby.setText(LobbyContainer.remoteName);
        hostGame.setDisable(false);
    }
    public void onConnectedToHost(){
        NetworkConversationManager.write("request::name");
        while(LobbyContainer.remoteName==null){

        }

        enemyNameInLobby.setText(LobbyContainer.remoteName);
    }
}
