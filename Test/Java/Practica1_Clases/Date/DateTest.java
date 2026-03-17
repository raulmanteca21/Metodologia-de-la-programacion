package Practica1_Clases.Date;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    @Test
    void testDate() {
        Date d = new Date(1, 1, 2024);
        d.setDay(15);
        d.setMonth(10);
        d.setYear(2025);
        assertEquals(15, d.getDay());
        assertEquals(10, d.getMonth());
        assertEquals(2025, d.getYear());

        d.setDate(31, 12, 2026);
        assertEquals("31/12/2026", d.toString());
    }
}