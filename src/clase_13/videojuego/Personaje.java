package clase_13.videojuego;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private int experiencia;
    private int level;
    private int hp; //vida
    private int mana; //magia

    //propiedad que maneja el listado de cosas
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }



    public void setItems(List<Item> items) {
        this.items = items;
    }



    //constructor vacio para asegurar que cuando se cree el personaje se cree con 100 de vida y 100 de magia
    //y lleve sus items osea sus cosas
    public Personaje(){
        hp = 100;
        mana = 100;
        items = new ArrayList<>();
    }

    

    //getters and setters
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }

    //metodo para recibir daño

    public void recibirDanio(int puntoDanio){

        hp -= puntoDanio;
        
        //condicion para que la se controle que la vida no sea negativa
        hp = hp < 0 ? 0 : hp;
        
    }

    //metodo para darle experiencia al personaje

    public void agregarExperiencia(int puntoExperiencia){
        experiencia += puntoExperiencia;
    }

    //metodo que evalua si el personaje esta vivo

    public boolean isAlive (){
        return (hp <= 0) ? false : true;
    }

    //metodo para saber la defensa total que tiene el personaje dependiendo de los items que tenga

    public int getDefensaTotal(){
        int defensaTotal = 0;
        for (Item item : items){
            defensaTotal += item.getDefensa();
        }
        return defensaTotal;
    }

    //metodo para saber el ataque total que tiene el personaje dependiendo de los items que tenga

    public int getAtaqueTotal(){
        int ataqueTotal = 0;
        for (Item item : items){
            ataqueTotal += item.getAtaque();
        }
        return ataqueTotal;
    }

}
