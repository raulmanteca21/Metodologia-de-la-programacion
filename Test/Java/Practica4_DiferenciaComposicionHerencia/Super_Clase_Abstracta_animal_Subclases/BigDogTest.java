package Practica4_DiferenciaComposicionHerencia.Super_Clase_Abstracta_animal_Subclases;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greets() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        BigDog bigDog = new BigDog("Alonso");
        bigDog.greets();

        System.setOut(originalOut);

        assertEquals("Wooow" + System.lineSeparator(), output.toString());
    }

    @Test
    void testGreets() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        BigDog bigDog = new BigDog("Alonso");
        Dog dog = new Dog("Firulais");
        bigDog.greets(dog);

        System.setOut(originalOut);

        assertEquals("Woooooow" + System.lineSeparator(), output.toString());
    }

    @Test
    void testGreets1() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        BigDog bigDog1 = new BigDog("Alonso");
        BigDog bigDog2 = new BigDog("Osbaldo");
        bigDog1.greets(bigDog2);

        System.setOut(originalOut);

        assertEquals("Wooooooooow" + System.lineSeparator(), output.toString());
    }
}