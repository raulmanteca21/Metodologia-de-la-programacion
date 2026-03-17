package Practica4_DiferenciaComposicionHerencia.Resizable_y_GeometricObject;

public class TestCircle {
    public static void main(String[] args) {

        // Test Circle
        Circle c1 = new Circle(10);
        System.out.println(c1);
        System.out.println("Perimeter es: " + c1.getPerimeter());
        System.out.println("Area es: " + c1.getArea());

        // Test ResizableCircle
        ResizableCircle rc1 = new ResizableCircle(10);
        System.out.println(rc1);
        System.out.println("Perimeter es: " + rc1.getPerimeter());
        System.out.println("Area es: " + rc1.getArea());

        // Resize del 50%
        rc1.resize(50);
        System.out.println("Despues de resize(50): " + rc1);
        System.out.println("Perimeter es: " + rc1.getPerimeter());
        System.out.println("Area es: " + rc1.getArea());

    }
}
