package Practica1_Clases.Account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testConstructors() {
        // Probamos el constructor de 3 parámetros
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        assertEquals("A101", a1.getId());
        assertEquals("Tan Ah Teck", a1.getName());
        assertEquals(88, a1.getBalance());

        // Probamos el constructor de 2 parámetros (Crítico para el 100%)
        Account a2 = new Account("A102", "Kumar");
        assertEquals("A102", a2.getId());
        assertEquals("Kumar", a2.getName());
        assertEquals(0, a2.getBalance()); // Asume 0 por defecto
    }

    @Test
    void testCreditAndDebit() {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);

        assertEquals(188, a1.credit(100)); // Asumiendo que credit devuelve el balance
        assertEquals(188, a1.getBalance());

        assertEquals(138, a1.debit(50)); // Asumiendo que debit devuelve el balance
        assertEquals(138, a1.getBalance());

        // Test debit fallido (excede balance) - Cubre el bloque 'else'
        assertEquals(138, a1.debit(200));
        assertEquals(138, a1.getBalance());
    }

    @Test
    void testTransfer() {
        Account a1 = new Account("A101", "Tan", 100);
        Account a2 = new Account("A102", "Kumar", 0);

        a1.transferTo(a2, 50);
        assertEquals(50, a1.getBalance());
        assertEquals(50, a2.getBalance());

        // Test transferencia fallida - Cubre el bloque 'else'
        a1.transferTo(a2, 100);
        assertEquals(50, a1.getBalance());
    }

    @Test
    void testToString() {
        Account a = new Account("1", "User", 10);
        assertEquals("Account[id=1,name=User,balance=10]", a.toString());
    }
}