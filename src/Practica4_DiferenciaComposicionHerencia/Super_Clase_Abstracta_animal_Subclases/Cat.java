package Practica4_DiferenciaComposicionHerencia.Super_Clase_Abstracta_animal_Subclases;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}