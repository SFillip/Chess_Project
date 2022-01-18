package com.chessproject.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class NetworkConversationManager {
    private BufferedReader in;
    private PrintWriter out;

    /**
     * @param in InputStream of Server/Client
     * @param out OutputStream of Server/Client
     */
    public NetworkConversationManager(BufferedReader in, PrintWriter out) {
        this.in = in;
        this.out = out;
    }

    /**
     * Starts Checking for incoming commands over the Network
     * When Input comes it will automatically be Process
     */
    public void CheckForConversations(){
        try {
            while (true) {
                String input = in.readLine();
                ProcessInput(input);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void ProcessInput(String input){

    }
}
