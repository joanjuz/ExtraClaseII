package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller{
    protected TextField Caja;
    protected TextArea Chat;




    public void send_(ActionEvent event){
        Send_Message.send(Caja,Chat);
    }
}