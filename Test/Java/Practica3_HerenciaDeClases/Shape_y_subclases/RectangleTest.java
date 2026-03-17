package Practica3_HerenciaDeClases.Shape_y_subclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testConstructorsAndGetters() {
        // Constructor por defecto
        Rectangle r1 = new Rectangle();
        assertEquals(1.0, r1.getWidth());
        assertEquals(1.0, r1.getLength());

        // Constructor ancho y largo
        Rectangle r2 = new Rectangle(2.0, 4.0);
        assertEquals(2.0, r2.getWidth());
        assertEquals(4.0, r2.getLength());

        // Constructor completo
        Rectangle r3 = new Rectangle(3.0, 5.0, "green", false);
        assertEquals(3.0, r3.getWidth());
        assertEquals(5.0, r3.getLength());
        assertEquals("green", r3.getColor());
        assertFalse(r3.isFilled());
    }

    @Test
    void testSetters() {
        Rectangle r = new Rectangle();
        r.setWidth(6.0);
        r.setLength(8.0);
        assertEquals(6.0, r.getWidth());
        assertEquals(8.0, r.getLength());
    }

    @Test
    void testMathMethods() {
        Rectangle r = new Rectangle(3.0, 4.0);
        assertEquals(12.0, r.getArea(), 0.0001);
        assertEquals(14.0, r.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle(1.0, 2.0, "red", true);
        assertEquals("Rectangle[Shape[color=red,filled=true],width=1.0,length=2.0]", r.toString());
    }
}