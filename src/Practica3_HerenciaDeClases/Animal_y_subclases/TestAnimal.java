package Practica3_HerenciaDeClases.Animal_y_subclases;

public class TestAnimal {
    public static void main(String[] args) {

        // Test Animal
        Animal a1 = new Animal("Walter");
        System.out.println(a1);

        // Test Mammal
        Mammal m1 = new Mammal("Osbaldo");
        System.out.println(m1);

        // Test Cat
        Cat c1 = new Cat("Garfield");
        System.out.println(c1);
        c1.greets();

        // Test Dog
        Dog d1 = new Dog("Firulais");
        System.out.println(d1);
        d1.greets();

        // Test greets(Dog)
        Dog d2 = new Dog("Nevado");
        d1.greets(d2);

        // Más pruebas
        Cat c2 = new Cat("CR7");
        System.out.println(c2);
        c2.greets();


    }
}