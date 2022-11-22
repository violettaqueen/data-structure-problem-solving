package arrays_arraylist;

import java.util.Arrays;

public class CreatingArray {

    public static void main(String[] args) {

        int[] arr = new int[10];

        int[] arr2 = new int[20];

        int[] arr3 = merge(arr,arr2);
        System.out.println(Arrays.toString(arr3));

    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }



}
