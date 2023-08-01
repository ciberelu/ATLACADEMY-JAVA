package clase_13.figuras;


public class Rectangulo extends Poligono {

    //constructor vacio
    public Rectangulo() {

    }

    //constructor con todos los argumentos
    public Rectangulo(String colorFondo, double altura, double base){
        super(colorFondo, altura, base);
    }
    
    public double calcularArea(){
        
        double area = getAltura() * getBase();
        return area;
    }


}
