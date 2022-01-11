package HW2;
/*
4.	Given the following class, called NumberHolder,
write some code that creates an instance of the class,
initializes its two member variables,
and then displays the value of each member variable.
4. Учитывая следующий класс, называемый NumberHolder,  напишите некий код, который создает экземпляр класса,
инициализирует свои два переменных участника, и затем отображает значение каждой переменной элемента.
public class NumberHolder {
    public int anInt;
    public float aFloat;
}
 */

public class NumberHolder {
    public int anInt;
    public float aFloat;

}

class MainClass {
    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder(); //который создает экземпляр класса (instance)
        numberHolder.anInt = 20; //присваиваем значения переменным экземпляра класса numberHolder
        numberHolder.aFloat = 8.5f;
        System.out.println("First variables " + numberHolder.anInt + "; Second variables " + numberHolder.aFloat);
    }
}
