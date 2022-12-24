package arrays_arraylist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AddUpSum {

     /*
     given an int[] 'arr' and another int 'sum',
     Write a function which can find a pair of ints in 'arr' that add up to 'sum'.
        Example:
            arr = [8, 7, 2, 5, 3, 1]
            sum = 10
            Output:
                {8=2, 7=3}
     */

    public static void main(String[] args) {

        int[] array = {8, 7, 2, 5, 3, 1};
        int sum = 10;
        System.out.println(twoSum(array, sum));
    }

    public static Map<Integer, Integer> twoSum(int[] array, int sum){

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i ++) {
            for (int k = 1; k < array.length; k++) {
                if (i != k){
                    if (array[i] + array[k] == sum){
                        map.put(array[i], array[k]);
                }

                }
            }
        }
        return map;
    }
}
