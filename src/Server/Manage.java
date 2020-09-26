package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Date;

public class Manage extends Thread{
    final DataInputStream message;
    final Socket s;
    final DataOutputStream server;
    int puerto;
    public Manage(Socket s, DataInputStream message, DataOutputStream server,int puerto){
        this.s = s;
        this.message = message;
        this.server = server;
        this.puerto = puerto;

    }

    @Override
    public void run() {
        String received;
        String toreturn;
        while(true){
            try{
                server.writeUTF("");

                received = message.readUTF();

                if (received.equals("")){
                    continue;
                }
                server.writeUTF(received);

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }}

