package Practica3_HerenciaDeClases.Circle_y_Cylinder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c = new Circle(3.5);
        assertEquals(3.5, c.getRadius(), 0.0001);
    }

    @Test
    void setRadius() {
        Circle c = new Circle();
        c.setRadius(4.2);
        assertEquals(4.2, c.getRadius(), 0.0001);
    }

    @Test
    void getColor() {
        Circle c = new Circle(1.0, "blue");
        assertEquals("blue", c.getColor());
    }

    @Test
    void setColor() {
        Circle c = new Circle();
        c.setColor("green");
        assertEquals("green", c.getColor());
    }

    @Test
    void getArea() {
        Circle c = new Circle(2.0);
        // Área = π * r^2
        assertEquals(Math.PI * 4.0, c.getArea(), 0.0001);
    }

    @Test
    void testToString() {
        Circle c = new Circle(2.0, "yellow");
        assertEquals("Circle[radius=2.0,color=yellow]", c.toString());
    }
}