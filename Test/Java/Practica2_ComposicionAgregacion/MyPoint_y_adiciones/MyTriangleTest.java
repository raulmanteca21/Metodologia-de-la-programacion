package Practica2_ComposicionAgregacion.MyPoint_y_adiciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {
    @Test
    void testMyTriangle() {
        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(1,0);
        MyPoint p3 = new MyPoint(0,1);

        MyTriangle t1 = new MyTriangle(0,0, 1,0, 0,1);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);

        assertTrue(t1.getPerimeter() > 0);
        assertEquals("My Triangle [v1=(0,0), v2=(1,0), v3= (0,1)]", t2.toString());

        MyTriangle iso = new MyTriangle(0,0, 2,0, 1,2);
        assertEquals("Isosceles", iso.getType());

        MyTriangle sca = new MyTriangle(0,0, 0,3, 4,0);
        assertEquals("Scalene", sca.getType());

        // Punto degenerado para que a==b==c encaje con tu código sin modificar
        MyTriangle equ = new MyTriangle(0,0, 0,0, 0,0);
        assertEquals("Equilateral", equ.getType());
    }
}