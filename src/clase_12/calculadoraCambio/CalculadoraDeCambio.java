package clase_12.calculadoraCambio;

import java.util.Scanner;
import java.text.DecimalFormat;


/*
    Crear un programa que funcione como una calculadora de cambio: Este programa debe recibir
    como entrada una cantidad de dinero y el costo de un producto. Utilizando la resta, el programa
    debe calcular el cambio que se debe entregar al cliente y mostrar la cantidad de billetes y
    monedas necesarios para el cambio.
  
 */
public class CalculadoraDeCambio {
    public static void main (String[]args){

        System.out.println("ESTO ES UNA CALCULADORA DE CAMBIO");
        System.out.println("Ingrese la cantidad de dinero que le esta entregando el cliente");

        Scanner teclado = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");


        Double cantidad = getCantidadDecimal(teclado, decimalFormat);

        System.out.println("Ahora ingrese el costo del producto");
        double costo = getCostoDecimal(teclado, decimalFormat);

        double cambio =  getCambio(cantidad, costo);

        int cantidadBilletes = (int) cambio;
        String cantidadMonedasDecimal = decimalFormat.format((cambio - cantidadBilletes));
        double cantidadMonedas = Double.parseDouble(cantidadMonedasDecimal);

        System.out.println("cantidadBilletes: " + cantidadBilletes + " cantidadMonedas: " + cantidadMonedas);
    
    }







    private static double getCambio(double cantidad, double costo){

        double cambio = cantidad - costo;
        if (cantidad < costo){
            
            System.out.println("Lo que le dieron es menor al costo");
            System.out.println("Hace falta: " + cambio );
            return 0.00;
        }

        
        return cambio;
    }

   private static double getCostoDecimal(Scanner teclado, DecimalFormat decimalFormat) {
        double costo = teclado.nextDouble();
        String costoDecimal = decimalFormat.format(costo);
        costo = Double.parseDouble(costoDecimal);
        return costo;
    }

    private static Double getCantidadDecimal(Scanner teclado, DecimalFormat decimalFormat) {
        Double cantidad = teclado.nextDouble();
        String  cantidadDecimal =  decimalFormat.format(cantidad); 
        cantidad =  Double.parseDouble(cantidadDecimal);
        return cantidad;
    }






}
