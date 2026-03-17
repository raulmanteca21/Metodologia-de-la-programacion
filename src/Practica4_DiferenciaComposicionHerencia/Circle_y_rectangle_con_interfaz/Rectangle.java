package Practica4_DiferenciaComposicionHerencia.Circle_y_rectangle_con_interfaz;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle[width= "+width+",length= "+ length+"]";
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*width+2*length;
    }
}
