package Practica2_ComposicionAgregacion.CustomerAccount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void testCustomer() {
        Customer c = new Customer(1, "Alice", 'f');
        assertEquals(1, c.getId());
        assertEquals("Alice", c.getName());
        assertEquals('f', c.getGender());
        assertEquals("Alice(1)", c.toString());
    }
}