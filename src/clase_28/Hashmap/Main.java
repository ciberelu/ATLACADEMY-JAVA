package clase_28.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args){

        /**
         * primer ejemplo basico de hashmap
         *
         */

         Map <String, String> diccionario = new HashMap<>();
         
         diccionario.put("SMS", "mensaje de texto");
         diccionario.put("LOL", "Reirse");
         diccionario.put("AFK", "No esta en la computadora");
         diccionario.put("OMG", "Oh my god");
         diccionario.put("ASAP", "As soon as posible");
    
        System.out.println("*********obtener un valor del hashmap*************");
        System.out.println(diccionario.get("LOL"));

        System.out.println("*********obtener las claves del hashmap*************");
        System.out.println(diccionario.keySet());

        System.out.println("*********obtener los valores del hashmap*************");
        System.out.println(diccionario.values());


        }

}

