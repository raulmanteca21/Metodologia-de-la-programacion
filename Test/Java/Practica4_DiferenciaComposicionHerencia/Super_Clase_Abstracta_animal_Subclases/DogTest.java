package Practica4_DiferenciaComposicionHerencia.Super_Clase_Abstracta_animal_Subclases;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Dog dog = new Dog("Firulais");
        dog.greets();

        System.setOut(originalOut);

        assertEquals("Woof" + System.lineSeparator(), output.toString());
    }

    @Test
    void testGreets() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Dog dog1 = new Dog("Firulais");
        Dog dog2 = new Dog("Paco");
        dog1.greets(dog2);

        System.setOut(originalOut);

        assertEquals("Woooof" + System.lineSeparator(), output.toString());
    }
}