import java.util.HashMap;
import java.util.Iterator;

public class HW1_5 {
    /*
5.	Write a Java program to find the duplicate values of an array of integer values.
Test Data:
[5,6,7,12,-5,32,43,6,12]
Expected Output : 6,12
     */
    public static void main(String[] args) {
        int array[] = {5,6,7,12,-5,32,43,6,12};
        HashMap<Integer,Integer> duplicates = new HashMap<Integer,Integer>();
        for(int i=0; i<array.length; i++)
        {
            if(duplicates.containsKey(array[i]))
            {
                int numberOfOccurances = duplicates.get(array[i]);
                duplicates.put(array[i], (numberOfOccurances + 1));
            }else{
                duplicates.put(array[i], 1);
            }
        }
        Iterator<Integer> keys = duplicates.keySet().iterator();
        System.out.print("Duplicates : " );
        while(keys.hasNext())
        {
            int k = keys.next();
            if(duplicates.get(k) > 1)
            {
                System.out.print(" "+k);
            }
        }






//        int[] my_array = {5,6,7,12,-5,32,43,6,12};
//        for (int i = 0; i < my_array.length; i++) {
//            for (int j = i + 1; j < my_array.length; j++) {
//                if (my_array[i] == my_array[j])
//                    System.out.println(my_array[j]);

//                int[] my_array = {5, 6, 7, 12, -5, 32, 43, 6, 12};
//                for (int i = 0; i < my_array.length - 1; i++) {
//                    for (int j = i + 1; j < my_array.length; j++) {
//                        if ((my_array[i] == my_array[j]) && (i != j)) {
//                            System.out.println(my_array[j]);
//                        }
//                    }
//                }
            }
        }