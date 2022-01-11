package HW1;

public class HW1_4 {
    /*
4.	Write a Java program to sum values of an array.
Test Data:
[5,6,7,12,-5,32,43]
Expected Output : 100
     */

    public static void main(String[] args) {
        int[] my_array = {5, 6, 7, 12, -5, 32, 43};
        int sum = 0;
        for (int i = 0; i < my_array.length; i++) {
            sum = sum + my_array[i];
        }
        System.out.println(sum);
    }
}
