package Practica4_DiferenciaComposicionHerencia.Shape_y_subclases_concretas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle(2.0, 4.0);

        assertEquals(2.0, rectangle.getWidth(), 0.0001);
    }

    @Test
    void setWidth() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(8.0);

        assertEquals(8.0, rectangle.getWidth(), 0.0001);
    }

    @Test
    void getLength() {
        Rectangle rectangle = new Rectangle(2.0, 4.0);

        assertEquals(4.0, rectangle.getLength(), 0.0001);
    }

    @Test
    void setLength() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(9.0);

        assertEquals(9.0, rectangle.getLength(), 0.0001);
    }

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(2.0, 4.0);

        assertEquals(8.0, rectangle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle = new Rectangle(2.0, 4.0);

        assertEquals(12.0, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(2.0, 4.0, "blue", true);

        assertEquals("Rectangle[Shape[color=blue,filled=true],width=2.0,length=4.0]", rectangle.toString());
    }
}