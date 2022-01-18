package com.chessproject.networking;

import java.io.IOException;
import java.net.Socket;

/**Runnable for threads that manage the Client Runtime*/
public class ClientManager implements Runnable {
    private Socket client;

    private String address;

    /** @param address Address of the host*/
    public ClientManager(String address){
        this.address = address;
    }

    @Override
    public void run() {
        establishConnection();
        try {
            new NetworkConversationManager(client.getInputStream(),client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void establishConnection(){
        try {
            client=new Socket(address,69420);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
