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

            DataOutputStream enviar = new DataOutputStream(s.getOutputStream());

            DataInputStream message = new DataInputStream(s.getInputStream());
            DataOutputStream server = new DataOutputStream(s.getOutputStream());

            try{
                int a = 0;
                while(a == 0){
                    int f = scn.nextInt();
                    a = f;
                    enviar.writeInt(a);
                }
            }catch (Exception e){
                e.printStackTrace();
            }

            System.out.println("Datos procesados");

            while(true){
                String tosend =scn.nextLine();
                server.writeUTF(tosend);

                if(tosend.equals("")){
                    continue;               }
                String received = message.readUTF();
                System.out.println(received);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
