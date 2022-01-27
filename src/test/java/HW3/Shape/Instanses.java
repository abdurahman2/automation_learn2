package HW3.Shape;

public class Instanses {
    public static void main(String[] args) {
        Shape c = new Circle(5); // можно обратиться и через интерфейс
        Circle c1 = new Circle(5);
        Oval o = new Oval(2,3);
        System.out.println("Площадь круга - " + c.getSquare() + " - " + c1.getSquare());
        System.out.println("Площадь овала - " + o.getSquare());

        Square s = new Square(6);
        Rectangle r = new Rectangle(3,4);
        System.out.println("Площадь квадрата - " + s.getSquare());
        System.out.println("Площадь прямоугольника - " + r.getSquare());
    }
}