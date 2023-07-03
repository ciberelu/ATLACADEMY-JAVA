package clase_12.amigoInvisible;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*Armar un programa que organice un amigo invisible Este programa debe permitir a los participantes ingresar sus nombres.
* Luego cada participante debe sentarse frente a la computadora, escribir su nombre y recibir una indicación sobre a quién
* debe darle el regalo. El programa también debe limpiar la consola después de que cada participante haya visto su indicación*/



public class AmigoInvisible {
    public static void main(String[]args){

        darBienvenida();
        
        Scanner teclado = new Scanner(System.in);
        int cantidadAmigos = teclado.nextInt();

        while (cantidadAmigos % 2 != 0){
            System.out.println("Para que todos tengan un regalo debes ingresar un numero par");
            cantidadAmigos = teclado.nextInt();
        }
        teclado.nextLine();
        
        String [] jugadores = new String[cantidadAmigos];

        crearListaJugadores(teclado, jugadores);

        List <String>elegidos = new ArrayList<>();
        List <String>prueba = new ArrayList<>();




        
        crearListaElegidos(teclado, jugadores, elegidos, prueba);

        //System.out.println(elegidos.toString());
        //System.out.println(prueba.toString());


        teclado.close();
    }





    private static void crearListaElegidos(Scanner teclado, String[] jugadores, List<String> elegidos, List<String> prueba) {
        for (int i = 0; i < jugadores.length; i++) {
            limpiarConsola();
            System.out.println("Ahora ingresa tu nombre y te dire quien es tu amigo invisible");
            String currentAmigo = teclado.nextLine();

            Random random  = new Random();
            int numeroRandom = random.nextInt(jugadores.length);


            String jugadorRandom = jugadores[numeroRandom];

            while (currentAmigo.equalsIgnoreCase(jugadorRandom) || elegidos.contains(jugadorRandom) ){
                numeroRandom = random.nextInt(jugadores.length);
                jugadorRandom =jugadores[numeroRandom];
            }

            
            elegidos.add(jugadorRandom);
            prueba.add(currentAmigo + " => " + jugadorRandom);
            System.out.println("Le daras un regalo a " + jugadorRandom);
            System.out.println("Presiona Enter para continuar...");
            teclado.nextLine();

            if (i == jugadores.length - 1){
                limpiarConsola();
            }
            
           


        }
    }


    private static void crearListaJugadores(Scanner teclado, String[] jugadores) {
        for ( int i = 0; i < jugadores.length; i++){
            System.out.println("Ingresa tu nombre");
            jugadores[i] = teclado.nextLine();

        }

        System.out.println("La lista de amigos ha sido creada, los amigos son: ");
        System.out.println(String.join(", ", jugadores));
    }

    
    
    private static void limpiarConsola() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    public static void darBienvenida(){
        System.out.println("********************************************");
        System.out.println("Bienvenidos al Juego del Amigo Invisible");
        System.out.println("********************************************");
        System.out.println("Cuantos amigos son ustedes");
    }
}
