package com.chessproject.gameplay;

import com.chessproject.networking.NetworkConversationManager;

public class GamePlayManager {
    public static int playerInControl = 0;
    boolean endOfGame = false;

    public static NetworkConversationManager conversationManager;

    public void gameLoop() {
        while (!endOfGame) {
            if(playerInControl==0) {
                //Player selects Character
                //get all Fields that can be moved to
                //Move character
                //Send New Field to Client
            }
            //Check if won else change payer
        }
        //Disconnect the Players
    }

    public static void changePlayer(int playerNumber) {
        playerInControl = playerNumber;
        conversationManager.write("gameplay::playerChange::"+playerNumber);
    }
}
