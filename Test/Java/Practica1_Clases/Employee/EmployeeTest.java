package Practica1_Clases.Employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void testEmployeeGettersAndSetters() {
        Employee e = new Employee(1, "John", "Doe", 1000);

        // Cobertura de todos los Getters
        assertEquals(1, e.getId());
        assertEquals("John", e.getFirstName());
        assertEquals("Doe", e.getLastName());
        assertEquals("John Doe", e.getName());
        assertEquals(1000, e.getSalary());
        assertEquals(12000, e.getAnnualSalary());

        // Cobertura de Setters
        e.setSalary(2000);
        assertEquals(2000, e.getSalary());
    }

    @Test
    void testRaiseSalaryAndToString() {
        Employee e = new Employee(1, "John", "Doe", 1000);

        // 1000 + 10% = 1100
        assertEquals(1100, e.raiseSalary(10));
        assertEquals(1100, e.getSalary());

        assertEquals("Employee[id=1,name=John Doe,salary=1100]", e.toString());
    }
}