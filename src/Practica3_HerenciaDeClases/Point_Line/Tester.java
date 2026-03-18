package Practica3_HerenciaDeClases.Point_Line;

public class Tester {

    public static void main(String[] args) {

        // ===== TEST POINT =====
        System.out.println("=== TEST POINT ===");

        Point p1 = new Point(10, 20);
        System.out.println(p1);

        p1.setXY(100, 10);
        System.out.println("Después de setXY: " + p1);

        System.out.println("X: " + p1.getX());
        System.out.println("Y: " + p1.getY());


        // ===== TEST LINE (COMPOSICIÓN) =====
        System.out.println("\n=== TEST LINE (COMPOSICIÓN) ===");

        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        System.out.println("BeginX: " + l1.getBeginX());
        System.out.println("BeginY: " + l1.getBeginY());
        System.out.println("EndX: " + l1.getEndX());
        System.out.println("EndY: " + l1.getEndY());

        System.out.println("Length: " + l1.getLength());
        System.out.println("Gradient: " + l1.getGradient());

        l1.setBeginXY(1, 1);
        l1.setEndXY(5, 5);
        System.out.println("Después de cambiar puntos: " + l1);


        // ===== TEST LINE CON POINTS =====
        System.out.println("\n=== TEST LINE CON OBJETOS POINT ===");

        Point p2 = new Point(2, 2);
        Point p3 = new Point(6, 6);

        Line l2 = new Line(p2, p3);
        System.out.println(l2);


        // ===== TEST LINESUB (HERENCIA) =====
        System.out.println("\n=== TEST LINESUB (HERENCIA) ===");

        LineSub ls1 = new LineSub(0, 0, 3, 4);
        System.out.println(ls1);

        System.out.println("BeginX: " + ls1.getBeginX());
        System.out.println("BeginY: " + ls1.getBeginY());
        System.out.println("EndX: " + ls1.getEndX());
        System.out.println("EndY: " + ls1.getEndY());

        System.out.println("Length: " + ls1.getLength());
        System.out.println("Gradient: " + ls1.getGradient());

        ls1.setBeginXY(2, 2);
        ls1.setEndXY(7, 7);
        System.out.println("Después de cambiar puntos: " + ls1);
    }
}