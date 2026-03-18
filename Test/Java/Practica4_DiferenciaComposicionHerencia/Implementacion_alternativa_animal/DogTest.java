package Practica4_DiferenciaComposicionHerencia.Implementacion_alternativa_animal;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greeting() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Dog dog = new Dog();
        dog.greeting();

        System.setOut(originalOut);

        assertEquals("Woof!" + System.lineSeparator(), output.toString());
    }

    @Test
    void testGreeting() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.greeting(dog2);

        System.setOut(originalOut);

        assertEquals("Woooooooooof!" + System.lineSeparator(), output.toString());
    }
}