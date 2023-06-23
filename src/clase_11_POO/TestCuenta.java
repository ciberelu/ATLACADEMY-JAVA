package clase_11_POO;

public class TestCuenta {
    public static void main(String[]args){
        System.out.println("Estoy probando la clase cuenta");
        Cuenta cuenta1 = new Cuenta();

        cuenta1.setTitular("Eluizer");
        cuenta1.ingresar(100);
        cuenta1.ingresar(100);
        cuenta1.retirar(300);


        System.out.println("Tengo esta cantidad " + cuenta1.getCantidad());




    }
}
