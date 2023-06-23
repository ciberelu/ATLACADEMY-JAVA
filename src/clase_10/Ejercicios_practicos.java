package clase_10;
import java.util.Scanner;
 //Ejercicio 1:
    /*  Crea un programa que tenga un arreglo con nombres completos de personas. 
        Además, debe permitir realizar una búsqueda por el nombre de la persona” 
    */
 //Ejercicio 2: Se hizo en spring boot, buscar la carpeta de nombre "EJERCICIO-AUTOCOMPLETAR-BUSQUEDA"
public class Ejercicios_practicos {

    public static void main(String[]args){
        System.out.println("Haciendo ejercicios con java");

        //Resolucion ejercicio 1:

            //solicita nombre al usuario
            Scanner teclado = new Scanner(System.in);
            System.out.println("por favor, ingrese un nombre para buscar en la base de datos");

            String busqueda = teclado.nextLine();

            //array a comparar con la busqueda
            String [] nombres = {"Eluizer de Leon", "Julia Gomez", "Berta Lopez"};

            for (String nombre : nombres) {
                if (nombre.toLowerCase().contains(busqueda)){
                    System.out.println("El nombre que estas buscando es: " + nombre);
                }
                
            }












    }

}
