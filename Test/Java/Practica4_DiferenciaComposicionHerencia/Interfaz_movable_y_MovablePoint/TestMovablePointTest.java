package Practica4_DiferenciaComposicionHerencia.Interfaz_movable_y_MovablePoint;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TestMovablePointTest {

    @Test
    void main() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        TestMovablePoint.main(new String[]{});

        System.setOut(originalOut);

        String result = output.toString();

        assertTrue(result.contains("MovablePoint[x=5,y=5,xSpeed=2,ySpeed=3]"));
        assertTrue(result.contains("Despues de moveUp: MovablePoint[x=5,y=2,xSpeed=2,ySpeed=3]"));
        assertTrue(result.contains("Despues de moveDown: MovablePoint[x=5,y=5,xSpeed=2,ySpeed=3]"));
        assertTrue(result.contains("Desoues de moveLeft: MovablePoint[x=3,y=5,xSpeed=2,ySpeed=3]"));
        assertTrue(result.contains("Despues de moveRight: MovablePoint[x=5,y=5,xSpeed=2,ySpeed=3]"));
        assertTrue(result.contains("Despues de  moveRight hacemos moveDown: MovablePoint[x=7,y=8,xSpeed=2,ySpeed=3]"));
    }

    @Test
    void testMain() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        TestMovablePoint.main(new String[]{});

        System.setOut(originalOut);

        String result = output.toString();

        assertTrue(result.contains("MovablePoint[x=10,y=10,xSpeed=1,ySpeed=2],radius=5"));
        assertTrue(result.contains("Despues de moveUp: MovablePoint[x=10,y=8,xSpeed=1,ySpeed=2],radius=5"));
        assertTrue(result.contains("Despues de moveDown: MovablePoint[x=10,y=10,xSpeed=1,ySpeed=2],radius=5"));
        assertTrue(result.contains("Despues de moveLeft: MovablePoint[x=9,y=10,xSpeed=1,ySpeed=2],radius=5"));
        assertTrue(result.contains("Despues de moveRight: MovablePoint[x=10,y=10,xSpeed=1,ySpeed=2],radius=5"));
        assertTrue(result.contains("despues de moveRight y moveDown: MovablePoint[x=11,y=12,xSpeed=1,ySpeed=2],radius=5"));
    }
}