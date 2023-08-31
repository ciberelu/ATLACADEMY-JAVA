package clase_28.Hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Escriba un programa que reciba una cadena de texto como entrada y 
 * cuentes cuantas veces aparece cada palabra en el texto.
 * 
 * Utiliza un hashmap par almacenar las palabras como clave y sus frecuencias como valores.
 */
public class Ejercicio1 {
    public static void main(String[] args){

        String texto = "Hola que tal? que estas haciendo";

        String [] palabras = texto.split(" ");

        Map<String, Integer> contadorPalabras = new HashMap<>();

        for (String palabra : palabras) {
            String palabraLimpia = StringUtil.limpiarPalabra(palabra);
            Integer contador = contadorPalabras.get(palabraLimpia);
            if (contador == null){
                contador = 0;
            }
            contador++;
            contadorPalabras.put(palabraLimpia, contador);


            


            System.out.println(contadorPalabras);
            
        }

    }
}
