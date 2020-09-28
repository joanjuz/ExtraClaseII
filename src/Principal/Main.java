package Principal;
/**
 * Aplicacion de mensajeria usando Sockets y javaFx
 * @instituto TECNOLOGICO DE COSTA
 * @CARRERA INGENIERIA EN COMPUTADORES
 * @CURSO  ALGORITMO Y ESTRUCTURA DE DATOS
 * @Profesor JOSE ISAAC RAMIREZ HERRERA
 * @author <a href="joanjuz@gmail.com">Joan Ugalde Zarate</a>
 * @version 1.0
 * Se utilizo Gitub
 *
 *
 */
import Server.CLIENTE;
import Server.Client;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.net.InetAddress;
import java.net.Socket;

public class Main extends Application {
    public static Stage window;
    private static Socket s;
    public boolean cerrar = false;
    public static InetAddress ip;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        ip = InetAddress.getByName("localhost");

        s = new Socket(ip,4000);

        Thread cliente = new Client(s);
        cliente.start();


        window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("Intefaz.fxml"));
        window.setTitle("Mensajeria");
        window.setScene(new Scene(root, 780, 540));
        window.show();
            }
    public static void closed(){
        window.close();
    }

    public static int port_(){
        return s.getLocalPort();
    }
    public static InetAddress ip_(){
        return ip;
    }
}

