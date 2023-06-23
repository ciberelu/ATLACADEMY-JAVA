package clase_11_POO;

public class Cuenta {
    private String titular;
    private double cantidad;

    //constructor vacio
    public Cuenta (){

    }

    //getters and setters
    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getCantidad(){
        return this.cantidad;
    }

    

    public void mostrar(){
        System.out.println("soy la cuenta de: " + this.titular +" y tengo " + this.cantidad);
    }

    public void ingresar(double cantidad){
        if (cantidad > 0){
            this.cantidad += cantidad;
        }
        
    }

    public void retirar(double cantidad){
        if (cantidad > 0){
            this.cantidad -= cantidad;
        }
    }


}
