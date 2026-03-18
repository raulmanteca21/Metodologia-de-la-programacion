package Practica3_HerenciaDeClases.Point_Line;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    @Test
    void testLine() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        Line l1 = new Line(p1, p2);
        assertEquals(p1, l1.getBegin());
        assertEquals(p2, l1.getEnd());

        Line l2 = new Line(1, 1, 4, 5);
        assertEquals(1, l2.getBeginX());
        assertEquals(1, l2.getBeginY());
        assertEquals(4, l2.getEndX());
        assertEquals(5, l2.getEndY());

        l2.setBeginX(0);
        l2.setBeginY(0);
        l2.setEndX(3);
        l2.setEndY(4);
        assertEquals(0, l2.getBeginX());
        assertEquals(0, l2.getBeginY());
        assertEquals(3, l2.getEndX());
        assertEquals(4, l2.getEndY());

        l2.setBeginXY(1, 1);
        l2.setEndXY(2, 2);
        assertEquals(1, l2.getBeginX());
        assertEquals(2, l2.getEndX());

        l2.setBegin(p1);
        l2.setEnd(p2);
        assertEquals(0, l2.getBeginX());
        assertEquals(3, l2.getEndX());

        assertEquals(5, l2.getLength());
        assertEquals(Math.atan2(4, 3), l2.getGradient(), 0.0001);

        assertEquals("Line[begin=Point: (0,0),end=Point: (3,4)]", l2.toString());
    }
}