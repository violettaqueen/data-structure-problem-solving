package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public static int missingNumber(int[] array){

        Set<Integer> set = new HashSet<>();

        for (int i : array) {
            set.add(i);
        }
        for (int i = 0; i <= array.length ; i++) {
            if (!set.contains(i)){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int[]arr = {3,0,1};
        System.out.println(missingNumber(arr));

    }



}
