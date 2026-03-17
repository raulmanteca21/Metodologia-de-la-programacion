package Practica1_Clases;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(){
        this.length=1.0f;
        this.width=1.0f;
    }
    public Rectangle(float l, float w){
        this.length=l;
        this.width=w;
    }

    public float getLength(){return length;}
    public void setLength(float newLength){length=newLength;}
    public float getWidth(){return width;}
    public void setWidth(float newWidth){width=newWidth;}
    public double getArea(){return length*width;}
    public double getPerimeter(){return 2*length+2*width;}

    public String toString() {return "Rectangle[length:"+length+",width:"+width+"]";}
}
