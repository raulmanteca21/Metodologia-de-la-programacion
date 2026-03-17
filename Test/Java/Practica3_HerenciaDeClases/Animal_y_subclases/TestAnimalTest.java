package Practica3_HerenciaDeClases.Animal_y_subclases;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TestAnimalTest {

    @Test
    void testMainOutput() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        TestAnimal.main(new String[]{});

        String expected =
                "Animal[name=Walter]\n" +
                        "Mammal[Animal[name=Osbaldo]]\n" +
                        "Cat[Mammal[Animal[name=Garfield]]]\n" +
                        "Meow\n" +
                        "Dog[Mammal[Animal[name=Firulais]]]\n" +
                        "Woof\n" +
                        "woooof\n" +
                        "Cat[Mammal[Animal[name=CR7]]]\n" +
                        "Meow";

        assertEquals(
                expected.replace("\r\n", "\n").trim(),
                output.toString().replace("\r\n", "\n").trim()
        );
    }
}