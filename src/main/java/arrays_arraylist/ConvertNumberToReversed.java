package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ConvertNumberToReversed {

    public static void main(String[] args) {

        int num = 0;
        System.out.println(Arrays.toString(convertNumber(num)));


    }

    public static int[] convertNumber(long num) { //35231


        String temp = Integer.toString((int) num);

        int[] newGuess = new int[temp.length()];

        if (num != 0) {

            for (int i = temp.length() - 1, j = 0; i >= 0; i--, j++) {
                newGuess[j] = temp.charAt(i) - '0';
            }
        } else {
            newGuess[0] = 0;
        }
        return newGuess;
    }
}