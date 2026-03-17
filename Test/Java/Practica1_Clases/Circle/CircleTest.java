package Practica1_Clases.Circle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testCircle() {
        Circle c1 = new Circle();
        assertEquals(1.0, c1.getRadius());

        Circle c2 = new Circle(2.0);
        c2.setRadius(3.0);
        assertEquals(3.0, c2.getRadius());
        assertEquals(Math.PI * 9, c2.getArea());
        assertEquals(2 * Math.PI * 3, c2.getCircumference());
        assertEquals("Circle[radius=3.0]", c2.toString());
    }
}