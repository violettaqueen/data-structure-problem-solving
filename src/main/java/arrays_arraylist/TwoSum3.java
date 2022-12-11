package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum3 {

    public static void main(String[] args) {

        int[] array = {4, 3, 11, 5, 15};
        int target = 7;
        System.out.println(Arrays.toString(twoSum3Solution(array, target)));
    }
    public static int[] twoSum3Solution(int[]array, int target){

        int pointer = array.length-1;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= pointer ; i++) {
            if (list.contains(target - array[i])) return new int[]{target-array[i], array[i]};
        else list.add(array[i]);
        }

        return new int[]{};
    }


}
