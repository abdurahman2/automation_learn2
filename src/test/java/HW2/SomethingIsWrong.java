package HW2;
/*
3.	What's wrong with the following program? Fix the program called SomethingIsWrong.
public class SomethingIsWrong {
public static void main(String[] args) {
    Rectangle myRect;
    myRect.width = 40;
    myRect.height = 50;
    System.out.println("myRect's area is " + myRect.area());
}
}
 */

class Rectangle {
    int width, height;

    int area() {
        return width * height;
    }
}

public class SomethingIsWrong {
    public static void main(String[] args) {
/*        Rectangle myRect;
        myRect = new Rectangle(); - равнозначно следующему => */
        Rectangle myRect = new Rectangle(); //myRect - переменная, Rectangle - имя класса, экземпляр которого хотим

        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }
}

