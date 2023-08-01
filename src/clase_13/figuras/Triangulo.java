package clase_13.figuras;


public class Triangulo extends Poligono{
    


    //constructor vacio

    public Triangulo(){

    }

    //constructor con todos sus parametros

    public Triangulo(String colorFondo, double altura, double base){
        super(colorFondo, altura, base);
        
    }


    //metodo para calcular el area
    public double calcularArea(){
        
        double area = (this.getAltura() * this.getBase())/2;
        return area;
    }

}
