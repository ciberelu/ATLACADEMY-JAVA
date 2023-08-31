package clase_30.Excepciones;

public class Main {
    public static void main(String[]args){
        Usuario usuario = null;

        registrar(usuario);
    }

    
    static void registrar(Usuario usuario){
        IllegalArgumentException e = new IllegalArgumentException("ingresa el dato");
        if (usuario == null){
            throw e;
        }

        System.out.println("se ha registrado correctamente");
    }
}



class Usuario {
    private String nombre;

}


