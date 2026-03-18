package Practica1_Clases.Time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    void testNextSecondOverflow() {
        Time t = new Time(23, 59, 59);
        t.nextSecond();
        assertEquals("00:00:00", t.toString());

        t.setTime(10, 10, 10);
        assertEquals(10, t.getHour());
        assertEquals(10, t.getMinute());
        assertEquals(10, t.getSecond());
    }

    @Test
    void testPreviousSecondUnderflow() {
        Time t = new Time(0, 0, 0);
        t.previousSecond();
        assertEquals("23:59:59", t.toString());
    }

    @Test
    void testSetters() {
        Time t = new Time(1,1,1);
        t.setHour(5);
        t.setMinute(5);
        t.setSecond(5);
        assertEquals("05:05:05", t.toString());
    }
}