package Practica4_DiferenciaComposicionHerencia.Implementacion_alternativa_animal;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greeting() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        BigDog bigDog = new BigDog();
        bigDog.greeting();

        System.setOut(originalOut);

        assertEquals("Woow!" + System.lineSeparator(), output.toString());
    }

    @Test
    void testGreeting() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        BigDog bigDog = new BigDog();
        Dog dog = new Dog();
        bigDog.greeting(dog);

        System.setOut(originalOut);

        assertEquals("Woooooowwwww!" + System.lineSeparator(), output.toString());
    }
}