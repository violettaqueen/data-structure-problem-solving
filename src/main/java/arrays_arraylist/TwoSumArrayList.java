package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumArrayList {
    public static void main(String[] args) {
        int[] numbers = {16,3,11,5, 15}; //8
        //7
        Arrays.sort(numbers); //3, 5, 11, 15, 16 != 8
        //p2    p1
        int target = 8;
        int p1 = 2;
        int p2 = 0;

        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
    public static int[] twoSum(int[] array, int target){

        int p = array.length-1;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= p; i++) {
            if (list.contains(target - array[i])){
                return new int[]{array[i], target- array[i]};
            }
            list.add(array[i]);

        }
        return new int[]{};

    }

}
