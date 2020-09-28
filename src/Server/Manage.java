package Server;

import Mensajes.Mapa;
import Mensajes.Send_Message;

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

    public Manage(Socket s, DataInputStream message, DataOutputStream server,int puerto){
        this.s = s;
        this.message = message;
        this.server = server;
        this.puerto = puerto;

    }
    @Override
    public void run() {
        String received;
        int toreturn = 0;
        boolean responce;
        while (true){
            try {
                received = message.readUTF();
                server.writeUTF(received);
                try{
                    int port;
                    port = Integer.parseInt(received);
                    responce = true;

                }catch (Exception o){
                    responce = false;
                }
                if (responce){
                    System.out.println("Es true");
                    toreturn = Integer.parseInt(received);
                }else {
                    if (received.equals("")) {
                        continue;
                    }
                    System.out.println("Enviar a " + toreturn);
                    Mapa.comunication(s, Mapa.puertos.get(toreturn), received);
                    System.out.println(Mapa.getMap());

                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

