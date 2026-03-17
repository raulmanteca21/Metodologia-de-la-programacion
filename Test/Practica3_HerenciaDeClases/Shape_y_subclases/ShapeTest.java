package Practica3_HerenciaDeClases.Shape_y_subclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void testConstructorsAndGetters() {
        // Constructor por defecto
        Shape s1 = new Shape();
        assertEquals("red", s1.getColor());
        assertTrue(s1.isFilled());

        // Constructor con parámetros
        Shape s2 = new Shape("blue", false);
        assertEquals("blue", s2.getColor());
        assertFalse(s2.isFilled());
    }

    @Test
    void testSetters() {
        Shape s = new Shape();
        s.setColor("green");
        s.setFilled(false);

        assertEquals("green", s.getColor());
        assertFalse(s.isFilled());
    }

    @Test
    void testToString() {
        Shape s = new Shape("yellow", true);
        assertEquals("Shape[color=yellow,filled=true]", s.toString());
    }
}