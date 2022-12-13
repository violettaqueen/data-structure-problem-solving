package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Anagram {

    public static void main(String[] args) {

        String word1 = "heart";
        String word2 = "earth";
        System.out.println(isAnagram(word1, word2));

// heart - arrayList, earth - stack, compare


    }

    public static boolean isAnagram(String str1, String str2) {

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return false;
    }
}
