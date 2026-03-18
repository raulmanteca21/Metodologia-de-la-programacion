package Practica2_ComposicionAgregacion.CustomerBill;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void testCustomer() {
        Customer c = new Customer(1, "Charlie", 10);
        assertEquals(1, c.getId());
        assertEquals("Charlie", c.getName());
        assertEquals(10, c.getDiscount());

        c.setDiscount(20);
        assertEquals(20, c.getDiscount());
        assertEquals("Charlie(1)(20%)", c.toString());
    }
}