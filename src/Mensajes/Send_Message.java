package Mensajes;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Send_Message{
    static String messages = "";
    public static void send(TextField Caja, TextArea Chat){
        String message = Caja.getText() + "\n";
        messages += message;
        Chat.setText(messages);
        Caja.setText("");
    }

}
