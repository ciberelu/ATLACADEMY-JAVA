package clase_13.figuras;


public abstract class Figura {
    
    //Propiedades
    private String colorFondo;

    //constructor vacio
    public Figura(){

    }

    //constructor con todos los argumentos
    public Figura(String colorFondo){
        this.colorFondo = colorFondo;
    }

    //getter
    public String getColorFondo(){
        return colorFondo;
    }

    public abstract double calcularArea(); 


}
