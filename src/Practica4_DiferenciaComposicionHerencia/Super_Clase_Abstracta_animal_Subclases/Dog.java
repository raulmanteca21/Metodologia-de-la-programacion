package Practica4_DiferenciaComposicionHerencia.Super_Clase_Abstracta_animal_Subclases;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }
}
