package Mensajes;

import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapa {
    public static void users(int Port, String Message) {
        Map<String, java.util.List<String>> user = new HashMap<>();
        String puerto = Port + "";
        java.util.List<String> messages = new ArrayList<String>();

        if (user.containsKey(puerto)){
            messages.add(Message);
            user.put(puerto,messages);
        }else{
            messages.add(Message);
            user.put(puerto,messages);
        }

    }

}
