package Practica4_DiferenciaComposicionHerencia.Implementacion_alternativa_animal;

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

        assertTrue(result.contains("Meow!"));
        assertTrue(result.contains("Woof!"));
        assertTrue(result.contains("Woow!"));
        assertTrue(result.contains("Woooooooooof!"));
        assertTrue(result.contains("Woooooowwwww!"));
    }
}