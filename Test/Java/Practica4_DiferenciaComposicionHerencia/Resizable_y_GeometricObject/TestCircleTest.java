package Practica4_DiferenciaComposicionHerencia.Resizable_y_GeometricObject;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TestCircleTest {

    @Test
    void main() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        TestCircle.main(new String[]{});

        System.setOut(originalOut);

        String result = output.toString();

        assertTrue(result.contains("Circle[radius= 10.0]"));
        assertTrue(result.contains("Perimeter es: 62.83185307179586"));
        assertTrue(result.contains("Area es: 314.1592653589793"));

        assertTrue(result.contains("ResizableCircle[Circle[radius= 10.0]]"));
        assertTrue(result.contains("Despues de resize(50): ResizableCircle[Circle[radius= 5.0]]"));
        assertTrue(result.contains("Perimeter es: 31.41592653589793"));
        assertTrue(result.contains("Area es: 78.53981633974483"));
    }
}