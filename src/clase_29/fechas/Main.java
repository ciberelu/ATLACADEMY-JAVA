package clase_29.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[]args){

        //fecha actual
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);

        //agregando 5 dias a la fecha actual
        fecha = fecha.plusDays(5);
        System.out.println(fecha);

        //hora actual
        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        // fecha y hora actual

        LocalDateTime fechaY_Hora = LocalDateTime.now();
        System.out.println(fechaY_Hora);

        //para darle formato a las fechas

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy ss:mm:HH");
        String fechaFormateada = formato.format(fechaY_Hora);
        System.out.println(fechaFormateada);

        
    }
    
}
