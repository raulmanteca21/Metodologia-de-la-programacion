package Practica2_ComposicionAgregacion.MyPoint_y_adiciones;

public class TestMyTriangle {
    public static void main(String[] args){
        MyTriangle t1 = new MyTriangle(4, 4 , 4,8, 8 ,4);
        System.out.println(t1);

        MyPoint p1 = new MyPoint(8, 11);
        MyPoint p2 = new MyPoint(-1, 3);
        MyPoint p3 = new MyPoint(3, 7);
        MyTriangle t2 = new MyTriangle(p1,p2,p3);
        System.out.println(t2);


        System.out.println("Perimeter 1 is: " + t1.getPerimeter());
        System.out.println("Perimeter 2 is: " + t2.getPerimeter());

        System.out.println("Tipo del triangulo 1: " + t1.getType());
        System.out.println("Tipo del triangulo 2: " + t2.getType());
    }
}