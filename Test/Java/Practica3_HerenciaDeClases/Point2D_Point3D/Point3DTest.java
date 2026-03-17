package Practica3_HerenciaDeClases.Point2D_Point3D;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void testGettersAndSetters() {
        Point3D p = new Point3D(5.0f, 6.0f, 7.0f);
        assertEquals(5.0f, p.getX());
        assertEquals(6.0f, p.getY());
        assertEquals(7.0f, p.getZ());

        p.setZ(10.0f);
        assertEquals(10.0f, p.getZ());

        p.setXYZ(1.0f, 2.0f, 3.0f);
        float[] xyz = p.getXYZ();
        assertArrayEquals(new float[]{1.0f, 2.0f, 3.0f}, xyz);
    }

    @Test
    void testToString() {
        Point3D p = new Point3D(5.0f, 6.0f, 7.0f);
        assertEquals("(5.0,6.0,7.0)", p.toString());
    }
}