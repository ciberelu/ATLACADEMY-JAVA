package clase_12.interesCompuesto;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraInteresCompuesto {
    
    public static void main(String[]args){
        System.out.println("**************************************");
        System.out.println("-----------CALCULADORA DE INTERES COMPUESTO-----------");
        System.out.println("**************************************");

        Scanner teclado = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.##");
        System.out.println("-----Ingrese la cantidad inicial-------");
        double cantidadInicial = teclado.nextDouble();
        System.out.println("-------Ingrese la tasa de interes---------------");
        double tasaInteres = (teclado.nextDouble())/100;
        System.out.println("----------Ingrese el tiempo en años-------------");
        int anios = teclado.nextInt();

        double montoAcumulado = calcularMonto(cantidadInicial, tasaInteres, anios);

        System.out.println("El monto total acumulado es de: " + decimal.format(montoAcumulado));

        teclado.close();
        
    }


    public static double calcularMonto(double cantidad, double tasaInteres, int anios){
        
        return cantidad * Math.pow(1 + tasaInteres, anios);


    }
}
