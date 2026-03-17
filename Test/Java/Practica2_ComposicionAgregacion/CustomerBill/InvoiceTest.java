package Practica2_ComposicionAgregacion.CustomerBill;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    @Test
    void testInvoice() {
        Customer c1 = new Customer(1, "Charlie", 10);
        Customer c2 = new Customer(2, "Dave", 20);
        Invoice inv = new Invoice(100, c1, 200.0);

        assertEquals(100, inv.getId());
        assertEquals(c1, inv.getCustomer());
        assertEquals(200.0, inv.getAmount());

        inv.setCustomer(c2);
        inv.setAmount(300.0);
        assertEquals(300.0, inv.getAmount());

        assertEquals(2, inv.getCustomerId());
        assertEquals("Dave", inv.getCustomerName());
        assertEquals(20, inv.getCustomerDiscount());
        assertEquals(240.0, inv.getAmountAfterDiscount());

        assertEquals("Invoice[id=100, customer=Dave(2)(20%),amount=300.0]", inv.toString());
    }
}