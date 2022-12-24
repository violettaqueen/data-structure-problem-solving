package mentor;

import java.util.Arrays;

public class ArrayMultiplicationWithPointer {

    public static void main(String[] args) {

        int[] arr = {2,3,4,5};
        System.out.println(Arrays.toString(arrayMultiplyWithPointer(arr)));
    }
    public static int[] arrayMultiplyWithPointer(int[] arr){

        if (arr.length <= 1) return arr;
        int pointer = 1;

        for (int i = 0; i < arr.length; i++) {

            if (i == 0){
                pointer = arr[i]; //0
                arr[i] = arr[i] * arr[i+1];
            } else if (i == arr.length-1) {
                arr[i] = pointer * arr[i];
            }else{
                int temp = arr[i];
                arr[i] = pointer * arr[i +1];
                pointer = temp;
            }
        }
        return arr;

    }
}
