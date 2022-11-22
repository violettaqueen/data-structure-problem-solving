package java1;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumNumberArray {

    public static void main(String[] args) {

        int[] array = {100, 350, 4, 34, 90};

        int max = array[0]; // assume number at index 0 is max

        for (int i = 1; i < array.length; i++) {  // loop from index 1
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);

        System.out.println(printNumbers(array));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }
    public static int[] printNumbers(int[]array){

        for (int i = 0,j = 1; i < array.length; i++, i++) {
            array[i] = j;
        }

        return array;
    }


}
