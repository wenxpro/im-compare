package com.example.imnio.nio;

public class TimerServer {
    public static void main(String[] args) {
        int port = 8881;
        MultiplexerTimerServer timerServer = new MultiplexerTimerServer(port);
        new Thread(timerServer,"NIO-MultiplexerTimerServer-001").start();
    }
}
