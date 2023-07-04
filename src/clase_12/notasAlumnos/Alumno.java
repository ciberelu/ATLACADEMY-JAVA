package clase_12.notasAlumnos;

import java.util.List;
public class Alumno {
    private String nombre;
    private String apellido;
    

    private List<Double> notas;

    //constructor sin parametros
    public Alumno (){

    }

    //constructor con todos los parametros
    public Alumno (String nombre, String apellido, List<Double> notas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }

    //getteres y setters

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public List<Double> getNotas(){
        return notas;

    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;

    }
    
    public void setNotas(List<Double> notas){
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", notas=" + notas + "]";
    }
}
