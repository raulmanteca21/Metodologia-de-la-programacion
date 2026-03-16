package Practica3_HerenciaDeClases.Point2D_Point3D;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    public Point3D(){
        super(0.0f, 0.0f);
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setX(x); // or super.setX(x), use setter in superclass
        setY(y);
        this.z = z;
    }
    public float[] getXYZ() {
        float[] result = new float[3];
        result[0] = getX();
        result[1] = getY();
        result[2] = z;
        return result;
    }
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
