package Practica4_DiferenciaComposicionHerencia.Super_Clase_Abstracta_animal_Subclases;

public class TestAnimal {
    public static void main(String[] args) {

        Cat c1 = new Cat("Michi");
        c1.greets();

        Dog d1 = new Dog("Firulais");
        Dog d2 = new Dog("Paco");
        d1.greets();
        d1.greets(d2);

        BigDog b1 = new BigDog("Alonso");
        BigDog b2 = new BigDog("Osbaldo");
        b1.greets();
        b1.greets(d1);
        b1.greets(b2);

        Animal a1 = new Cat("Manteca");
        a1.greets();

        Animal a2 = new Dog("Bobi");
        a2.greets();

        Animal a3 = new BigDog("Izan");
        a3.greets();
    }
}