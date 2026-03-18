package Practica4_DiferenciaComposicionHerencia.Resizable_y_GeometricObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testToString() {
        Circle circle = new Circle(10);

        assertEquals("Circle[radius= 10.0]", circle.toString());
    }

    @Test
    void getPerimeter() {
        Circle circle = new Circle(10);

        assertEquals(2 * Math.PI * 10, circle.getPerimeter(), 0.0001);
    }

    @Test
    void getArea() {
        Circle circle = new Circle(10);

        assertEquals(Math.PI * 10 * 10, circle.getArea(), 0.0001);
    }
}