package clase_27.expresiones_lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Aqui hay un codigo que funciona con expresiones lambda
 * los lambda son muy parecidos a las funciones flechas de javascript
 * 
 * El codigo siguiente muestra una forma básica utilizar las funciones lambda
 * 
 */
public class Main {

    public static void main (String args []){
        System.out.println("aprendido funciones lambda en java");


        List<String> frutas = new ArrayList<>();

        frutas.add("manzana");
        frutas.add("mango");
        frutas.add("pera");
        frutas.add("papaya");

        //usando una expresion lambda 
        //este lambda solo imprime cada fruta de la lista
        frutas.stream().forEach(fruta -> System.out.println(fruta));

        //este lambda filtra las frutas que contengan una m

        frutas.stream()
            .filter(fruta -> fruta.contains("m"))
            .forEach(fruta -> System.out.println(fruta));
    }

    
}
