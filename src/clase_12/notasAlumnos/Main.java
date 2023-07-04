package clase_12.notasAlumnos;

import java.util.ArrayList;
import java.util.List;

/*
     * Crear un programa para ingresar las notas de alumnos utilizando programación orientada a
        objetos: El programa debe permitir al usuario cargar las notas de varios alumnos. Cada alumno
        debe tener atributos como nombre, apellido y una lista de notas.

     */
public class Main {
    public static void main(String[]args){
        System.out.println("----------------------------------------------");
        System.out.println("--------- NOTAS DE ALUMNOS--------------------------");
        System.out.println("-------------------------------------------------------");

        //pasar las notas
        List<Double> notasEluizer = new ArrayList<>();
        notasEluizer.add(8.5);
        notasEluizer.add(5.6);
        notasEluizer.add(8.90);

        Alumno eluizer = new Alumno("Eluizer", "de Leon", notasEluizer);
        
        System.out.println(eluizer.toString());
       
    }
}
