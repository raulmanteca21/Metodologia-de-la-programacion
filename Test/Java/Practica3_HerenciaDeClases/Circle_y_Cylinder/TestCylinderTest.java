package Practica3_HerenciaDeClases.Circle_y_Cylinder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestCylinderTest {

    @Test
    void main() {
        // Cylinder con valores por defecto
        Cylinder c1 = new Cylinder();
        assertEquals(1.0, c1.getRadius(), 0.0001);
        assertEquals(1.0, c1.getHeight(), 0.0001);
        assertEquals(Math.PI * 1.0, c1.getArea(), 0.0001);
        assertEquals(Math.PI * 1.0, c1.getVolume(), 0.0001);

        // Cylinder con altura especificada
        Cylinder c2 = new Cylinder(10.0);
        assertEquals(1.0, c2.getRadius(), 0.0001);
        assertEquals(10.0, c2.getHeight(), 0.0001);
        assertEquals(Math.PI * 1.0, c2.getArea(), 0.0001);
        assertEquals(Math.PI * 10.0, c2.getVolume(), 0.0001);

        // Cylinder con radio y altura especificados
        Cylinder c3 = new Cylinder(2.0, 10.0);
        assertEquals(2.0, c3.getRadius(), 0.0001);
        assertEquals(10.0, c3.getHeight(), 0.0001);
        assertEquals(Math.PI * 4.0, c3.getArea(), 0.0001);
        assertEquals(Math.PI * 4.0 * 10.0, c3.getVolume(), 0.0001);
    }
}