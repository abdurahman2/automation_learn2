package HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vector {
    double x, y, z;

    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //    static double pow(double a, double b);
//    static double sqrt(double a)
//        double Calc3d () {
//            x = Math.pow(x, 2);
//            y = Math.pow(y, 2);
//            z = Math.pow(z, 2);
//            a = Math.sqrt(x + y + z);
//            return a;
//        }
    double calc3d() {
        return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
    }

    //    a · b = ax · bx + ay · by + az · bz
    double scalarMulti(Vector a, Vector b) {
        return (a.x * b.x + a.y * b.y + a.z * b.z);
    }

    public static List<Vector> getVectors() {
        Random random = new Random();
        int size = random.nextInt(10) + 1;
        List<Vector> vectors = new ArrayList<Vector>(); // LinkedList<Vector>();
        for (int i = 0; i <= size; i++) {
            vectors.add(createRandomVector());
        }
        return vectors;
    }

    public static List<Vector> getVectors(int size) {
        List<Vector> vectors = new ArrayList<Vector>();
        for (int i = 0; i <= size; i++) {
            Vector vector = createRandomVector();
            vectors.add(vector);
        }
        return vectors;
    }

    public static Vector createRandomVector() {
        Random random = new Random();
        int x = random.nextInt(100) + 10;
        int y = random.nextInt(50) + 10;
        int z = random.nextInt(30) + 10;
        Vector vector = new Vector(x, y, z);
        return vector;
    }

    public ArrayList someVector(double x, double y, double z) {
        ArrayList<Double> someVector = new ArrayList<Double>(); // создание контейнера
        someVector.add(x + y + z); // добавление элемента в конец массива
        return someVector;
    }

    public ArrayList someVector(double x, double y) {
        ArrayList<Double> someVector2 = new ArrayList<Double>();
        someVector2.add(x * y);
        return someVector2;
    }

    @Override
    public String toString() {
        return "x=" + x + " y=" + y + " z=" + z + "\n";
    }

    //    static List <> rnd() {
//        int[] randomArray = new int[10];
//        for (int i = 0; i < randomArray.length; i++) {
//            randomArray[i] = ((int) (Math.random() * 10));
//        }
//        int i = 0;
//        return randomArray();
//    }
}