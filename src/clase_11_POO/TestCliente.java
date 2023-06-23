package clase_11_POO;

import java.util.Scanner;

public class TestCliente {
    public static void main(String[] args){
        Cliente eluizer = cargarCliente();
        
        System.out.println(eluizer.toString());
    }

    public static Cliente cargarCliente(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Le vamos a pedir los datos para la creacion de  un cliente");

        Cliente cliente = new Cliente();
        System.out.println("Ingrese el nombre");
        cliente.nombre = teclado.nextLine();
        System.out.println("Ingrese el apellido");
        cliente.apellido = teclado.nextLine();
        System.out.println("Ingrese la edad");
        cliente.edad = teclado.nextInt();

        
        return cliente;
    }
}
