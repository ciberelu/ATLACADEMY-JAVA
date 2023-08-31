package clase_28.Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Crea una app para convertir una lista de temperaturas en farenheit a celsious.
 */
public class Ejercicio1 {

    public static void main(String[]args){
        List<Float> temperaturas =  new ArrayList<>();
        temperaturas.add(72.0f);
        temperaturas.add(68.0f);
        temperaturas.add(82.0f);
        temperaturas.add(90.0f);
        temperaturas.add(63.0f);
        temperaturas.add(75.0f);
        temperaturas.add(79.0f);
        temperaturas.add(88.0f);
        temperaturas.add(55.0f);
        temperaturas.add(70.0f);

        List<Float> temperaturasEnCelsious = temperaturas.stream()
        .map(temperatura -> {
            Float temperaturaEnCelsious = (temperatura - 32 ) * 5/9;
            return temperaturaEnCelsious;
        })
        .toList();
        
        temperaturasEnCelsious.forEach(temperatura -> {
            System.out.println(temperatura);
        });
    }
    
}
