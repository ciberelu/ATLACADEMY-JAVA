package clase_13.figuras;

import java.util.Scanner;

public class Circulo extends Figura {

    //propiedades de la clase
    
    private double radio;

    //constructor vacio;
    public Circulo(){

    }

    //constructor con todos sus argumentos
    public Circulo(String colorFondo, double radio){
        super(colorFondo);
        this.radio = radio;
    }

    //getters and setters
    
    public double getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double calcularArea(){
        double pi = Math.PI;

        double area = pi * (Math.pow(radio, 2));


        return area;
    }

    public void cargarDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingre el tamaño del radio de su circulo en cm");
        radio = teclado.nextDouble();
    }

}
