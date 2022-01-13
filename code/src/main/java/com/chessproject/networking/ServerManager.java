package com.chessproject.networking;

import com.chessproject.networking.events.ConnectionListener;
import com.chessproject.networking.events.HostListener;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerManager implements Runnable {

    private ServerSocket host;
    private Socket client;

    private HostListener hostStartListener;
    private ConnectionListener ClientConnectListener;

    public ServerManager(HostListener listener){
        hostStartListener=listener;
    }

    @Override
    public void run() {
        startHosting();

        try {
            host.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ClientConnectListener.onConnect();

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
