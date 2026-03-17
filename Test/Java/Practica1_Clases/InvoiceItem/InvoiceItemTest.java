package Practica1_Clases.InvoiceItem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {
    @Test
    void testInvoiceItemGetters() {
        InvoiceItem item = new InvoiceItem("A1", "Pen", 10, 0.5);

        // Aseguramos cubrir cada getter
        assertEquals("A1", item.getId());
        assertEquals("Pen", item.getDesc());
        assertEquals(10, item.getQty());
        assertEquals(0.5, item.getUnitPrice());
    }

    @Test
    void testInvoiceItemSettersAndLogic() {
        InvoiceItem item = new InvoiceItem("A1", "Pen", 10, 0.5);

        // Cambiamos valores para probar setters
        item.setQty(20);
        item.setUnitPrice(1.0);

        assertEquals(20, item.getQty());
        assertEquals(1.0, item.getUnitPrice());
        assertEquals(20.0, item.getTotal());
        assertEquals("InvoiceItem[id=A1,desc=Pen,qty=20,unitPrice=1.0]", item.toString());
    }
}