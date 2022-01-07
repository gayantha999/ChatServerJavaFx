package sample.server.chatserver;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.ResourceBundle;

public class ServerController extends Thread implements Initializable {

    private Server server;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("----waiting to connect client---- ");
        try {

            server=new Server(new ServerSocket(1));
            System.out.println("Connected");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error Creating Server");
        }

    }



}