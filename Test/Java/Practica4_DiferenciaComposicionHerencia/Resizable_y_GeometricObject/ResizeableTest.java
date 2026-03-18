package Practica4_DiferenciaComposicionHerencia.Resizable_y_GeometricObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizeableTest {

    @Test
    void resize() {
        Resizeable resizeable = new ResizableCircle(10);
        resizeable.resize(50);

        ResizableCircle circle = (ResizableCircle) resizeable;
        assertEquals("ResizableCircle[Circle[radius= 5.0]]", circle.toString());
    }
}