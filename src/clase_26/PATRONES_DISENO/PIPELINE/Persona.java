package clase_26.PATRONES_DISENO.PIPELINE;

/**
 * Con el patron de diseño pipeline(paiplain) lo que se busca es que se puedan concatenar funciones
 * para esto en los metodos se hace el procedimiento que se tenga que hacer
 * y se devuelve el mismo objeto con return this;
 * 
 * Aqui en esta clase se modifico los setter a manera de ejemplo para que setee la propiedad
 * y luego retorn el mismo objeto, para ver la funcionalidad dirijase a la clase Main
 * y vera como se implementa el codigo.
 */
public class Persona {
    private String nombre;
    private float salario;
    private int edad;


    public String getNombre() {
        return nombre;
    }
    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public float getSalario() {
        return salario;
    }
    public Persona setSalario(float salario) {
        this.salario = salario;
        return this;
    }
    public int getEdad() {
        return edad;
    }
    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    

    
}
