package clase_6;

import java.util.Scanner;


public class CalculadoraDescuento {
    public static void main(String[] args){
        System.out.println("Ingrese el precio de su producto");

        Scanner datosProducto = new Scanner(System.in);
        int valorProducto = datosProducto.nextInt();

        System.out.println("Ahora ingrese el descuento a aplicar al producto");
        Scanner datosPorcentajeDescuento = new Scanner(System.in);
        int porcentajeDescuento = datosPorcentajeDescuento.nextInt();

        double precioFinal = valorProducto * (100 - porcentajeDescuento) / 100;

        System.out.println("Su producto tiene un costo de "+valorProducto+ " y su descuento es del "+porcentajeDescuento+"% y su precio final con descuento es de Q."+ precioFinal );



    }
}
    
    
