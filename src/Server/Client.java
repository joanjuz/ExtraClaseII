package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
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
}
