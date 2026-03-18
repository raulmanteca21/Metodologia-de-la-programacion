package Practica4_DiferenciaComposicionHerencia.Circle_y_rectangle_con_interfaz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testToString() {
        Circle circle = new Circle(5.0);
        assertEquals("Circle[radius= 5.0]", circle.toString());
    }

    @Test
    void getArea() {
        Circle circle = new Circle(5.0);
        assertEquals(Math.PI * 25, circle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        Circle circle = new Circle(5.0);
        assertEquals(2 * Math.PI * 5.0, circle.getPerimeter(), 0.0001);
    }
}