package Practica3_HerenciaDeClases.Shape_y_subclases;

public class Shape {
    private String color="red";
    private boolean filled=true;
    //----------------------------------------------
    //constructores
    public Shape(){}
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    //----------------------------------------------
    //getters, permiten leer los atributos privados desde fuera de la clase
    public String getColor(){return color;}
    //Comprobar si shape es filled
    public boolean isFilled(){
        return filled;
    }
    //----------------------------------------------
    //setters, permiten actualizar los valores (no devuelven nada, void)
    public void setColor(String color){this.color=color;}
    public void setFilled(boolean filled){this.filled=filled;}
    //----------------------------------------------
    //formato de salida de texto
    public String toString(){return "Shape[color="+color+",filled="+filled+"]";}
}
