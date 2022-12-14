package arrays_arraylist;

import java.util.Arrays;

public class TwoSumTwoPointer {

    public static void main(String[] args) {

        int[] numbers = {16,3,11,5, 15}; //8
                                   //7
        Arrays.sort(numbers); //3, 5, 11, 15, 16 != 8
                              //p2    p1
        int target = 8;
        int p1 = 2;
        int p2 = 0;

        System.out.println(Arrays.toString(twoSum(numbers, target)));


    }
    public static int[] twoSum(int[] numbers, int target){

        Arrays.sort(numbers);
        int p1 = 2;
        int p2 = 0;

        while (numbers[p1] + numbers[p2] != target){ //run this loop until p1 + p2 != 8

            if (numbers[p1] + numbers[p2] < target){
                p1 ++;
            } else if (numbers[p1] + numbers[p2] > target) {
                p1--;
            }
            if (numbers[p1] + numbers[p2] != target){
                p2++;
            }
            return new int[] {numbers[p1], numbers[p2]};

        }
        return new int[]{};
    }


}
