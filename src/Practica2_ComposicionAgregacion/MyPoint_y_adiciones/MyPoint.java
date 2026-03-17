package Practica2_ComposicionAgregacion.MyPoint_y_adiciones;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){

    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        return new int[] {x, y};
    }
    public void setXY(int x, int y){
        this.x =x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
    public double distance(int x, int y) {
        double dx = x - this.x;
        double dy = y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double distance(MyPoint another){
        double dx = another.x - this.x;
        double dy = another.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);

    }
    // public double distance(MyPoint another){
    //    return distance(another.x, another.y);
    //}
    //Podria hacerlo asi tambien, reutilizo distance.
    public double distance(){
        return distance(0,0);
    }



}

