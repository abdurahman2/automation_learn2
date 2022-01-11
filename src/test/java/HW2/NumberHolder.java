package HW2;

public class NumberHolder2 {
    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder(); //который создает экземпляр класса
        numberHolder.anInt = 20; // присваиваем значения переменным экземпляра класса numberHolder
        numberHolder.aFloat = 8.5F;
        System.out.println(numberHolder.anInt); // а затем отображает значение каждой переменной элемента
        System.out.println(numberHolder.aFloat);
    }
}
