package Practica3_HerenciaDeClases.Shape_y_subclases;

public class Circle extends Shape{
    private double radius=1.0;
    //----------------------------------------------
    //constructores
    public Circle(){
        super();
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    //----------------------------------------------
    //getters, permiten leer los atributos privados desde fuera de la clase
    public double getRadius(){return radius;}
    public double getArea(){return Math.PI*radius*radius;}
    public double getPerimeter(){return 2*Math.PI*radius;}
    //----------------------------------------------
    //setters, permiten actualizar los valores (no devuelven nada, void)
    public void setRadius(double radius){this.radius=radius;}
    //----------------------------------------------
    //formato de salida de texto
    @Override
    public String toString(){return "Circle["+super.toString()+",radius="+radius+"]";}
}
