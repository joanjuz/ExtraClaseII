package Server;


import Principal.Controller;
import javafx.scene.control.TextArea;

public class CLIENTE extends Thread{
    public TextArea Chat;

    public CLIENTE(TextArea Chat){
        this.Chat = Chat;

    }


    @Override
    public void run() {
        while(true){
            Chat.setText(Client.Chatbox());
        }
    }
}
