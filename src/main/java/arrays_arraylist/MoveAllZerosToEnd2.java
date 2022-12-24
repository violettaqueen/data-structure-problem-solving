package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosToEnd2 {

    public static void main(String[] args) {

        int[] arr = {10, 0, 5, 0, 1, 0};
        System.out.println(Arrays.toString(moveZeros(arr)));
    }

    public static int[] moveZeros(int[] arr) {

        int[] arr2 = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr2[count++] = arr[i];
            }
        }
        return arr2;
    }
}
