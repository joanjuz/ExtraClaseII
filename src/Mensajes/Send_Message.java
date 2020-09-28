package Mensajes;

import Principal.Main;
import Server.Client;
import Server.Manage;
import Server.Servidor;
import Server.send;
import com.sun.javafx.charts.Legend;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Send_Message{

    public static String messages = "";
    public static int puerto;
    public static int client2;
    public static boolean click;
    public static int localclient;

    public static void send(TextField Caja, TextArea Chat) throws IOException {
        if(client2 == 0) {
            String message = "No has seleccionado un destinatario" + "\n";
            Chat.setText(message);
            Caja.setText("");
        }else if(localclient==0){
            localclient = Main.port_();
        }else{
            messages = Caja.getText();
            Client.set_message(messages);
            Caja.setText("");
            messages = "";
        }
    }
    public static void set_port(int puerto, Button destino) throws IOException {
        if(destino.getText().equals("Añadir")) {
            Sendto.display(puerto);
            String e = Sendto.answer;
            client2 = Integer.parseInt(Sendto.answer);
            localclient = puerto;
            destino.setText(e);
            Client.set_otherport(client2);

        }else{
            send.puerto = Integer.parseInt(destino.getText());
            client2 = Integer.parseInt(destino.getText());
            localclient = puerto;
            System.out.println(client2);
            Client.set_otherport(client2);

        }
}
}
