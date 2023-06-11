package clase_6;

import java.util.Scanner;

public class CalcularEdadPerros {
    public static void main (String[] args){
        System.out.println("calculando la edad de un perro");
        System.out.println("Por favor ingrese la edad de su perro");

        Scanner datosIngresados = new Scanner(System.in);
        
        int edadPerroEnAniosPerro = datosIngresados.nextInt() * 7;

        System.out.println("La edad de su perro en años perros es de " + edadPerroEnAniosPerro + " años");


        
    }
}
