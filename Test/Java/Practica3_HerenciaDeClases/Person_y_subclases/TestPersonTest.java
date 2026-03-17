package Practica3_HerenciaDeClases.Person_y_subclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestPersonMainTest {

    @Test
    void testMain() {
        // Simple smoke test: ejecutar main sin errores
        TestPerson.main(new String[]{});
        assertTrue(true); // si llega aquí, el main funciona
    }
}