package com.chessproject.networking.events;

/**Event that riggers when a client connects to the Server*/
@FunctionalInterface
public interface ConnectionListener {
    void onConnect();
}
