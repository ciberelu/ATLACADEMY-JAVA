package clase_13.figuras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Figura> figurasCreadas = new ArrayList<Figura>();
    public static void main(String[]args){

        boolean mostrarMenu = true;
        Scanner teclado = new Scanner(System.in);

        while(mostrarMenu){
            

            System.out.println("******* MENU ********");
            System.out.println("1) crear una figura");
            System.out.println("2) Ver sumatoria total de areas");
            System.out.println("0) Exit");

            
            double electionMenu = teclado.nextDouble();
            

            if (electionMenu == 1) {
                System.out.println("Crear figura");
                crearFigura();
                

            }

            else if (electionMenu == 2) {
                double sumatoriaTotalAreas = 0;
                for (Figura figura : figurasCreadas){
                    sumatoriaTotalAreas += figura.calcularArea();
                }
                System.out.println("Sumatoria total de areas: " + sumatoriaTotalAreas);

            }

            else if (electionMenu == 0) {
                mostrarMenu = false;
            }

        }
    }

    private static void crearFigura() {
        System.out.println("que figura desea crear?");
        System.out.println("1) Circulo");
        System.out.println("2) rectangulo");
        System.out.println("3) triangulo");

        Scanner teclado = new Scanner(System.in);
        int opcionUsuario = teclado.nextInt();

        if (opcionUsuario == 1){
            Circulo circulo = new Circulo();
            circulo.cargarDatos();
            figurasCreadas.add(circulo);
            System.out.println("El area de su circulo es de " + circulo.calcularArea());

        }

        if (opcionUsuario == 2) {
            Rectangulo rectangulo = new Rectangulo();
            rectangulo.cargarDatos();
            System.out.println("El area de su rectangulo es de " + rectangulo.calcularArea());
            figurasCreadas.add(rectangulo);
        }

        if (opcionUsuario == 3){
            Triangulo triangulo = new Triangulo();
            triangulo.cargarDatos();
            figurasCreadas.add(triangulo);
            System.out.println("El area de su triangulo es de " + triangulo.calcularArea());
        }

    }

    
}
