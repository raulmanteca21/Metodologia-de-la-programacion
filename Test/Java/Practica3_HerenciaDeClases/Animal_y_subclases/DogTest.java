package Practica3_HerenciaDeClases.Animal_y_subclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class DogTest {

    @Test
    void testToString() {
        Dog d = new Dog("Firulais");
        assertEquals("Dog[Mammal[Animal[name=Firulais]]]", d.toString());
    }

    @Test
    void testGreets() {
        Dog d = new Dog("Firulais");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        d.greets();

        assertEquals("Woof", output.toString().trim());
    }

    @Test
    void testGreetsAnotherDog() {
        Dog d1 = new Dog("Firulais");
        Dog d2 = new Dog("Nevado");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        d1.greets(d2);

        assertEquals("woooof", output.toString().trim());
    }
}