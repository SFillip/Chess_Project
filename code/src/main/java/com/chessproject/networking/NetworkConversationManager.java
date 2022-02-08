package com.chessproject.networking;

import com.chessproject.LobbyContainer;
import com.chessproject.gameplay.GamePlayManager;
import javafx.application.Platform;

import java.io.*;


/**
 * Class that Handles Conversation of the Network
 */
public class NetworkConversationManager {
    private final BufferedReader in;
    private static PrintWriter out;

    /**
     * @param in  InputStream of Server/Client
     * @param out OutputStream of Server/Client
     */
    public NetworkConversationManager(InputStream in, OutputStream out) {
        this.in = new BufferedReader(new InputStreamReader(in));
        NetworkConversationManager.out = new PrintWriter(new OutputStreamWriter(out));
    }


    /**
     * Starts Checking for incoming commands over the Network
     * When Input comes it will automatically be Process
     */
    public void checkForConversations() {
        try {
            while (true) {
                String input = in.readLine();
                processInput(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Sends message to the other participant
     *
     * @param toWrite String that should be sent
     */
    public static void write(String toWrite) {
        System.out.println(toWrite);
        out.println(toWrite);
        out.flush();
    }

    private void processInput(String input) {

        if (input.startsWith("gameplay::")) {
            if (input.substring(10,24).equals("playerChange::")) {
                GamePlayManager.playerInControl = Integer.parseInt(input.substring(24));
            }
        } else if (input.startsWith("request::")) {
            if (input.substring(9, 13).equals("name")) {
                System.out.println("requ");

                NetworkConversationManager.write("answer::playerNameRequest::" + GamePlayManager.localPlayer.getPlayerName());

                if (input.substring(13).equals("::originalCall")) {
                    NetworkConversationManager.write("request::name");
                }
            }
        } else if (input.startsWith("answer::")) {
            if (input.substring(8, 27).equals("playerNameRequest::")) {

                LobbyContainer.remoteName = input.substring(27);
            }
        }else if(input.equals("swapToChessboard")){
            Platform.runLater(()->{
                try {
                    LobbyContainer.switchSceneToChessboardOnClient();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        else {
            System.out.println("error " + input + " not defined");
        }
    }
}
