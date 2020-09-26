package Server;

import Mensajes.Mapa;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

public class Servidor {
    public static void main(String[] args)throws IOException{
        ServerSocket servidor = new ServerSocket(4000);
        Mapa.users(servidor.getLocalPort(),"");
        while(true){
            Socket s = null;
            try{
                s = servidor.accept();
                System.out.println("Se conecto un nuevo cliente..." + s);

                DataInputStream message =new DataInputStream(s.getInputStream());
                DataOutputStream server = new DataOutputStream(s.getOutputStream());

                Thread t = new Manage(s,message,server,s.getPort());
                t.start();
                Mapa.users(s.getPort(),message.readUTF());




            }catch (Exception e){
                s.close();
                e.printStackTrace();

        }

        }
    }
}
