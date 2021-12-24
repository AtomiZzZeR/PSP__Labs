package com.company;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Status extends Thread{
    private Socket socket;
    private PrintWriter out;

    public Status(Socket clientSocket) {
        this.socket = clientSocket;
        try {
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
