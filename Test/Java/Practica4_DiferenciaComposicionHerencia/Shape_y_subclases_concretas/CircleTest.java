package Practica4_DiferenciaComposicionHerencia.Shape_y_subclases_concretas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle circle = new Circle(5.5);

        assertEquals(5.5, circle.getRadius(), 0.0001);
    }

    @Test
    void setRadius() {
        Circle circle = new Circle();
        circle.setRadius(7.0);

        assertEquals(7.0, circle.getRadius(), 0.0001);
    }

    @Test
    void getArea() {
        Circle circle = new Circle(5.5);

        assertEquals(Math.PI * 5.5 * 5.5, circle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        Circle circle = new Circle(5.5);

        assertEquals(2 * Math.PI * 5.5, circle.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Circle circle = new Circle(5.5, "red", false);

        assertEquals("Circle[Shape[color=red,filled=false],radius=5.5]", circle.toString());
    }
}