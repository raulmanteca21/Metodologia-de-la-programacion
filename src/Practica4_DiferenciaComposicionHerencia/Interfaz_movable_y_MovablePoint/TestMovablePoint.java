package Practica4_DiferenciaComposicionHerencia.Interfaz_movable_y_MovablePoint;

public class TestMovablePoint {
    public static void main(String[] args) {

        // Crear objeto
        MovablePoint p1 = new MovablePoint(5, 5, 2, 3);

        //Mostrar estado inicial
        System.out.println(p1);

        // Probar movimientos
        p1.moveUp();
        System.out.println("Despues de moveUp: " + p1);

        p1.moveDown();
        System.out.println("Despues de moveDown: " + p1);

        p1.moveLeft();
        System.out.println("Desoues de moveLeft: " + p1);

        p1.moveRight();
        System.out.println("Despues de moveRight: " + p1);

        // Varias operaciones seguidas
        p1.moveRight();
        p1.moveDown();
        System.out.println("Despues de  moveRight hacemos moveDown: " + p1);

        //Test para la nueva clase MovableCircle
        MovableCircle c1 = new MovableCircle(10, 10, 1, 2, 5);

        System.out.println(c1);

        c1.moveUp();
        System.out.println("Despues de moveUp: " + c1);

        c1.moveDown();
        System.out.println("Despues de moveDown: " + c1);

        c1.moveLeft();
        System.out.println("Despues de moveLeft: " + c1);

        c1.moveRight();
        System.out.println("Despues de moveRight: " + c1);

        c1.moveRight();
        c1.moveDown();
        System.out.println("despues de moveRight y moveDown: " + c1);
    }
}
