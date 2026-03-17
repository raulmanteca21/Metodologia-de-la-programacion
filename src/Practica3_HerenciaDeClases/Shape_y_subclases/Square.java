package Practica3_HerenciaDeClases.Shape_y_subclases;

public class Square extends Rectangle {
    //----------------------------------------------
    //constructores
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side); //width y length son side
    }
    public Square(double side, String color,boolean filled){
        super(side,side,color,filled);
    }
    //----------------------------------------------
    //getters, permiten leer los atributos privados desde fuera de la clase
    public double getSide(){return getWidth();} //con getLength tambien vale
    //----------------------------------------------
    //setters, permiten actualizar los valores (no devuelven nada, void)
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);//le damos el mismo valor al length y width del super
    }
    @Override
    public void setWidth(double side){setSide(side);}
    @Override
    public void setLength(double side){setSide(side);}
    //----------------------------------------------
    //formato de salida de texto
    @Override
    public String toString(){return "Square["+super.toString()+"]";}
}
