package Practica3_HerenciaDeClases.Person_y_subclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testGetNameAndAddress() {
        Person p = new Person("John", "Madrid");
        assertEquals("John", p.getName());
        assertEquals("Madrid", p.getAddress());
    }

    @Test
    void testSetAddress() {
        Person p = new Person("John", "Madrid");
        p.setAddress("Barcelona");
        assertEquals("Barcelona", p.getAddress());
    }

    @Test
    void testToString() {
        Person p = new Person("John", "Madrid");
        assertEquals("Person[name= John,address=Madrid]", p.toString());

        p.setAddress("Barcelona");
        assertEquals("Person[name= John,address=Barcelona]", p.toString());
    }
}