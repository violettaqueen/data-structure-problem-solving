package arrays_arraylist;

import java.util.Arrays;

public class TwoSumTwoPointer2 {

    public static void main(String[] args) {

        int[] array = {16,3,11,5, 15}; //8
        //7
        Arrays.sort(array); //3, 5, 11, 15, 16 != 8
        //p2    p1
        int target = 8;
        int p1 = 2;
        int p2 = 0;

        System.out.println(Arrays.toString(twoSum(array, target)));
    }
    public static int[] twoSum(int[] array, int target){

        Arrays.sort(array);
        int p1 = 0;              //first index
        int p2 = array.length-1; //last index

        while (array[p2] > target){
            p2--;

            if (array[p1] + array[p2] == target){
                return new int[]{array[p1], array[p2]};
            }
        }

       return new int[]{};
    }



}
