package Principal;

import Mensajes.Send_Message;
import Server.Client;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller{
    public TextField Caja;
    public TextArea Chat;
    public static Stage window;
    public boolean cerrar;
    public Label PORTGET;
    public Label IPGET;

    public void send_(ActionEvent event){
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


}