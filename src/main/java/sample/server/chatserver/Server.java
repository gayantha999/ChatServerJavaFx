package sample.server.chatserver;

import javafx.scene.layout.VBox;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;


    public Server (ServerSocket serverSocket){
        try{
            this.serverSocket=serverSocket;
            this.bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
             //Server obj=new Server(bufferedReader);

        }catch (IOException e){
            System.out.println("Error creating server");
            e.printStackTrace();
            closeEverything(socket,bufferedReader,bufferedWriter);
        }
    }


    public void closeEverything(Socket socket,BufferedReader bufferedReader, BufferedWriter bufferedWriter){
        try{
            if (bufferedReader!=null){
                bufferedReader.close();
            }
            if (bufferedWriter!=null){
                bufferedWriter.close();
            }
            if (socket !=null){
                socket.close();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
