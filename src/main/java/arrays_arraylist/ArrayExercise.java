package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExercise {

    public static void arrayToUpperCase(String[] array){

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
        System.out.println(Arrays.toString(array));
    }
    public static void incrementArray(int[]array){

        //increment each element in the array by 1
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        String[] array = new String[]{"Violetta", "Lizzy"};
        arrayToUpperCase(array);

        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        System.out.println("********************************");
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        boolean rest = list.retainAll(Arrays.asList(1));
        System.out.println(rest);


        //incrementArray(nums);

    }


}
