package sample;

import com.sun.javafx.stage.EmbeddedWindow;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import java.util.ArrayList;


public class Controller{
    public TextField Caja;
    public TextArea Chat;




    public void send_(ActionEvent event){
        Send_Message.send(Caja,Chat);





    }


}
