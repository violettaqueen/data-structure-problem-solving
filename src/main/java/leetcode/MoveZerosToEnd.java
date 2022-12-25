package leetcode;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int[] nums = {1,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZerosToEnd(nums)));
    }

    public static int[] moveZerosToEnd(int[] nums){

        int p = 0;

        for (int i = 0; i < nums.length; i++) {
             if (nums[i] != 0){
                 int temp = nums[p];
                 nums[p] = nums[i];
                 nums[i] = temp;
                 p++;
             }
        }
        return nums;

    }



}
