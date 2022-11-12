package tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    public static void main(String[] args) {

        int[] arr = new int[]{2,7,9,11};
        System.out.println(Arrays.toString(twoSumSolution1(arr, 9)));

        System.out.println(Arrays.toString(twoSumSolution2(arr, 9)));


    }

    public static int[] twoSumSolution1(int[] array, int targetValue) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (i != j) {
                    if (array[i] + array[j] == targetValue) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSumSolution2(int[] nums, int target) {

        //create hashmap
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int potentialMatch = target - nums[i];
            if (map.containsKey(potentialMatch)) {
                return new int[]{i, map.get(potentialMatch)};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

}
