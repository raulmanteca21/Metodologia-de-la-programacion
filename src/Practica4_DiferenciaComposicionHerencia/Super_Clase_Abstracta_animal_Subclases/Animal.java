package Practica4_DiferenciaComposicionHerencia.Super_Clase_Abstracta_animal_Subclases;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
}
