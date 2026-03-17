package Practica1_Clases.Ball;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta; //Atributos generales privados
    //----------------------------------------------
    //constructores
    public Ball(float x, float y, int radius, float xDelta, float yDelta){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.xDelta=xDelta;
        this.yDelta=yDelta;
    }
    //----------------------------------------------
    //getters, permiten leer los atributos privados desde fuera de la clase
    public float getX(){return x;}
    public float getY(){return y;}
    public int getRadius(){return radius;}
    public float getXDelta(){return xDelta;}
    public float getYDelta(){return yDelta;}
    //----------------------------------------------
    //setters, permiten actualizar los valores (no devuelven nada, void)
    public void setX(float newX){this.x=newX;}
    public void setY(float newY){this.y=newY;}
    public void setRadius(int newRadius){this.radius=newRadius;}
    public void setXDelta(float newXDelta){this.xDelta=newXDelta;}
    public void setYDelta(float newYDelta){this.yDelta=newYDelta;}
    //----------------------------------------------
    public void move(){
        this.x+=xDelta;
        this.y+=yDelta;
    }
    public void reflectHorizontal(){
        this.xDelta=-xDelta;
    }
    public void reflectVertical(){
        this.yDelta=-yDelta;
    }
    //----------------------------------------------
    //formato de salida de texto
    public String toString(){return "Ball[("+x+","+y+"),speed=("+xDelta+","+yDelta+")]";}
}
