package Practica4_DiferenciaComposicionHerencia.Shape_y_subclases_concretas;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TestShapeTest {

    @Test
    void main() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        TestShape.main(new String[]{});

        System.setOut(originalOut);

        String result = output.toString();

        assertTrue(result.contains("Circle[Shape[color=red,filled=false],radius=5.5]"));
        assertTrue(result.contains("red"));
        assertTrue(result.contains("false"));
        assertTrue(result.contains("5.5"));

        assertTrue(result.contains("Rectangle[Shape[color=red,filled=false],width=1.0,length=2.0]"));
        assertTrue(result.contains("6.0"));
        assertTrue(result.contains("2.0"));

        assertTrue(result.contains("Square[Rectangle[Shape[color=red,filled=true],width=6.6,length=6.6]]"));
        assertTrue(result.contains("43.559999999999995"));
        assertTrue(result.contains("6.6"));
    }
}