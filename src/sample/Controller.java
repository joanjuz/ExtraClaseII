package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.ArrayList;


public class Controller{
    public TextField Caja;
    public TextArea Chat;
    String messages = "";

    public void send(ActionEvent event){
        String message = Caja.getText() + "\n";
        messages += message;
        Chat.setText(messages);
        Caja.setText("");




    }


}
