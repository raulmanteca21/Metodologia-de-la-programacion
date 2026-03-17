package Practica2_ComposicionAgregacion.MyPoint_y_adiciones;

public class TestMyLine {
    public static void main(String[] args) {

        // Test constructors and toString()
        MyLine l1 = new MyLine(1, 2, 3, 4);
        System.out.println(l1);   // toString()

        MyPoint p1 = new MyPoint(5, 6);
        MyPoint p2 = new MyPoint(7, 8);
        MyLine l2 = new MyLine(p1, p2);
        System.out.println(l2);   // toString()

        // Test getters
        System.out.println("BeginX is: " + l1.getBeginX());
        System.out.println("BeginY is: " + l1.getBeginY());
        System.out.println("EndX is: " + l1.getEndX());
        System.out.println("EndY is: " + l1.getEndY());

        // Test setters
        l1.setBeginX(9);
        l1.setBeginY(10);
        l1.setEndX(11);
        l1.setEndY(12);
        System.out.println(l1);

        // Test setBeginXY() and setEndXY()
        l1.setBeginXY(1, 1);
        l1.setEndXY(4, 5);
        System.out.println(l1);

        // Test getBeginXY() and getEndXY()
        int[] beginXY = l1.getBeginXY();
        int[] endXY = l1.getEndXY();
        System.out.println("BeginXY is: (" + beginXY[0] + "," + beginXY[1] + ")");
        System.out.println("EndXY is: (" + endXY[0] + "," + endXY[1] + ")");

        // Test getLength() and getGradient()
        System.out.println("Length is: " + l1.getLength());
        System.out.println("Gradient is: " + l1.getGradient());
    }
}