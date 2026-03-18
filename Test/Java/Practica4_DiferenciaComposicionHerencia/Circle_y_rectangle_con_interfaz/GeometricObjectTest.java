package Practica4_DiferenciaComposicionHerencia.Circle_y_rectangle_con_interfaz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometricObjectTest {

    @Test
    void getArea() {
        GeometricObject circle = new Circle(2.0);
        GeometricObject rectangle = new Rectangle(4.0, 6.0);

        assertEquals(Math.PI * 4, circle.getArea(), 0.0001);
        assertEquals(24.0, rectangle.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        GeometricObject circle = new Circle(2.0);
        GeometricObject rectangle = new Rectangle(4.0, 6.0);

        assertEquals(2 * Math.PI * 2.0, circle.getPerimeter(), 0.0001);
        assertEquals(20.0, rectangle.getPerimeter(), 0.0001);
    }
}