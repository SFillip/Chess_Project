package com.chessproject;

import com.chessproject.networking.ServerManager;
import com.chessproject.networking.ClientManager;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LobbyContainer {

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

                System.out.println(name);

                Thread f=new Thread(new ServerManager(() -> Platform.runLater(this::OnClientConnected)));

                f.start();

                playerNameInLobby.setText(name);
            } else {
                name=s.nextLine();
                ip=s.nextLine();

                Thread f=new Thread(new ClientManager(("ip")));
                f.start();

                enemyNameInLobby.setText(name);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void OnClientConnected(){
        clientJoinedAlert.show();
        clientConnected=true;
    }
}
