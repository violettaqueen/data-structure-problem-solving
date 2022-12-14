package arrays_arraylist;

import java.util.Arrays;

public class ArrayMultiplyPrevAndNext2 {


    public static Integer[] arrayMultiplicationPrevWithNext(Integer[] arr){

        int temp = arr[0]; //2
        int holder;

        for (int i = 0; i < arr.length; i++) {

            if (i == 0){
                arr[i] = arr[i] * arr[i +1];  //2*3
                continue;
            }
            if (i == arr.length-1){
                arr[i] = arr[i] * temp;
                continue;
            }
            holder = arr[i];  // any index
            arr[i] = temp * arr[i+1];
            temp = holder;
        }
        return arr;


    }
}
