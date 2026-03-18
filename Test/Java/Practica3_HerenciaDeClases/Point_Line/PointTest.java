package Practica3_HerenciaDeClases.Point_Line;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void testPoint() {
        Point p = new Point(1, 2);
        assertEquals(1, p.getX());
        assertEquals(2, p.getY());

        p.setX(3);
        p.setY(4);
        assertEquals(3, p.getX());
        assertEquals(4, p.getY());

        p.setXY(5, 6);
        assertEquals(5, p.getX());
        assertEquals(6, p.getY());

        assertEquals("Point: (5,6)", p.toString());
    }
}