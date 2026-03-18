package Practica4_DiferenciaComposicionHerencia.Super_Clase_Abstracta_animal_Subclases;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void greets() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Animal a1 = new Cat("Michi");
        Animal a2 = new Dog("Firulais");
        Animal a3 = new BigDog("Alonso");

        a1.greets();
        a2.greets();
        a3.greets();

        System.setOut(originalOut);

        String result = output.toString();

        assertTrue(result.contains("Meow"));
        assertTrue(result.contains("Woof"));
        assertTrue(result.contains("Wooow"));
    }
}