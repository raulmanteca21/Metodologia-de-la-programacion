package Practica4_DiferenciaComposicionHerencia.Shape_y_subclases_concretas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square square = new Square(6.6);

        assertEquals(6.6, square.getSide(), 0.0001);
    }

    @Test
    void setSide() {
        Square square = new Square();
        square.setSide(5.0);

        assertEquals(5.0, square.getWidth(), 0.0001);
        assertEquals(5.0, square.getLength(), 0.0001);
        assertEquals(5.0, square.getSide(), 0.0001);
    }

    @Test
    void setWidth() {
        Square square = new Square();
        square.setWidth(7.0);

        assertEquals(7.0, square.getWidth(), 0.0001);
        assertEquals(7.0, square.getLength(), 0.0001);
    }

    @Test
    void setLength() {
        Square square = new Square();
        square.setLength(8.0);

        assertEquals(8.0, square.getWidth(), 0.0001);
        assertEquals(8.0, square.getLength(), 0.0001);
    }

    @Test
    void testToString() {
        Square square = new Square(6.6, "red", true);

        assertEquals("Square[Rectangle[Shape[color=red,filled=true],width=6.6,length=6.6]]", square.toString());
    }
}