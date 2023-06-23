package clase_7;

import java.util.Scanner;
public class BuscadorPaises {
    public static void main(String[]args){
        System.out.println("Vamos a buscar un pais");
        System.out.println("Ingresa el nombre del pais que quieres buscar");

        Scanner paisIngresado = new Scanner(System.in);
        String pais = paisIngresado.nextLine();

        System.out.println("Por favor, dele click al siguiente enlace");
        System.out.println("https://www.google.com/maps/search/"+pais);
    }
}
