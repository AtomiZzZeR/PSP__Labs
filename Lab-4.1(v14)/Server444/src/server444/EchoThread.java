package server444;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class EchoThread extends Thread {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private String username;
    private Status status;
    private ArrayList<Socket> sockets;

    public EchoThread(Socket clientSocket, ArrayList<Socket> sockets) {
        this.socket = clientSocket;

        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        } catch (IOException e) {
            return;
        }

        this.sockets = sockets;

        status = new Status(clientSocket);
    }

    public void run() {

        try {
            username = in.readLine();
            out.println(username);
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread(new Status(socket)).start();
    }
}
