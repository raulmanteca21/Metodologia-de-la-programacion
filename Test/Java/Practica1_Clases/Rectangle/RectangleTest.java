package Practica1_Clases.Rectangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testConstructorsAndGetters() {
        Rectangle r1 = new Rectangle();
        assertEquals(1.0f, r1.getLength());
        assertEquals(1.0f, r1.getWidth());

        Rectangle r2 = new Rectangle(2.5f, 3.5f);
        assertEquals(2.5f, r2.getLength());
        assertEquals(3.5f, r2.getWidth());
    }

    @Test
    void testSetters() {
        Rectangle r = new Rectangle();
        r.setLength(5.0f);
        r.setWidth(4.0f);
        assertEquals(5.0f, r.getLength());
        assertEquals(4.0f, r.getWidth());
    }

    @Test
    void testAreaAndPerimeter() {
        Rectangle r = new Rectangle(2.0f, 2.0f);
        assertEquals(4.0, r.getArea());
        assertEquals(8.0, r.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle(1.2f, 3.4f);
        assertEquals("Rectangle[length:1.2,width:3.4]", r.toString());
    }
}

