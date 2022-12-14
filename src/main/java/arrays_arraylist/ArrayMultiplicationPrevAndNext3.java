package arrays_arraylist;

import java.util.Arrays;

public class ArrayMultiplicationPrevAndNext3 {

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(arrayMultiplicationPrevWithNext(array)));
    }

    public static int[] arrayMultiplicationPrevWithNext(int[] array) {

        int[] arrNew = new int[array.length];

        arrNew[0] = array[0] * array[1];
        arrNew[array.length - 1] = array[array.length - 1] * array[array.length - 2];

        for (int i = 0; i < array.length; i++) {

            if (i == 0 || i == array.length - 1) continue;
            arrNew[i] = array[i - 1] * array[i + 1];
        }
        return arrNew;
    }
}
