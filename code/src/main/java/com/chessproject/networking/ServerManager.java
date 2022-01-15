package com.chessproject.networking;

import com.chessproject.networking.events.ConnectionListener;
import com.chessproject.networking.events.HostListener;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/** Runnable for threads that manage the servers runtime*/
public class ServerManager implements Runnable {

    private ServerSocket host;
    private Socket client;

    private HostListener hostStartListener;
    private ConnectionListener clientConnectListener;

    /** Creates a ServerManager with two Events for Connection
     * @param listener Event that triggers when the Host start
     * @param clientListener Event that triggers when Client connects*/
    public ServerManager(HostListener listener,ConnectionListener clientListener) {
        hostStartListener=listener;
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


    }

    private void startHosting(){
        try {
            host=new ServerSocket(69420);
        } catch (IOException e) {
            e.printStackTrace();
        }

        hostStartListener.onHostStarted();
    }
}
