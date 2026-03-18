package Practica4_DiferenciaComposicionHerencia.Interfaz_movable_y_MovablePoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        MovableCircle circle = new MovableCircle(10, 10, 1, 2, 5);

        assertEquals("MovablePoint[x=10,y=10,xSpeed=1,ySpeed=2],radius=5", circle.toString());
    }

    @Test
    void moveUp() {
        MovableCircle circle = new MovableCircle(10, 10, 1, 2, 5);
        circle.moveUp();

        assertEquals("MovablePoint[x=10,y=8,xSpeed=1,ySpeed=2],radius=5", circle.toString());
    }

    @Test
    void moveDown() {
        MovableCircle circle = new MovableCircle(10, 10, 1, 2, 5);
        circle.moveDown();

        assertEquals("MovablePoint[x=10,y=12,xSpeed=1,ySpeed=2],radius=5", circle.toString());
    }

    @Test
    void moveLeft() {
        MovableCircle circle = new MovableCircle(10, 10, 1, 2, 5);
        circle.moveLeft();

        assertEquals("MovablePoint[x=9,y=10,xSpeed=1,ySpeed=2],radius=5", circle.toString());
    }

    @Test
    void moveRight() {
        MovableCircle circle = new MovableCircle(10, 10, 1, 2, 5);
        circle.moveRight();

        assertEquals("MovablePoint[x=11,y=10,xSpeed=1,ySpeed=2],radius=5", circle.toString());
    }
}