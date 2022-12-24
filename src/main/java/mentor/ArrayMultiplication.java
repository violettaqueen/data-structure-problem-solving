package mentor;

import java.util.Arrays;

public class ArrayMultiplication {

    public static void main(String[] args) {
         int[] arr = {2,3,4,5,6};
        System.out.println(Arrays.toString(multiplyArray(arr)));
    }
    public static int[] multiplyArray(int[]arr){

        if (arr == null) return null;
        int n = arr.length;               //5
        if(n == 1){
            return arr;                   //length should be more than 1
        }
        int [] arr2 = new int[n]; //new array
        arr2[0] = arr[0] * arr[1];
        arr2[n-1] = arr[n-2] * arr[n-1];

        for (int i = 1; i < n-1 ; i++) {   //0(n)
            arr2[i] = arr[i-1] * arr[i+1];
        }
        return arr2;
    }
}
