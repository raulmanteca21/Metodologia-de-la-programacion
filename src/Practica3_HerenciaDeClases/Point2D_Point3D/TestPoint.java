package Practica3_HerenciaDeClases.Point2D_Point3D;

public class TestPoint {
    public static void main(String[] args) {

        // ===== Test Point2D =====
        Point2D p1 = new Point2D(3.0f, 4.0f);
        System.out.println(p1);     // toString()

        System.out.println("X: " + p1.getX());
        System.out.println("Y: " + p1.getY());

        p1.setX(6.0f);
        p1.setY(8.0f);
        System.out.println("After setX/setY: " + p1);

        p1.setXY(1.0f, 2.0f);
        System.out.println("After setXY: " + p1);

        float[] xy = p1.getXY();
        System.out.println("getXY(): (" + xy[0] + "," + xy[1] + ")");


        // ===== Test Point3D =====
        Point3D p2 = new Point3D(5.0f, 6.0f, 7.0f);
        System.out.println(p2);    // toString()

        System.out.println("X: " + p2.getX());
        System.out.println("Y: " + p2.getY());
        System.out.println("Z: " + p2.getZ());

        p2.setZ(10.0f);
        System.out.println("After setZ: " + p2);

        p2.setXYZ(1.0f, 2.0f, 3.0f);
        System.out.println("After setXYZ: " + p2);

        float[] xyz = p2.getXYZ();
        System.out.println("getXYZ(): (" + xyz[0] + "," + xyz[1] + "," + xyz[2] + ")");
    }
}
