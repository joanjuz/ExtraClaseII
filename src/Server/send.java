package Server;

import Principal.Controller;
import Principal.Main;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class send {
    public static int puerto;
    public static int send_A(){
        return puerto;
    }
    public static int puertoa(Socket s) throws IOException {
        DataInputStream enviar = new DataInputStream(s.getInputStream());
        DataOutputStream e = new DataOutputStream(s.getOutputStream());
        int puertoa = enviar.readInt();
        e.writeInt(puertoa);
        System.out.println(puertoa);
        enviar.close();
        e.close();
        return puertoa;
    }
}
