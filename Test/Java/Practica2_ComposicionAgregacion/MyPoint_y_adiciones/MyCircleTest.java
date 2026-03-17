package Practica2_ComposicionAgregacion.MyPoint_y_adiciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void testConstructorsAndBasicGetters() {
        // Probamos el constructor por defecto
        MyCircle c1 = new MyCircle();
        assertEquals(1, c1.getRadius());
        assertNotNull(c1.getCenter());

        // Probamos el constructor con (x, y, radius)
        MyCircle c2 = new MyCircle(3, 4, 5);
        assertEquals(5, c2.getRadius());
        assertEquals(3, c2.getCenterX());
        assertEquals(4, c2.getCenterY());

        // Probamos el constructor con (MyPoint, radius)
        MyPoint p = new MyPoint(7, 8);
        MyCircle c3 = new MyCircle(p, 10);
        assertEquals(10, c3.getRadius());
        assertEquals(p, c3.getCenter());
    }

    @Test
    void testSettersAndAdvancedGetters() {
        MyCircle c = new MyCircle();

        // Probamos setRadius
        c.setRadius(7);
        assertEquals(7, c.getRadius());

        // Probamos setCenter
        MyPoint p = new MyPoint(2, 2);
        c.setCenter(p);
        assertEquals(p, c.getCenter());

        // Probamos setCenterX y setCenterY
        c.setCenterX(5);
        assertEquals(5, c.getCenterX());

        c.setCenterY(6);
        assertEquals(6, c.getCenterY());

        // Probamos setCenterXY y getCenterXY (que devuelve un array)
        c.setCenterXY(10, 11);
        int[] expectedArray = {10, 11};
        assertArrayEquals(expectedArray, c.getCenterXY());
    }

    @Test
    void testToString() {
        MyPoint p = new MyPoint(1, 2);
        MyCircle c = new MyCircle(p, 5);

        // El texto exacto que esperamos recibir
        String expected = "MyCircle[radius=5,center=" + p.toString() + "]";
        assertEquals(expected, c.toString());
    }

    @Test
    void testMathMethods() {
        MyCircle c = new MyCircle(0, 0, 10);

        // Área: PI*r^2 = PI*100
        // Al trabajar con decimales, añadimos un tercer parámetro (0.0001) como margen de error aceptable
        assertEquals(Math.PI * 100, c.getArea(), 0.0001);

        // Circunferencia: 2*P*r = 20*PI
        assertEquals(20 * Math.PI, c.getCircumference(), 0.0001);
    }

    @Test
    void testDistance() {
        MyCircle c1 = new MyCircle(0, 0, 5);
        MyCircle c2 = new MyCircle(3, 4, 10);

        // Comprobamos que el metodo distance del círculo llama correctamente al distance de MyPoint
        double expectedDistance = c1.getCenter().distance(c2.getCenter());
        assertEquals(expectedDistance, c1.distance(c2), 0.0001);
    }
}