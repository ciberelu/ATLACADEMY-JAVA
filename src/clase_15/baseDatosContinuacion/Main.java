package clase_15.baseDatosContinuacion;

public class Main {
    public static void main (String []args){
        System.out.println("*****CONTINUACION DE BASE DE DATOS *******");
        System.out.println(" Modificar estructura de tablas");

        System.out.println("****************");

        System.out.println("Añadir columna");
        System.out.println("**ALTER TABLE USUARIOS ADD COLUMN  telefono varchar(40) NULL");

        System.out.println("****************");
        System.out.println("Eliminar Columna");
        System.out.println("ALTER TABLE USUARIO DROP telefono");

        System.out.println("****************");
        System.out.println("Modificar columna existente");
        System.out.println("ALTER TABLE USUARIOS ALTER COLUMN telefono varchar(30) NULL");


    }
}
