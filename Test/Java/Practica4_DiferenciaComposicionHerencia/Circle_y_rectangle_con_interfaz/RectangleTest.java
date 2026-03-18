package Practica4_DiferenciaComposicionHerencia.Circle_y_rectangle_con_interfaz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        assertEquals("Rectangle[width= 4.0,length= 6.0]", rectangle.toString());
    }

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        assertEquals(24.0, rectangle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        assertEquals(20.0, rectangle.getPerimeter(), 0.0001);
    }
}