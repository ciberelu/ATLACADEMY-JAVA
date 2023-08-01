package clase_25.interfaces.figuraGeometrica;

public class Circulo implements IFiguraGeometrica {

    private double radio;

    @Override
    public double calcularArea() {
        return Math.PI * (radio * radio);
    }

    // => getters and setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
