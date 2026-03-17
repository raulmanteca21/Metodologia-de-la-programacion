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
    }
}
