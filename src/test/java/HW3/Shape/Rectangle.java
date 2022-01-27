package HW3.Shape;

public class Rectangle extends Rectangular{
    Rectangle(double x, double y){
        length = x;
        width = y;
    }

    @Override
    public double getSquare() {
        return length * width;
// return x * y;  - почему не правильно
    }
}