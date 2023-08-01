package clase_13.videojuego;

public class Main {
    
    public static void main (String[]args){

        Personaje personaje1 = new Personaje();
        personaje1.recibirDanio(102);

        Item casco = new Item();
        casco.setDefensa(5);

        Item chaleco = new Item();
        chaleco.setDefensa(30);

        Item botas = new Item();
        botas.setDefensa(2);

        Item espada = new Item();
        espada.setAtaque(60);


        //asi agrego los items al arraylist del personae
        personaje1.getItems().add(casco);
        personaje1.getItems().add(chaleco);
        personaje1.getItems().add(botas);
        personaje1.getItems().add(espada);

        Personaje personaje2 = new Personaje();
        personaje2.getItems().add(chaleco);

        int ataque = personaje1.getAtaqueTotal();
        int puntosDanio = ataque - personaje2.getDefensaTotal() ;
        personaje2.recibirDanio(puntosDanio);

        System.out.println(personaje2.getHp());









    }
    
}
