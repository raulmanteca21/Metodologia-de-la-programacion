package Practica4_DiferenciaComposicionHerencia.Circle_y_rectangle_con_interfaz;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TestGeometricObjectTest {

    @Test
    void main() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        TestGeometricObject.main(new String[]{});

        System.setOut(originalOut);

        String result = output.toString();

        assertTrue(result.contains("Circle[radius= 5.0]"));
        assertTrue(result.contains("Area: 78.53981633974483"));
        assertTrue(result.contains("Perimeter: 31.41592653589793"));

        assertTrue(result.contains("Rectangle[width= 4.0,length= 6.0]"));
        assertTrue(result.contains("Area: 24.0"));
        assertTrue(result.contains("Perimeter: 20.0"));

        assertTrue(result.contains("Circle[radius= 2.5]"));
        assertTrue(result.contains("Area: 19.634954084936208"));
        assertTrue(result.contains("Perimeter: 15.707963267948966"));

        assertTrue(result.contains("Rectangle[width= 3.0,length= 3.0]"));
        assertTrue(result.contains("Area: 9.0"));
        assertTrue(result.contains("Perimeter: 12.0"));
    }
}