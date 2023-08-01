package clase_13.figuras;

import java.util.Scanner;

public abstract class Poligono extends Figura {
    private double altura;
    private double base;

    //constructor vacio
    public Poligono(){

    }

    //constructor con todos los parametros
    public Poligono(String colorFondo, double altura, double base){
        super(colorFondo);
        this.altura = altura;
        this.base = base;
    }

    //getters 

    public double getAltura(){
        return altura;

    }

    public double getBase(){
        return base;
    }

    //setters
    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void cargarDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la altura ");
        altura = teclado.nextDouble();
        System.out.println("Ingre la base");
        base = teclado.nextDouble();
    }
    public abstract double calcularArea();
}
