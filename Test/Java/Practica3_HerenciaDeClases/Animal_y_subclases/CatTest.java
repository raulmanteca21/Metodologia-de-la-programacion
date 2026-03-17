package Practica3_HerenciaDeClases.Animal_y_subclases;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void testToString() {
        Cat c = new Cat("Garfield");
        assertEquals("Cat[Mammal[Animal[name=Garfield]]]", c.toString());
    }

    @Test
    void testGreets() {
        Cat c = new Cat("Garfield");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        c.greets();

        assertEquals("Meow", output.toString().trim());
    }
}