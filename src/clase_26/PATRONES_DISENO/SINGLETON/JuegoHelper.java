package clase_26.PATRONES_DISENO.SINGLETON;

public class JuegoHelper {

    public  final int DIFICULTAD_ALTA = 10;
    public  final int DIFICULTAD_MEDIA = 5;
    public  final int DIFICULTAD_BAJA = 3;

    private  int puntuacion1;
    private  int puntuacion2;
    private  int dificultad;
    
    //se instancia un objeto del mismo tipo de la clase
    private static JuegoHelper instance = new JuegoHelper();

    //metodo para obtener la instancia creada en la linea de arriba
    public static JuegoHelper getInstance(){
        return instance;
    }

    //constructor para que este objeto no pueda ser instanciado desde afuera.
    private  JuegoHelper(){

    };

    public  int getPuntuacion1() {
        return puntuacion1;
    }

    public  void setPuntuacion1(int puntuacion1) {
        this.puntuacion1 = puntuacion1;
    }

    public  int getPuntuacion2() {
        return puntuacion2;
    }

    public  void setPuntuacion2(int puntuacion2) {
        this.puntuacion2 = puntuacion2;
    }

    public  int getDificultad() {
        return dificultad;
    }

    public  void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public  void mostrarReglas(){
        System.out.println("Estas son las reglas del juego");
    }

    

    
}
