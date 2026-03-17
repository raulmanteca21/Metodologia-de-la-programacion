package Practica2_ComposicionAgregacion.MyPoint_y_adiciones;

public class TestMyPoint {
    public static void main(String[] args){
        //Example distance()
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1.distance());
        //Example distance(x,y)
        MyPoint p2 = new MyPoint(3, 4);
        System.out.println(p1.distance(5, 6));
        //Example distance(another)
        MyPoint p3 = new MyPoint(3, 4);
        MyPoint p4 = new MyPoint(5, 6);
        System.out.println(p3.distance(p4));

        // Test program to test all constructors and public methods
        MyPoint p5 = new MyPoint(); // Test constructor
        System.out.println(p5); // Test toString()
        p5.setX(8); // Test setters
        p5.setY(6);
        System.out.println("x is: " + p5.getX()); // Test getters
        System.out.println("y is: " + p5.getY());
        p5.setXY(3, 0); // Test setXY()
        System.out.println(p5.getXY()[0]); // Test getXY()
        System.out.println(p5.getXY()[1]);
        System.out.println(p5);
        MyPoint p6 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p6);
// Testing the overloaded methods distance()
        System.out.println(p5.distance(p6)); // which version?
        System.out.println(p6.distance(p5)); // which version?
        System.out.println(p5.distance(5, 6)); // which version?
        System.out.println(p5.distance()); // which version?
        //Escribe ahora un programa que instancie un array de 10 puntos MyPoint, inicializados como (1,1), (2,2)...(10,10).
        //Muestra la matriz de distancias entre todos ellos.

        //Crear array de 10 puntos.
        MyPoint[] punto = new MyPoint[10];
        //inicializamos los puntos.
        for (int i = 0; i<10; i++ ){
            punto[i]= new MyPoint(i+1, i+1);
        }
        //Matriz de distancias de todos ellos
        for (int i = 0; i<10; i++){
            for (int j = 0; j < 10; j++) {

                double coordenada = punto[i].distance(punto[j]);

                System.out.printf("%.2f ", coordenada);
            }
            System.out.println();
        }
    }
}