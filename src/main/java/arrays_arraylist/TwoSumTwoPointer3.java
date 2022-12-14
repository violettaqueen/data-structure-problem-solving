package arrays_arraylist;

import java.util.Arrays;

public class TwoSumTwoPointer3 {
    public static void main(String[] args) {


        int[] array = {16, 3, 10, 5, 15}; //8
        //7
        Arrays.sort(array); //3, 5, 11, 15, 16 != 8
        //p2    p1
        int target = 15;
        int p1 = 2;
        int p2 = 0;

        System.out.println(Arrays.toString(twoSumTwoPointer(array, target)));


    }
    public static int[] twoSumTwoPointer(int[] array, int target){

        for (int i = 0, j = array.length-1; i < array.length && j >= 0;) {

            int total = array[i] + array[j];

            if (total == target){
                return new int[]{array[i], array[j]};
            }
            if (total > target) j--;
            else i++;
        }
        return new int[]{};



    }


}
