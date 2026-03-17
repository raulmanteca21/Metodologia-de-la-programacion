package Practica3_HerenciaDeClases.Animal_y_subclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void testToString() {
        Mammal m = new Mammal("Osbaldo");
        assertEquals("Mammal[Animal[name=Osbaldo]]", m.toString());
    }
}