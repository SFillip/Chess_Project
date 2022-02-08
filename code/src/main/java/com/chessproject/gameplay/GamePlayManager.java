package com.chessproject.gameplay;

import com.chessproject.networking.NetworkConversationManager;


public class GamePlayManager {
    public static Player localPlayer;
    public static int playerInControl = 0;

    public boolean endOfGame = false;
    public boolean charSelected;

    public void gameLoop() {

    }

    public static void changePlayer() {
        if(playerInControl==0){
            playerInControl=1;
        }else {
            playerInControl=0;
        }

        NetworkConversationManager.write("gameplay::playerChange::"+playerInControl);
    }
}
