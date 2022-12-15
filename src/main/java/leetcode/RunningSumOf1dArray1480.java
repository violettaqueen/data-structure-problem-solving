package leetcode;

import java.util.Arrays;

public class RunningSumOf1dArray1480 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1};
        System.out.println(Arrays.toString(runningSum(arr)));

    }

    public static int[] runningSum(int[] arr) { //

        int[] arr2 = new int[arr.length];

        arr2[0] = arr[0]; //{1    }

        for (int i = 1; i < arr.length; i++) {

            arr2[i] = arr2[i-1] + arr[i];
        }
        return arr2;
    }


}
