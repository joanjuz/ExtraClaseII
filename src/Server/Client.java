package Server;

import Mensajes.Send_Message;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread {
    final Socket s;
    public static String tosend;
    public static DataOutputStream enviar;
    public static DataInputStream message;
    public static DataOutputStream server;


    public Client(Socket s){
        this.s = s;

    }
    @Override
    public void run() {
        try{
            Scanner scn = new Scanner(System.in);

            //InetAddress ip = InetAddress.getByName("localhost");

            //Socket s = new Socket(ip,4000);

            System.out.println("puerto: " +s.getLocalPort());

            message = new DataInputStream(s.getInputStream());
            server = new DataOutputStream(s.getOutputStream());

            System.out.println("Datos procesados");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void set_otherport(int port) throws IOException {
        server.writeUTF(port+"");
        String received = message.readUTF();
        System.out.println(received);
    }
    public static void set_message(String tosend) throws IOException {
        server.writeUTF(tosend);
        String received = message.readUTF();
        System.out.println(received);
    }
}
    /*
    public static void main(String[] args) throws IOException {
        try{
            Scanner scn = new Scanner(System.in);

            InetAddress ip = InetAddress.getByName("localhost");

            Socket s = new Socket(ip,4000);

            System.out.println("puerto: " +s.getLocalPort());

            DataOutputStream enviar = new DataOutputStream(s.getOutputStream());

            DataInputStream message = new DataInputStream(s.getInputStream());
            DataOutputStream server = new DataOutputStream(s.getOutputStream());

            int sport = send.send_A();
            enviar.writeInt(sport);

            System.out.println("Datos procesados");

            while(true){
                try {
                    String tosend = scn.nextLine();
                    server.writeUTF(tosend);

                    if (tosend.equals("")) {
                        continue;
                    }
                    String received = message.readUTF();
                    System.out.println(received);
                }catch (Exception e){
                    s.close();
                    e.printStackTrace();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
*/

