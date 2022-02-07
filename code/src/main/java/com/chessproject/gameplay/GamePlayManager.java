package com.chessproject.gameplay;

import com.chessproject.networking.NetworkConversationManager;


public class GamePlayManager {
    public static Player localPlayer;
    public static int playerInControl = 0;

    public static NetworkConversationManager conversationManager;

    public boolean endOfGame = false;
    public boolean charSelected;

    public void gameLoop() {
        while (!endOfGame) {
            while(!charSelected) {}

        }
        //Disconnect the Players
    }

    public static void changePlayer(int playerNumber) {
        playerInControl = playerNumber;
        conversationManager.write("gameplay::playerChange::"+playerNumber);
    }
}
