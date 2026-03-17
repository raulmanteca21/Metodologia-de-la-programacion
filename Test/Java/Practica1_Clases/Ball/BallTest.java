package Practica1_Clases.Ball;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BallTest {
    @Test
    void testBallGettersAndSetters() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 0.5f, 0.5f);

        // Comprobamos el estado inicial llamando a todos los getters
        assertEquals(1.1f, ball.getX(), 0.001);
        assertEquals(2.2f, ball.getY(), 0.001);
        assertEquals(10, ball.getRadius());
        assertEquals(0.5f, ball.getXDelta(), 0.001);
        assertEquals(0.5f, ball.getYDelta(), 0.001);

        // Modificamos estado usando setters
        ball.setX(1.0f);
        ball.setY(1.0f);
        ball.setRadius(5);
        ball.setXDelta(0.1f);
        ball.setYDelta(0.1f);

        assertEquals(1.0f, ball.getX(), 0.001);
        assertEquals(5, ball.getRadius());
    }

    @Test
    void testBallMovement() {
        Ball ball = new Ball(1.0f, 1.0f, 5, 0.1f, 0.1f);

        ball.move();
        assertEquals(1.1f, ball.getX(), 0.001);
        assertEquals(1.1f, ball.getY(), 0.001);

        ball.reflectHorizontal();
        assertEquals(-0.1f, ball.getXDelta(), 0.001);

        ball.reflectVertical();
        assertEquals(-0.1f, ball.getYDelta(), 0.001);

        assertEquals("Ball[(1.1,1.1),speed=(-0.1,-0.1)]", ball.toString());
    }
}