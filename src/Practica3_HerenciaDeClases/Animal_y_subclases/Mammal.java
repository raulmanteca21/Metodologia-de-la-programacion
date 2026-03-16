package Practica3_HerenciaDeClases.Animal_y_subclases;

public class Mammal extends Animal{
    public Mammal(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal["+super.toString()+"]";
    }
}
