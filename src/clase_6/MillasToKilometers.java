package clase_6;

import java.util.Scanner;

public class MillasToKilometers {
    public static void main(String[] args){
        System.out.println("Este es un convertidor de millas a kilometros");
        System.out.println("Por favor, ingrese una distancia en millas");

        Scanner datosIngresados = new Scanner(System.in);
        int millas = datosIngresados.nextInt();

        double kilometrosFromMillas = millas * 1.60934;

        System.out.println(millas + " millas en kilometros son " + kilometrosFromMillas + " kilometros");




    }
}