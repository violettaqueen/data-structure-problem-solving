package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromeStringsList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("racecar","kayak", "level", "violetta"));
        System.out.println(removePalindromes(list));
        System.out.println(removePalindromes2(list));

    }
    // solution 1
    public static List<String> removePalindromes(List<String> words){

        Iterator<String> it = words.iterator();
        while (it.hasNext()){
            String word = it.next();
            String reversed = "";
            for (int i = word.length()-1; i >= 0 ; i--) {
                reversed += word.charAt(i);
            }
            if (word.equalsIgnoreCase(reversed)){
                it.remove();
            }
        }

        return words;
    }
    // solution 2
    public static List<String> removePalindromes2(List<String> words){
        words.removeIf(word -> isPalindrome(word));
                return words;
    }
    public static boolean isPalindrome(String word){

        String reversed = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed += word.charAt(i);
        }
        return reversed.equalsIgnoreCase(word);
    }
}
