package Practica3_HerenciaDeClases.Shape_y_subclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testConstructorsAndGetters() {
        // Constructor por defecto
        Circle c1 = new Circle();
        assertEquals(1.0, c1.getRadius());

        // Constructor con radio
        Circle c2 = new Circle(5.5);
        assertEquals(5.5, c2.getRadius());

        // Constructor completo
        Circle c3 = new Circle(2.5, "blue", false);
        assertEquals(2.5, c3.getRadius());
        assertEquals("blue", c3.getColor());
        assertFalse(c3.isFilled());
    }

    @Test
    void testSetters() {
        Circle c = new Circle();
        c.setRadius(4.2);
        assertEquals(4.2, c.getRadius());
    }

    @Test
    void testMathMethods() {
        Circle c = new Circle(10.0);
        // Área = PI * r^2
        assertEquals(Math.PI * 100, c.getArea(), 0.0001);
        // Perímetro = 2 * PI * r
        assertEquals(2 * Math.PI * 10, c.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Circle c = new Circle(2.0, "red", true);
        assertEquals("Circle[Shape[color=red,filled=true],radius=2.0]", c.toString());
    }
}