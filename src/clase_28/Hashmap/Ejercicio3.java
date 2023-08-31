package clase_28.Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * TRADUCTOR SIMPLE
 * 
 * crea una aplicacion de traduccion simple que tome palabras en un idioma 
 * y las traduzca a otro. Utiliza un HashMap para almacenar pares de palabras 
 * clave valor que representen las traducciones. 
 */

public class Ejercicio3 {


    public static void main(String[]args){
    Map<String, String> traducciones = new HashMap<>();

    traducciones.put("spaguetti", "espaguete");
    traducciones.put("auto", "carro");
    traducciones.put("telefono", "telefone");
    traducciones.put("auto", "carro");
    traducciones.put("casa", "casa");
    traducciones.put("gatto", "gato");
    traducciones.put("sole", "sol");
    traducciones.put("albero", "árvore");
    traducciones.put("mare", "mar");
    traducciones.put("bicchiere", "copo");
    traducciones.put("amore", "amor");
    traducciones.put("lingua", "língua");
    traducciones.put("tempo", "tempo");
    traducciones.put("vento", "vento");
    
    System.out.println("Escribe una palabra en italiano y la traducire a portuguese");
    Scanner teclado = new Scanner(System.in);
    String palabraEnItaliano = teclado.nextLine();
    String palabraEnPortuguese = traducciones.get(palabraEnItaliano);
    String resultado = String.format("La palabra %S en portuguese se dice %S", palabraEnItaliano, palabraEnPortuguese);
    System.out.println(resultado);

    teclado.close();

    }
    
}
