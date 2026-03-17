package Practica3_HerenciaDeClases.Point2D_Point3D;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void testGettersAndSetters() {
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        assertEquals(1.0f, mp.getX());
        assertEquals(2.0f, mp.getY());
        assertEquals(0.5f, mp.getXSpeed());
        assertEquals(1.5f, mp.getYSpeed());

        mp.setXSpeed(2.0f);
        mp.setYSpeed(3.0f);
        assertEquals(2.0f, mp.getXSpeed());
        assertEquals(3.0f, mp.getYSpeed());

        mp.setSpeed(4.0f, 5.0f);
        float[] speed = mp.getSpeed();
        assertArrayEquals(new float[]{4.0f, 5.0f}, speed);
    }

    @Test
    void testMove() {
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        mp.move();
        assertEquals(1.5f, mp.getX());
        assertEquals(3.5f, mp.getY());

        mp.move().move();
        assertEquals(2.5f, mp.getX());
        assertEquals(6.5f, mp.getY());
    }

    @Test
    void testToString() {
        MovablePoint mp = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        assertEquals("(1.0,2.0),speed=(0.5,1.5)", mp.toString());
    }
}