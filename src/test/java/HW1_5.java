public class HW1_5 {
    /*
5.	Write a Java program to find the duplicate values of an array of integer values.
Test Data:
[5,6,7,12,-5,32,43,6,12]
Expected Output : 6,12
     */
    public static void main(String[] args) {
        int[] my_array = {5, 6, 7, 12, -5, 32, 43, 6, 12};
        int sum = 0;

        for (int i = 0; i < my_array.length; i++) {
            for (i = i + 1; i < my_array.length; i++)
                if (i!= i && my_array[i] == my_array[i]);
//return true;
        }
        System.out.println(my_array);
    }
}
