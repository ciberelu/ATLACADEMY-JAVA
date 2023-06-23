package clase_11_POO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class TestPersona {
    public static void main(String[]args){
        System.out.println("Estoy probando la clase persona");
        Persona luis = new Persona();
        luis.setNombre("Luis");
        luis.setEdad(30);
        luis.setFechaNacimiento(LocalDate.parse("1992-03-18"));

        luis.mostrar();
        System.out.println("Soy mayor de edad? " + luis.esMayorEdad());
    }
}
