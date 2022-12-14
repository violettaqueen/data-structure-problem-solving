package arrays_arraylist;

import java.util.*;

public class TwoSumOptimal {

    public static void main(String[] args) {

        int[] nums = new int[]{16,3,11,5,15};
        int target = 8;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int potentialMatch = target - nums[i];
            if (myMap.containsKey(potentialMatch)){
                return new int[]{i, myMap.get(potentialMatch)};
            }else {
                myMap.put(nums[i], i);
            }
        }

        return new int[]{};
    }



}
