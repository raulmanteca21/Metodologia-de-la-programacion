package Practica2_ComposicionAgregacion.MyPoint_y_adiciones;

public class MyCircleTester {
    public static void main(String[] args){
        //Probamos los 3 constructores diferentes
        MyCircle c1=new MyCircle();
        MyCircle c2=new MyCircle(1,1,2);
        MyCircle c3=new MyCircle(new MyPoint(1,0),3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        //Probamos los getters
        System.out.println("C1 radius is= "+c1.getRadius());
        System.out.println("C2 center is= "+c2.getCenter());
        System.out.println("C3 center's X is= "+c3.getCenterX());
        System.out.println("C3 center's y is= "+c3.getCenterY());
        System.out.println("C2 area is= "+c2.getArea());
        System.out.println("C3 circumference is= "+c3.getCircumference());
        //Probamos los setters
        c1.setRadius(2);
        c2.setCenter(new MyPoint(2,2));
        c3.setCenterX(0);
        c3.setCenterY(1);
        c1.setCenterXY(3,3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        //Probamos el metodo distance
        c1.setCenterXY(0,0); //Para facilitar el asegurarme que salga bien la distancia (4)
        MyCircle c4= new MyCircle(0,4,1);
        System.out.println(c1.distance(c4));
    }
}
