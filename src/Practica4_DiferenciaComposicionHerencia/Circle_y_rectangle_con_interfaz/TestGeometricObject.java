package Practica4_DiferenciaComposicionHerencia.Circle_y_rectangle_con_interfaz;

public class TestGeometricObject {
    public static void main(String[] args) {

        //Test Circle
        GeometricObject g1 = new Circle(5.0);
        System.out.println(g1);                  // toString()
        System.out.println("Area: " + g1.getArea());
        System.out.println("Perimeter: " + g1.getPerimeter());

        //Test Rectangle
        GeometricObject g2 = new Rectangle(4.0, 6.0);
        System.out.println(g2);                  // toString()
        System.out.println("Area: " + g2.getArea());
        System.out.println("Perimeter: " + g2.getPerimeter());

        //Mas prubas para cubrir los polimorfismos
        GeometricObject g3 = new Circle(2.5);
        System.out.println(g3);
        System.out.println("Area: " + g3.getArea());
        System.out.println("Perimeter: " + g3.getPerimeter());

        GeometricObject g4 = new Rectangle(3.0, 3.0);
        System.out.println(g4);
        System.out.println("Area: " + g4.getArea());
        System.out.println("Perimeter: " + g4.getPerimeter());
    }
}