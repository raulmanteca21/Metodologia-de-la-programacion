package Practica3_HerenciaDeClases.Point2D_Point3D;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void testGettersAndSetters() {
        Point2D p = new Point2D(3.0f, 4.0f);
        assertEquals(3.0f, p.getX());
        assertEquals(4.0f, p.getY());

        p.setX(6.0f);
        p.setY(8.0f);
        assertEquals(6.0f, p.getX());
        assertEquals(8.0f, p.getY());

        p.setXY(1.0f, 2.0f);
        float[] xy = p.getXY();
        assertEquals(1.0f, xy[0]);
        assertEquals(2.0f, xy[1]);
    }

    @Test
    void testToString() {
        Point2D p = new Point2D(3.0f, 4.0f);
        assertEquals("(3.0,4.0)", p.toString());
    }
}