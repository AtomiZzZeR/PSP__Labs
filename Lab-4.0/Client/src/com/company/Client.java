package com.company;

import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Client {
    private static Socket socket;
    private static BufferedReader reader;
    private static BufferedReader in;
    private static PrintWriter out;

    public static void main(String[] args) throws IOException {
        socket = new Socket("localhost", 8081);
        reader = new BufferedReader(new InputStreamReader(System.in));
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

        System.out.println("Соединение установлено:");
        System.out.println("Введите имя: ");
        String username = reader.readLine();
        
        File file = new File("documents/listOfClients.txt");
        PrintWriter pw = new PrintWriter(file);
        
        pw.println("Пользователь: " + username + "\n");
        
        pw.close();
        
        out.write(username + "\n");
        out.flush();
        String welcomeUser = in.readLine();
        System.out.println(welcomeUser);

        new Thread(new Reader(socket)).start();

        while(true){
            System.out.println("->");
            String word = reader.readLine();
            out.write(word + "\n");
            out.flush();
        }
    }
}
