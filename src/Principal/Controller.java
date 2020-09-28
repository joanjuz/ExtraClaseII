package Principal;

import Mensajes.Send_Message;
import Mensajes.Sendto;
import Server.Client;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller{
    public TextField Caja;
    public TextArea Chat;
    public static Stage window;
    public boolean cerrar;
    public Label PORTGET;
    public Label IPGET;
    public void send_(ActionEvent event) throws IOException {
        Send_Message.send(Caja,Chat);
    }
    public void close(ActionEvent event){
        Main.closed();
    }
    public void data(ActionEvent event){
        String puerto = Main.port_()+"";
        String ip4 = Main.ip_()+"";
        PORTGET.setText(puerto);
        IPGET.setText(ip4);
    }
    public void setport(ActionEvent event) throws IOException {
        Send_Message.set_port(Main.port_(), (Button) event.getSource());
    }
}