package Server;

import java.io.DataOutputStream;
import java.util.Scanner;

public class send {
    public static int send_A(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite el puerto a enviar");
        int puerto =scn.nextInt();
        return puerto;
    }
}
