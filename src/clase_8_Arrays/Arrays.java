package clase_8_Arrays;

//Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        

        int [] numeros = new int[5];

        int contador = 0;

        while (contador < numeros.length){
            System.out.println("Ingrese un numero");
            int numero = teclado.nextInt();
            numeros[contador] = numero;

            contador++;
        }

        contador = 0;
        while (contador < numeros.length){
            System.out.println("El numero es " + numeros[contador]);
            contador++;
        }


    }
}
