package Practica3_HerenciaDeClases.Circle_Cylinder_Composicion;

public class Tester {
    public static void main(String[] args) {

        // ===== TEST CIRCLE =====
        System.out.println("=== TEST CIRCLE ===");

        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(2.5);
        System.out.println(c2);

        Circle c3 = new Circle(3.0, "blue");
        System.out.println(c3);

        System.out.println("Area c3: " + c3.getArea());

        c3.setRadius(4.0);
        c3.setColor("green");
        System.out.println("Después de cambios: " + c3);


        // ===== TEST CYLINDER (COMPOSICIÓN) =====
        System.out.println("\n=== TEST CYLINDER ===");

        Cylinder cy1 = new Cylinder();
        System.out.println(cy1);

        Cylinder cy2 = new Cylinder(3.0, "blue", 5.0);
        System.out.println(cy2);

        System.out.println("Altura: " + cy2.getHeight());
        System.out.println("Área: " + cy2.getArea());
        System.out.println("Volumen: " + cy2.getVolume());

        // Cambiar base
        Circle nuevaBase = new Circle(2.0, "yellow");
        cy2.setBase(nuevaBase);
        cy2.setHeight(10.0);

        System.out.println("Después de cambios: " + cy2);
        System.out.println("Nuevo volumen: " + cy2.getVolume());
    }
}

