package Practica3_HerenciaDeClases.Circle_Cylinder_Composicion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    @Test
    void testCylinder() {
        Cylinder cy1 = new Cylinder();
        assertEquals(1.0, cy1.getHeight(), 0.0001);
        assertNotNull(cy1.getBase());

        Cylinder cy2 = new Cylinder(2.0, "blue", 5.0);
        assertEquals(5.0, cy2.getHeight(), 0.0001);
        assertEquals(2.0, cy2.getBase().getRadius(), 0.0001);
        assertEquals("blue", cy2.getBase().getColor());

        Circle newBase = new Circle(3.0, "green");
        cy2.setBase(newBase);
        cy2.setHeight(10.0);
        assertEquals(10.0, cy2.getHeight(), 0.0001);
        assertEquals(newBase, cy2.getBase());

        double expectedArea = 2 * (Math.PI * 9) + 2 * Math.PI * 3.0 * 10.0;
        assertEquals(expectedArea, cy2.getArea(), 0.0001);

        double expectedVolume = Math.PI * 9 * 10.0;
        assertEquals(expectedVolume, cy2.getVolume(), 0.0001);

        assertEquals("Cylinder[base=Circle[radius=3.0,color=green],height=10.0]", cy2.toString());
    }
}