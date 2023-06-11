package clase_6;

import java.util.Scanner;
public class AdivinaElNumero {
    public static void main(String[] args) {
        System.out.println("Te atreves a adivinar el numero que esta pensando la computadora");
        System.out.println("Ingrese un numero entre 1 y 10, good luck");

        Scanner numeroUsuario = new Scanner(System.in);
        int numeroToMatch = numeroUsuario.nextInt();

        int numeroMaquina = (int) (Math.random()* 10);
        System.out.println("numeroMaquina: " + numeroMaquina);

        if (numeroMaquina == numeroToMatch) {
            System.out.println("Adivinaste");
        }else{
            System.out.println("No adivinaste");
        }
            
            


    }
}
