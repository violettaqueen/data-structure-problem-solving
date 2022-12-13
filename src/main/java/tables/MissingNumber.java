package tables;

import java.util.Arrays;

public class MissingNumber {

    public static int findMissingNumberArray(int[] array) {


        for (int i = 0; i < array.length; i++) {
            if (array[i] != i) {
                return i;
            }
            return array.length;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 0, 1};
        System.out.println(findMissingNumberArray(array));
    }
}
