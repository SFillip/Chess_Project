package com.chessproject.networking;

import java.io.*;


/**
 * Class that Handles Conversation of the Network
 */
public class NetworkConversationManager {
    private BufferedReader in;
    private PrintWriter out;

    /**
     * @param in InputStream of Server/Client
     * @param out OutputStream of Server/Client
     */
    public NetworkConversationManager(InputStream in, OutputStream out) {
        this.in = new BufferedReader(new InputStreamReader(in));
        this.out =new PrintWriter(new OutputStreamWriter(out));
    }



    /**
     * Starts Checking for incoming commands over the Network
     * When Input comes it will automatically be Process
     */
    public void checkForConversations(){
        try {
            while (true) {
                String input = in.readLine();
                processInput(input);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    /**
     * Sends message to the other participant
     * @param toWrite String that should be sent
     */
    public void Write(String toWrite){
        out.write(toWrite);
    }

    private void processInput(String input){

    }
}
