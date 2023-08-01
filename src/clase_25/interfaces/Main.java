package clase_25.interfaces;

import java.util.ArrayList;
import java.util.List;

import clase_25.interfaces.figuraGeometrica.Circulo;
import clase_25.interfaces.figuraGeometrica.IFiguraGeometrica;
import clase_25.interfaces.figuraGeometrica.Triangulo;

public class Main {

    public static void main(String[]args){
        List<IFiguraGeometrica> figuras = new ArrayList<IFiguraGeometrica>();

        Triangulo triangulo = new Triangulo();
        triangulo.setAlto(20);
        triangulo.setAncho(20);
        figuras.add(triangulo);

        Circulo circulo = new Circulo();
        circulo.setRadio(20);
        figuras.add(circulo);

        for (IFiguraGeometrica figura: figuras){
            System.out.println("El area es: " + figura.calcularArea());
        }


    }
}
