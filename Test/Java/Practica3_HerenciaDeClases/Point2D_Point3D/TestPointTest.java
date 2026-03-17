package Practica3_HerenciaDeClases.Point2D_Point3D;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestPointMainTest {

    @Test
    void testMain() {
        // Smoke test: simplemente ejecutar el main para que no lance errores
        TestPoint.main(new String[]{});
        assertTrue(true); // Si llega aquí, el main funciona
    }
}