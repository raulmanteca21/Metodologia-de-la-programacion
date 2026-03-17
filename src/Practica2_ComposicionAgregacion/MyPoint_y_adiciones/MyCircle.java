package Practica2_ComposicionAgregacion.MyPoint_y_adiciones;

public class MyCircle {
    private MyPoint center=new MyPoint(0,0);
    private int radius=1;
    //----------------------------------------------
    //constructores
    public MyCircle(){}

    public MyCircle(int x, int y, int radius){
        this.center=new MyPoint(x, y);
        this.radius=radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center=center;
        this.radius=radius;
    }
    //----------------------------------------------
    //getters, permiten leer los atributos privados desde fuera de la clase
    public int getRadius(){return radius;}
    public MyPoint getCenter(){return center;}
    public int getCenterX(){return center.getX();}
    public int getCenterY(){return center.getY();}
    public int[] getCenterXY(){
        return new int[]{center.getX(), center.getY()};
    }
    //----------------------------------------------
    //setters, permiten actualizar los valores (no devuelven nada, void)
    public void setRadius(int radius){this.radius=radius;}
    public void setCenter(MyPoint center){this.center=center;}
    public void setCenterX(int x){this.center.setX(x);}
    public void setCenterY(int y){this.center.setY(y);}
    public void setCenterXY(int x, int y){this.center.setXY(x,y);}
    //----------------------------------------------
    //formato de salida de texto
    public String toString(){return "MyCircle[radius="+radius+",center="+center.toString()+"]";}
    //Otros métodos
    public double getArea(){return Math.PI*radius*radius;}
    public double getCircumference(){return 2*Math.PI*radius;}
    public double distance(MyCircle another){return this.center.distance(another.center);}
}
