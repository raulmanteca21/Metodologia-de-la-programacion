package Practica4_DiferenciaComposicionHerencia.Implementacion_alternativa_animal;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greeting() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Cat cat = new Cat();
        cat.greeting();

        System.setOut(originalOut);

        assertEquals("Meow!" + System.lineSeparator(), output.toString());
    }
}