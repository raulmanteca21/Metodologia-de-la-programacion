package Practica3_HerenciaDeClases.Circle_Cylinder_Composicion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testCircle() {
        Circle c1 = new Circle();
        assertEquals(1.0, c1.getRadius(), 0.0001);
        assertEquals("red", c1.getColor());

        Circle c2 = new Circle(2.5);
        assertEquals(2.5, c2.getRadius(), 0.0001);
        assertEquals("red", c2.getColor());

        Circle c3 = new Circle(3.0, "blue");
        assertEquals(3.0, c3.getRadius(), 0.0001);
        assertEquals("blue", c3.getColor());

        c3.setRadius(4.0);
        c3.setColor("green");
        assertEquals(4.0, c3.getRadius(), 0.0001);
        assertEquals("green", c3.getColor());

        assertEquals(Math.PI * 16.0, c3.getArea(), 0.0001);
        assertEquals("Circle[radius=4.0,color=green]", c3.toString());
    }
}