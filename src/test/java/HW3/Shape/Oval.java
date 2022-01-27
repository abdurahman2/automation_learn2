package HW3.Shape;

public class Oval extends Round {

    Oval(double x, double y){
        sRadius = x; // чет отличие, если не использую this
        bRadius = y;
    }

    @Override
    public double getSquare() {
        return Math.PI * sRadius * bRadius;
    }
}