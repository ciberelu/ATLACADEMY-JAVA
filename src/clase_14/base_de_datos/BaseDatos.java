package clase_14.base_de_datos;

public class BaseDatos {

        public static void main (String[] args){
            System.out.println("***** BASE DE DATOS ********");

            System.out.println("********************************");
            System.out.println(" SQL = Structured Query Language");
            System.out.println("********************************");

            System.out.println(" Crear una base de datos => CREATE DATABASE Sistema_Veterinaria" );
            System.out.println("Eliminar base de datos => DROP DATABASE If exists Sistema_Veterinaria");
            System.out.println("********************************");

            //para crear una tabla o entidad con sus atributos
            //entre parentesis se coloca cada atributo que va tener la tabla, cada atributo lleva nombre tipo de dato, si 
            //puede ser nulo o no, si auto increment y al final se coloca que atributo es la primary Key, normalmente es el id.
            System.out.println(" CREATE TABLE USUARIO ( id int(11) NOT NULL AUTO_INCREMENT, nombre varchar(80) NOT NULL, apellido varchar(80) NOT NULL, fechaNacimiento datetime NULL, PRIMARY KEY (id)");
            System.out.println("********************************");
            System.out.println(" DROP TABLE  IF EXISTS ");





        }
}
