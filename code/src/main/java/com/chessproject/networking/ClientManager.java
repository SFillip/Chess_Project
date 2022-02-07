package com.chessproject.networking;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**Runnable for threads that manage the Client Runtime*/
public class ClientManager implements Runnable {
    private Socket client;

    private final String address;

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
            client=new Socket(address,69);
        } catch (UnknownHostException e) {
            System.out.println(address);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
