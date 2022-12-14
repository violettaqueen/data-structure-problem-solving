package arrays_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayMultiplyPrevAndNext {

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5, 6};

        System.out.println(arrayMultiplicationPrevWithNext(array));


    }
    public static List<Integer> arrayMultiplicationPrevWithNext(int[] arr){

        //list -> add 0 * 1 two pointers ->

        List<Integer> result = new ArrayList<>();

        result.add(arr[0] * arr[1]);

        int prev = 0;
        int next = 2;

        while (next != arr.length-1){
            result.add(arr[prev] * arr[next]);
                prev++;
                next++;
            }
        result.add(arr[next] * arr[prev]);
        result.add(arr[next] * arr[next-1]);

        return result;


    }
}
