package clase_8_Arrays;

import java.util.Scanner;

public class MayorY_Menor {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int [] numeros = new int[5];
        int numero;

        int contador = 0;
        while (contador < numeros.length) {
            System.out.println("Por favor, ingrese un numero");
            numero = teclado.nextInt();
            numeros[contador] = numero;
            contador++;
        }

        contador = 0;
        int numeroMayor = 0;
        int numeroMenor = 0;

        while (contador < numeros.length){
            int numeroActual = numeros[contador];

            //si el numero actual segun la iteracion del array es mayor a numeroMayor entonces a numeroMayor le asignamos el valor de numero actual
            //o si contador es igual a cero entonces quiere decir que es la primera vez y le pasamos a numero menor el valor de numero actual
            if (numeroActual >= numeroMayor || contador == 0){
                numeroMayor = numeroActual;
            }

            if (numeroActual <= numeroMenor || contador == 0) {
                numeroMenor = numeroActual;
            }

            contador++;
        }

        System.out.println("Numero Mayor es: " + numeroMayor);
        System.out.println("Numero Menor es: " + numeroMenor);

        
    }
}
