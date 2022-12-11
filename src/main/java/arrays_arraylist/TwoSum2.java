package arrays_arraylist;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] array = {4, 3, 11, 5, 15};
        int target = 7;
        System.out.println(Arrays.toString(twoSum2Solution(array, target)));
    }

    public static int[] twoSum2Solution(int[] array, int target) {

        Arrays.sort(array);
        int pointer1 = 0;
        int pointer2 = array.length-1;

        while (array[pointer2]> target) pointer2--;

        for (int i = 0; i <= pointer2; i++) {

            if (array[pointer1] + array[pointer2] == target) {
                return new int[]{array[pointer1], array[pointer2]};
            }
        }
        return new int[]{};

    }



    }



