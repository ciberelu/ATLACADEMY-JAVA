package clase_26.PATRONES_DISENO.PIPELINE;
/**
 * Aqui en este codigo puede ver como los metodos de la clase persona se pueden concatenar
 * esto gracias al patron de diseño pipeline.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Aprendiendo las bases del patron de diseño pipeline");
        System.out.println("***************************************************");


        Persona persona = new Persona();

        persona.setNombre("Eluzer").setEdad(31).setSalario(4000);

        System.out.println("El nombre de la persona es " + persona.getNombre() + "y su edad es " + persona.getEdad());
        System.out.println("***************************************************");






    }
}
