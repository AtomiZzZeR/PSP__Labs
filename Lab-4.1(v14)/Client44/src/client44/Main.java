package client44;

import java.io.*;
import java.net.Socket;
import java.lang.Math;

public class Main {
    private static Socket socket;
    private static BufferedReader reader;
    private static BufferedReader in;
    private static PrintWriter out;

    public static void main(String[] args) throws IOException {
        socket = new Socket("localhost", 8081);
        reader = new BufferedReader(new InputStreamReader(System.in));
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

        System.out.println("Вы успешно подключились к серверу:");
        System.out.println("Введите любое сообщение: ");
        String username = reader.readLine();
        out.write("\n");
        out.flush();
        //String welcomeUser = in.readLine();
        //System.out.println(welcomeUser);

        new Thread(new Reader(socket)).start();

        while(true){

        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + min;
        
        switch(rand) {
            case 1: 
                FileReader reader1 = new FileReader("C:\\Users\\TheWalkSide\\Documents\\NetBeansProjects\\Client44\\src\\client44\\sonets\\1.txt");
        BufferedReader br = new BufferedReader(reader1);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
                break;
            case 2: 
                FileReader reader2 = new FileReader("C:\\Users\\TheWalkSide\\Documents\\NetBeansProjects\\Client44\\src\\client44\\sonets\\2.txt");
        BufferedReader br2 = new BufferedReader(reader2);
        String line2;
        while ((line = br2.readLine()) != null) {
            System.out.println(line);
        }
                break;
            case 3: 
                FileReader reader3 = new FileReader("C:\\Users\\TheWalkSide\\Documents\\NetBeansProjects\\Client44\\src\\client44\\sonets\\3.txt");
        BufferedReader br3 = new BufferedReader(reader3);
        String line3;
        while ((line = br3.readLine()) != null) {
            System.out.println(line);
        }
                break;
            case 4: 
                FileReader reader4 = new FileReader("C:\\Users\\TheWalkSide\\Documents\\NetBeansProjects\\Client44\\src\\client44\\sonets\\4.txt");
        BufferedReader br4 = new BufferedReader(reader4);
        String line4;
        while ((line = br4.readLine()) != null) {
            System.out.println(line);
        }
                break;
            case 5: 
                FileReader reader5 = new FileReader("C:\\Users\\TheWalkSide\\Documents\\NetBeansProjects\\Client44\\src\\client44\\sonets\\5.txt");
        BufferedReader br5 = new BufferedReader(reader5);
        String line5;
        while ((line = br5.readLine()) != null) {
            System.out.println(line);
        }
                break;
            case 6: 
                FileReader reader6 = new FileReader("C:\\Users\\TheWalkSide\\Documents\\NetBeansProjects\\Client44\\src\\client44\\sonets\\6.txt");
        BufferedReader br6 = new BufferedReader(reader6);
        String line6;
        while ((line = br6.readLine()) != null) {
            System.out.println(line);
        }
                break;
            case 7: 
                FileReader reader7 = new FileReader("C:\\Users\\TheWalkSide\\Documents\\NetBeansProjects\\Client44\\src\\client44\\sonets\\7.txt");
        BufferedReader br7 = new BufferedReader(reader7);
        String line7;
        while ((line = br7.readLine()) != null) {
            System.out.println(line);
        }
                break;
            case 8: 
                FileReader reader8 = new FileReader("C:\\Users\\TheWalkSide\\Documents\\NetBeansProjects\\Client44\\src\\client44\\sonets\\8.txt");
        BufferedReader br8 = new BufferedReader(reader8);
        String line8;
        while ((line = br8.readLine()) != null) {
            System.out.println(line);
        }
                break;
            case 9: 
                FileReader reader9 = new FileReader("C:\\Users\\TheWalkSide\\Documents\\NetBeansProjects\\Client44\\src\\client44\\sonets\\9.txt");
        BufferedReader br9 = new BufferedReader(reader9);
        String line9;
        while ((line = br9.readLine()) != null) {
            System.out.println(line);
        }
                break;
            case 10: 
                FileReader reader10 = new FileReader("C:\\Users\\TheWalkSide\\Documents\\NetBeansProjects\\Client44\\src\\client44\\sonets\\10.txt");
        BufferedReader br10 = new BufferedReader(reader10);
        String line10;
        while ((line = br10.readLine()) != null) {
            System.out.println(line);
        }
                break;
        }
            System.out.println("->");
            String word = reader.readLine();
            out.write(word + "\n");
            out.flush();
        }
    }
}
