package Server;

import Mensajes.Mapa;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Map;

public class Manage extends Thread{
    final DataInputStream message;
    final Socket s;
    final DataOutputStream server;
    int puerto;
    int tosend;
    int enviara;
    public Manage(Socket s, DataInputStream message, DataOutputStream server,int puerto,int enviara){
        this.s = s;
        this.message = message;
        this.server = server;
        this.puerto = puerto;
        this.tosend = tosend;
        this.enviara = enviara;
    }
    @Override
    public void run() {
        String received;
        String toreturn;
        while(true){
            try {
                received = message.readUTF();

                if (received.equals("")){
                    continue;
                }
                server.writeUTF(received);
                Mapa.comunication(s,Mapa.puertos.get(enviara),received);
                System.out.println(Mapa.getMap());


            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

