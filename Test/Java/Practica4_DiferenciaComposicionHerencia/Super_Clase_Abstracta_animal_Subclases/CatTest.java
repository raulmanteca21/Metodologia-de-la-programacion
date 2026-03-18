package Practica4_DiferenciaComposicionHerencia.Super_Clase_Abstracta_animal_Subclases;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Cat cat = new Cat("Michi");
        cat.greets();

        System.setOut(originalOut);

        assertEquals("Meow" + System.lineSeparator(), output.toString());
    }
}