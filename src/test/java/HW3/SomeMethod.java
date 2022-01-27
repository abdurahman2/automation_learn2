package HW3;

public class SomeMethod {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 2, 3);
        System.out.println(vector1.calc3d());
        System.out.println(vector1.scalarMulti(vector1, vector1));
//        System.out.println(vector1.rnd());
        System.out.println(vector1.someVector(1, 2, 3));
        System.out.println(vector1.someVector(1, 2));
        System.out.println(Vector.getVectors());
        System.out.println(Vector.getVectors(1));

    }
}
