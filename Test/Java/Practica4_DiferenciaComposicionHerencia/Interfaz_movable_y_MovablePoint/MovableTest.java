package Practica4_DiferenciaComposicionHerencia.Interfaz_movable_y_MovablePoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableTest {

    @Test
    void moveUp() {
        Movable movable = new MovablePoint(4, 4, 1, 2);
        movable.moveUp();

        assertEquals("MovablePoint[x=4,y=2,xSpeed=1,ySpeed=2]", movable.toString());
    }

    @Test
    void moveDown() {
        Movable movable = new MovablePoint(4, 4, 1, 2);
        movable.moveDown();

        assertEquals("MovablePoint[x=4,y=6,xSpeed=1,ySpeed=2]", movable.toString());
    }

    @Test
    void moveLeft() {
        Movable movable = new MovableCircle(10, 10, 1, 2, 5);
        movable.moveLeft();

        assertEquals("MovablePoint[x=9,y=10,xSpeed=1,ySpeed=2],radius=5", movable.toString());
    }

    @Test
    void moveRight() {
        Movable movable = new MovableCircle(10, 10, 1, 2, 5);
        movable.moveRight();

        assertEquals("MovablePoint[x=11,y=10,xSpeed=1,ySpeed=2],radius=5", movable.toString());
    }
}