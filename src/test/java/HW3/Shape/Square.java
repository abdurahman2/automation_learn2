package HW3.Shape;

public class Square extends Rectangular{
    Square(double x){
        length = x;
    }

    @Override
    public double getSquare() {
        return length * length;
    }
}