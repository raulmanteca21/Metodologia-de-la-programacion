package Practica3_HerenciaDeClases.Point_Line;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {
    @Test
    void testLineSub() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        LineSub l1 = new LineSub(p1, p2);
        assertEquals(0, l1.getBeginX());
        assertEquals(4, l1.getEndY());

        LineSub l2 = new LineSub(1, 1, 4, 5);
        assertEquals(1, l2.getBeginX());
        assertEquals(1, l2.getBeginY());
        assertEquals(4, l2.getEndX());
        assertEquals(5, l2.getEndY());

        l2.setBegin(new Point(0, 0));
        l2.setEnd(new Point(3, 4));

        assertEquals(0, l2.getBegin().getX());
        assertEquals(3, l2.getEnd().getX());

        l2.setBeginX(1);
        l2.setBeginY(1);
        l2.setEndX(4);
        l2.setEndY(5);

        assertEquals(1, l2.getBeginX());
        assertEquals(1, l2.getBeginY());
        assertEquals(4, l2.getEndX());
        assertEquals(5, l2.getEndY());

        l2.setBeginXY(0, 0);
        l2.setEndXY(3, 4);

        assertEquals(5, l2.getLength());
        assertEquals(Math.atan2(4, 3), l2.getGradient(), 0.0001);

        assertEquals("LineSub[begin=(0,0),end=Point: (3,4)]", l2.toString());
    }
}