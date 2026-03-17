package Practica3_HerenciaDeClases.Person_y_subclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testGettersAndSetters() {
        Student s = new Student("Ana", "Valencia", "Engineering", 2, 1500);
        assertEquals("Ana", s.getName());
        assertEquals("Valencia", s.getAddress());
        assertEquals("Engineering", s.getProgram());
        assertEquals(2, s.getYear());
        assertEquals(1500, s.getFee());

        s.setProgram("Mathematics");
        s.setYear(3);
        s.setFee(2000);

        assertEquals("Mathematics", s.getProgram());
        assertEquals(3, s.getYear());
        assertEquals(2000, s.getFee());
    }

    @Test
    void testToString() {
        Student s = new Student("Ana", "Valencia", "Engineering", 2, 1500);
        assertEquals(
                "Student[Person[name= Ana,address=Valencia],program=Engineering,year=2,fee=1500.0]",
                s.toString()
        );

        s.setProgram("Mathematics");
        s.setYear(3);
        s.setFee(2000);

        assertEquals(
                "Student[Person[name= Ana,address=Valencia],program=Mathematics,year=3,fee=2000.0]",
                s.toString()
        );
    }
}