package Practica3_HerenciaDeClases.Shape_y_subclases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testConstructors() {
        // Constructor por defecto
        Square sq1 = new Square();
        assertEquals(1.0, sq1.getSide());

        // Constructor con lado
        Square sq2 = new Square(5.0);
        assertEquals(5.0, sq2.getSide());
        assertEquals(5.0, sq2.getWidth()); // width y length deben ser iguales
        assertEquals(5.0, sq2.getLength());

        // Constructor completo
        Square sq3 = new Square(4.0, "black", false);
        assertEquals(4.0, sq3.getSide());
        assertEquals("black", sq3.getColor());
        assertFalse(sq3.isFilled());
    }

    @Test
    void testSetters() {
        Square sq = new Square();

        // Probamos setSide
        sq.setSide(3.0);
        assertEquals(3.0, sq.getWidth());
        assertEquals(3.0, sq.getLength());

        // Probamos el @Override de setWidth (debe cambiar ambos)
        sq.setWidth(7.0);
        assertEquals(7.0, sq.getWidth());
        assertEquals(7.0, sq.getLength()); // ¡El largo también tuvo que cambiar!

        // Probamos el @Override de setLength (debe cambiar ambos)
        sq.setLength(9.0);
        assertEquals(9.0, sq.getWidth());
        assertEquals(9.0, sq.getLength()); // ¡El ancho también tuvo que cambiar!
    }

    @Test
    void testToString() {
        Square sq = new Square(2.0, "red", true);
        assertEquals("Square[Rectangle[Shape[color=red,filled=true],width=2.0,length=2.0]]", sq.toString());
    }
}