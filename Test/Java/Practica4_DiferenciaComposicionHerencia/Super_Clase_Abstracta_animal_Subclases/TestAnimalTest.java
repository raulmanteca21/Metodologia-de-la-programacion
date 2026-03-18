package Practica4_DiferenciaComposicionHerencia.Super_Clase_Abstracta_animal_Subclases;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TestAnimalTest {

    @Test
    void main() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        TestAnimal.main(new String[]{});

        System.setOut(originalOut);

        String result = output.toString();

        assertTrue(result.contains("Meow"));
        assertTrue(result.contains("Woof"));
        assertTrue(result.contains("Woooof"));
        assertTrue(result.contains("Wooow"));
        assertTrue(result.contains("Woooooow"));
        assertTrue(result.contains("Wooooooooow"));
    }
}