package leetcode;

import java.util.Arrays;

public class RunningSum2 {

    public static void main(String[] args) {

        int[] nums = {1,3,4,5,9};
        System.out.println(Arrays.toString(runningSum(nums)));

    }

    public static int[] runningSum(int[] nums) {

        int count = nums[0]; //p =1

        for (int i = 1; i < nums.length; i++) {

            count += nums[i];
            nums[i] = count;
        }
        return nums;
    }
}
