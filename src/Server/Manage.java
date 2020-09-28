package Server;

import Mensajes.Mapa;
import Mensajes.Send_Message;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
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
                    Mapa.comunication(s, Mapa.puertos.get(toreturn), puerto+" | "+received + "\n");
                    System.out.println(Mapa.getMap());
                    System.out.println(Mapa.comun(s,Mapa.puertos.get(toreturn)));
                    java.util.List<String> envio = new ArrayList<>();
                    envio = Mapa.comun(s,Mapa.puertos.get(toreturn));
                    String mensages = "";
                    for(int i = 0; i < envio.size() ; i++){
                        mensages += envio.get(i);
                    }
                    server.writeUTF(mensages);


                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

