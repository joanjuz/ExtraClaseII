package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Controller{
    public TextField Caja;
    public Label Chat;
    ArrayList<String> messages = new ArrayList<String>();

    public void generateRandom(ActionEvent event){
        String message = Caja.getText();
        messages.add(message+"\n");
        int contador = 0;
        while (contador < messages.size()){
            contador += 1;
            Chat.setText(messages.get(contador));
        }


    }


}
