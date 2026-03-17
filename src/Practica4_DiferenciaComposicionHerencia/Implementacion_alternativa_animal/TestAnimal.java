package Practica4_DiferenciaComposicionHerencia.Implementacion_alternativa_animal;

class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat();
        cat1.greeting();//Llama a Cat.greeting() e imprime "Meow!"
        Dog dog1 = new Dog();
        dog1.greeting();//Llama a Dog.greeting() e imprime "Woof!"
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();//Llama a BigDog.greeting() e imprime "Woow!"

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();//Es un polimorfismo que ejecuta Cat.greeting() e imprime "Meow!"
        Animal animal2 = new Dog();
        animal2.greeting();//Es un polimorfismo que ejecuta Dog.greeting() e imprime "Woof!"
        Animal animal3 = new BigDog();
        animal3.greeting();//Es un polimorfismo que ejecuta BigDog.greeting() e imprime "Woow!"
        //Animal animal4 = new Animal(); Animal es abstracto no puede ser instanciado (error)

        // Downcast
        Dog dog2 = (Dog)animal2; //Correcto, animal 2 es un Dog
        BigDog bigDog2 = (BigDog)animal3;//Correcto, animal 3 es un BigDog
        Dog dog3 = (Dog)animal3;//Efectivamente BigDog es un Dog
        //Cat cat2 = (Cat)animal2; Error en la ejecucion, animal2 es un Dog, no se puede convertir en Cat
        dog2.greeting(dog3);//Imprime "Woooooooooof!" ejecuta Dog.greeting(Dog)
        dog3.greeting(dog2);//Ejecuta BigDog.greeting(Dog) e imprime "Wooooooowwwww!"
        dog2.greeting(bigDog2);//Ejecuta Dog.greeting(Dog) e imprime "Wooooooooof!"
        bigDog2.greeting(dog2);//Ejecuta BigDog.greeting(Dog) e imprime "Wooooooowwwww!"
        bigDog2.greeting(bigDog1);//Usa BigDog.greeting(dog), es el mas especifico, imprime "Wooooooowwwww!"
    }
}