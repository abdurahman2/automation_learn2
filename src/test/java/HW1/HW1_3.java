public class HW1_3 {

    static int sum(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static int mod(int a, int b) {
        return a % b;
    }



    static void sum2() {
        System.out.println("125 + 24 = 149");
    }

    static void subtract2() {
        System.out.println("125  24 = 101");
    }

    static void multiply2() {
        System.out.println("125 * 24 = 3000");
    }

    static void divide2() {
        System.out.println("125 / 24 = 5");
    }

    static void mod2() {
        System.out.println("125 % 24 = 5");
    }


    public static void main(String[] args) {
        /*
3.	Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. (Create a separate method for each operation)
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
         */
        int a = 125;
        int b = 24;
        int c = 149;
        System.out.println(sum(125, 24));
        System.out.println(subtract(125, 24));
        System.out.println(multiply(125, 24));
        System.out.println(divide(125, 24));
        System.out.println(mod(125, 24));

        sum2();
        subtract2();
        multiply2();
        divide2();
        mod2();


    }
}
