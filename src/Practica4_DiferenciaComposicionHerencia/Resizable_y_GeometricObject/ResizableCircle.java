package Practica4_DiferenciaComposicionHerencia.Resizable_y_GeometricObject;

public class ResizableCircle extends Circle implements Resizeable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle["+super.toString()+"]";
    }

    @Override
    public void resize(int percent) {
        radius *= percent/100.0;
    }
}
