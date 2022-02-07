package com.chessproject.networking;

import com.chessproject.networking.events.ConnectionListener;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/** Runnable for threads that manage the servers runtime*/
public class ServerManager implements Runnable {

    private ServerSocket host;
    private Socket client;

    private final ConnectionListener clientConnectListener;

    /** Creates a ServerManager with two Events for Connection
     * @param clientListener Event that triggers when Client connects*/
    public ServerManager(ConnectionListener clientListener) {
        clientConnectListener=clientListener;
    }

    @Override
    public void run() {
        startHosting();

        try {
            client=host.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }

        clientConnectListener.onConnect();

        try {
            new NetworkConversationManager(client.getInputStream(),client.getOutputStream()).checkForConversations();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void startHosting(){
        try {
            host=new ServerSocket(69);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
