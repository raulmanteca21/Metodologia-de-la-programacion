package Practica4_DiferenciaComposicionHerencia.Shape_y_subclases_concretas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape shape = new Circle(3.0, "green", true);

        assertEquals("green", shape.getColor());
    }

    @Test
    void setColor() {
        Shape shape = new Circle();
        shape.setColor("yellow");

        assertEquals("yellow", shape.getColor());
    }

    @Test
    void isFilled() {
        Shape shape = new Rectangle(2.0, 3.0, "red", false);

        assertFalse(shape.isFilled());
    }

    @Test
    void setFilled() {
        Shape shape = new Rectangle();
        shape.setFilled(false);

        assertFalse(shape.isFilled());
    }

    @Test
    void getArea() {
        Shape shape = new Square(4.0);

        assertEquals(16.0, shape.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        Shape shape = new Square(4.0);

        assertEquals(16.0, shape.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Shape shape = new Circle();

        assertEquals("Circle[Shape[color=red,filled=true],radius=1.0]", shape.toString());
    }
}