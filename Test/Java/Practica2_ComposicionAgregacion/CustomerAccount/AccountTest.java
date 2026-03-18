package Practica2_ComposicionAgregacion.CustomerAccount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void testAccount() {
        Customer c = new Customer(88, "Bob", 'm');

        Account acc1 = new Account(101, c, 50.5);
        assertEquals(101, acc1.getId());
        assertEquals(c, acc1.getCustomer());
        assertEquals(50.5, acc1.getBalance(), 0.0001);
        assertEquals("Bob", acc1.getCustomerName());

        Account acc2 = new Account(102, c);
        assertEquals(0.0, acc2.getBalance(), 0.0001);

        acc2.setBalance(10.0);
        assertEquals(10.0, acc2.getBalance(), 0.0001);

        acc2.deposit(5.0);
        assertEquals(15.0, acc2.getBalance(), 0.0001);

        acc2.withdraw(10.0);
        assertEquals(5.0, acc2.getBalance(), 0.0001);

        acc2.withdraw(100.0);
        assertEquals(5.0, acc2.getBalance(), 0.0001);


        String accountString = acc1.toString();
        assertTrue(accountString.contains("Bob"));
        assertTrue(accountString.contains("88"));
    }
}