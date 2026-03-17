package Practica3_HerenciaDeClases.Animal_y_subclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToString() {
        Animal a = new Animal("Walter");
        assertEquals("Animal[name=Walter]", a.toString());

    }
}