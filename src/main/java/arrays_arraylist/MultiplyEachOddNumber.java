package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyEachOddNumber {

    /*
    write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]
     */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(multiply(arr)));

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(multiply(nums));

    }

    public static int[] multiply(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }

    public static List<Integer> multiply(List<Integer> nums) {

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) %2 !=0) nums.set(i, nums.get(i) * 2);
        }
        return nums;
    }

    public static List<Integer> multiply2(List<Integer> nums) {

        return nums.stream().map(num -> {

            if (num %2 != 0 ) num *= 2;

            return num;

        }).collect(Collectors.toList());

    }
}