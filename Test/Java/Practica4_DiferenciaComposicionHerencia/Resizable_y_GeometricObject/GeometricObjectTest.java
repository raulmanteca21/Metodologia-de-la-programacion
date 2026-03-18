package Practica4_DiferenciaComposicionHerencia.Resizable_y_GeometricObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometricObjectTest {

    @Test
    void getArea() {
        GeometricObject g1 = new Circle(10);
        GeometricObject g2 = new ResizableCircle(10);

        assertEquals(Math.PI * 100, g1.getArea(), 0.0001);
        assertEquals(Math.PI * 100, g2.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        GeometricObject g1 = new Circle(10);
        GeometricObject g2 = new ResizableCircle(10);

        assertEquals(2 * Math.PI * 10, g1.getPerimeter(), 0.0001);
        assertEquals(2 * Math.PI * 10, g2.getPerimeter(), 0.0001);
    }
}