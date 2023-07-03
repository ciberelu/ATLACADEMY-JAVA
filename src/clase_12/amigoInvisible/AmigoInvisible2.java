package clase_12.amigoInvisible;

import java.util.*;
import java.util.*;

public class AmigoInvisible2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("********************************************");
        System.out.println("Bienvenidos al Juego del Amigo Invisible");
        System.out.println("********************************************");

        System.out.println("Cuantos amigos son ustedes");
        int cantidadAmigos = teclado.nextInt();
        teclado.nextLine();

        String[] jugadores = new String[cantidadAmigos];
        List<String> elegidos = new ArrayList<>();

        for (int i = 0; i < cantidadAmigos; i++) {
            System.out.println("Ingresa el nombre del participante " + (i + 1) + ":");
            jugadores[i] = teclado.nextLine();
        }

        for (int i = 0; i < cantidadAmigos; i++) {
            limpiarConsola();
            System.out.println("Jugador: " + jugadores[i]);

            String amigoInvisible = obtenerAmigoInvisible(jugadores[i], jugadores, elegidos);
            elegidos.add(amigoInvisible);

            System.out.println("Tu amigo invisible es: " + amigoInvisible);
            
            System.out.println("Presiona Enter para continuar...");
            teclado.nextLine();
        }
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

    private static String obtenerAmigoInvisible(String jugador, String[] jugadores, List<String> elegidos) {
        Random random = new Random();
        List<String> posiblesAmigos = new ArrayList<>(Arrays.asList(jugadores));

        posiblesAmigos.remove(jugador);
        posiblesAmigos.removeAll(elegidos);

        if (!posiblesAmigos.isEmpty()) {
            int indice = random.nextInt(posiblesAmigos.size());
            return posiblesAmigos.get(indice);
        }

        return ""; // Si no hay posibles amigos, se devuelve una cadena vacía
    }
}
