package Practica4_DiferenciaComposicionHerencia.Resizable_y_GeometricObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {

    @Test
    void testToString() {
        ResizableCircle circle = new ResizableCircle(10);

        assertEquals("ResizableCircle[Circle[radius= 10.0]]", circle.toString());
    }

    @Test
    void resize() {
        ResizableCircle circle = new ResizableCircle(10);
        circle.resize(50);

        assertEquals("ResizableCircle[Circle[radius= 5.0]]", circle.toString());
        assertEquals(2 * Math.PI * 5, circle.getPerimeter(), 0.0001);
        assertEquals(Math.PI * 25, circle.getArea(), 0.0001);
    }
}