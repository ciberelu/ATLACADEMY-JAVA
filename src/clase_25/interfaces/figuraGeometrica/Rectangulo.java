package clase_25.interfaces.figuraGeometrica;


public class Rectangulo implements IFiguraGeometrica {
    private double alto;
    private double ancho;



    @Override
    public double calcularArea() {
        return this.alto * this.ancho;
    }


    // => getters and setters
    public double getAlto() {
        return alto;
    }



    public void setAlto(double alto) {
        this.alto = alto;
    }



    public double getAncho() {
        return ancho;
    }



    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    
}
