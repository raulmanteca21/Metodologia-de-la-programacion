package Practica2_ComposicionAgregacion.MyPoint_y_adiciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {
    @Test
    void testMyPoint() {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(3, 4);

        assertEquals(0, p1.getX());

        // Comprobamos la X después de hacer setX, y la Y después de setY
        p1.setX(1);
        assertEquals(1, p1.getX());
        p1.setY(1);
        assertEquals(1, p1.getY());

        p1.setXY(0, 0);
        assertArrayEquals(new int[]{0, 0}, p1.getXY());
        assertEquals("(0,0)", p1.toString());

        // Se añade un delta (0.0001) exigido por JUnit para comparar doubles
        assertEquals(5.0, p1.distance(3, 4), 0.0001);
        assertEquals(5.0, p1.distance(p2), 0.0001);
        assertEquals(0.0, p1.distance(), 0.0001);
    }
}