package Principal;

import Mensajes.Send_Message;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller{
    public TextField Caja;
    public TextArea Chat;
    public static Stage window;
    public boolean cerrar;


    public void send_(ActionEvent event){
        Send_Message.send(Caja,Chat);
    }
    public void close(ActionEvent event){
        Main.closed();

    }


}