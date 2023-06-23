package clase_11_POO;

import java.time.LocalDate;

public class Persona {
    private String id;
    private String nombre;
    private int edad;
    private LocalDate nacimiento;
    private String dni;

    //constructor donde los datos pueden estar vacios.
    public Persona(){

    }

    // Getters and setters
    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento(){
        return this.nacimiento;
    }

    public void setFechaNacimiento(LocalDate nacimiento){
        this.nacimiento = nacimiento;
    }

    public String getDni(){
        return this.dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public void mostrar(){
        System.out.println("Soy " + this.nombre + " tengo " + this.edad + " de edad y mi fecha de nacimiento es " + this.nacimiento);
    }

    public boolean esMayorEdad(){
        if (this.edad >= 18) return true;

        return false;
    }
}

