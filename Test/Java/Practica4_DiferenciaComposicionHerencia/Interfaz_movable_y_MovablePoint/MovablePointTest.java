package Practica4_DiferenciaComposicionHerencia.Interfaz_movable_y_MovablePoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void moveUp() {
        MovablePoint point = new MovablePoint(5, 5, 2, 3);
        point.moveUp();

        assertEquals("MovablePoint[x=5,y=2,xSpeed=2,ySpeed=3]", point.toString());
    }

    @Test
    void moveDown() {
        MovablePoint point = new MovablePoint(5, 5, 2, 3);
        point.moveDown();

        assertEquals("MovablePoint[x=5,y=8,xSpeed=2,ySpeed=3]", point.toString());
    }

    @Test
    void moveLeft() {
        MovablePoint point = new MovablePoint(5, 5, 2, 3);
        point.moveLeft();

        assertEquals("MovablePoint[x=3,y=5,xSpeed=2,ySpeed=3]", point.toString());
    }

    @Test
    void moveRight() {
        MovablePoint point = new MovablePoint(5, 5, 2, 3);
        point.moveRight();

        assertEquals("MovablePoint[x=7,y=5,xSpeed=2,ySpeed=3]", point.toString());
    }

    @Test
    void testToString() {
        MovablePoint point = new MovablePoint(5, 5, 2, 3);

        assertEquals("MovablePoint[x=5,y=5,xSpeed=2,ySpeed=3]", point.toString());
    }
}