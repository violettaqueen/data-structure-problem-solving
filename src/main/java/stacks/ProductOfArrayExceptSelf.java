package stacks;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};  //[24,12,8,6]
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }
    public static int[] productExceptSelf(int[] nums){

        // O(n) linear
        int N = nums.length;

        int[] left_Product = new int[N];
        int[] right_Product = new int[N];
        int[] output = new int[N];

        left_Product[0] =1;
        right_Product[N-1] =1;

        for (int i = 1; i < N; i++) {
            left_Product[i] = nums[i-1] * left_Product[i-1];
        }
        for (int i = N-2; i >=0; i--) {
            right_Product[i] = nums[i+1] * right_Product[i+1];
        }
        for (int i = 0; i < N; i++) {
            output[i] = left_Product[i] * right_Product[i];
        }
        return output;


    }
}
