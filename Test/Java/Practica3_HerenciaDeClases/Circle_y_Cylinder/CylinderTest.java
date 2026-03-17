package Practica3_HerenciaDeClases.Circle_y_Cylinder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder c1 = new Cylinder();
        assertEquals(1.0, c1.getHeight(), 0.0001);

        Cylinder c2 = new Cylinder(5.5);
        assertEquals(5.5, c2.getHeight(), 0.0001);

        Cylinder c3 = new Cylinder(2.0, 10.0);
        assertEquals(10.0, c3.getHeight(), 0.0001);
    }

    @Test
    void getVolume() {
        Cylinder c1 = new Cylinder(2.0, 5.0);
        // Volumen = área de base * altura = π * r^2 * h
        double expectedVolume = Math.PI * 4.0 * 5.0;
        assertEquals(expectedVolume, c1.getVolume(), 0.0001);

        Cylinder c2 = new Cylinder();
        expectedVolume = Math.PI * 1.0 * 1.0 * 1.0; // base=1, altura=1
        assertEquals(expectedVolume, c2.getVolume(), 0.0001);
    }

    @Test
    void testToString() {
        Cylinder c1 = new Cylinder(2.0, 3.0);
        // Usando el toString de Circle dentro de Cylinder
        String expected = "Cylinder: subclass of Circle[radius=2.0,color=red] height=3.0";
        assertEquals(expected, c1.toString());

        Cylinder c2 = new Cylinder(4.5);
        expected = "Cylinder: subclass of Circle[radius=1.0,color=red] height=4.5";
        assertEquals(expected, c2.toString());
    }
}