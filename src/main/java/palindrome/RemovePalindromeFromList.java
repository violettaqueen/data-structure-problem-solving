package palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromeFromList {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("racecar","level", "violetta"));
        System.out.println(removePalindrome(words));
    }
    public static List<String> removePalindrome(List<String> words){

       Iterator<String> it = words.iterator();

       while (it.hasNext()){
           String word = it.next();
           String reverse = "";
           for (int i = word.length()-1; i >= 0 ; i--) {
               reverse += word.charAt(i);
           }
           if (word.equalsIgnoreCase(reverse)){
               it.remove();
           }
       }
       return words;
    }
}
