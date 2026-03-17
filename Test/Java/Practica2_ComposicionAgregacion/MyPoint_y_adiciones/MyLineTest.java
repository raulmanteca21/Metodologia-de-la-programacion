package Practica2_ComposicionAgregacion.MyPoint_y_adiciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {
    @Test
    void testMyLine() {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);
        MyLine l1 = new MyLine(0, 0, 3, 4);
        MyLine l2 = new MyLine(p1, p2);

        assertEquals(p1.toString(), l2.getBegin().toString());
        assertEquals(p2.toString(), l2.getEnd().toString());

        l1.setBegin(new MyPoint(1, 1));
        l1.setEnd(new MyPoint(4, 5));


        assertEquals(1, l1.getBeginY());
        assertEquals(1, l1.getBeginX());

        l1.setBeginX(0);
        l1.setBeginY(0);
        assertEquals(4, l1.getEndX());
        assertEquals(5, l1.getEndY());
        l1.setEndX(3);
        l1.setEndY(4);

        assertArrayEquals(new int[]{0, 0}, l1.getBeginXY());
        l1.setBeginXY(0, 0);
        assertArrayEquals(new int[]{3, 4}, l1.getEndXY());
        l1.setEndXY(3, 4);

        assertEquals(5.0, l1.getLength(), 0.0001);
        assertEquals(Math.atan2(4, 3), l1.getGradient(), 0.0001);
        assertEquals("MyLine[begin=(0,0),end=(3,4)]", l1.toString());
    }
}