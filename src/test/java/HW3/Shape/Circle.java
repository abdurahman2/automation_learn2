package HW3.Shape;

public class Circle extends Round {

    // кончтруктор нужно создавать всегда, и он должен соответствовать имени класса?
    Circle(double x){
        this.radius = x; // добавил this но на что это влияет, ведь можно использовать и название
    }

    public double getSquare() {
        return Math.PI * radius * radius;
    }
}