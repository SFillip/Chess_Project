package com.chessproject.networking.events;

/**Event that triggers when the Host starts up the connection*/
@FunctionalInterface
public interface HostListener {
    void onHostStarted();
}
