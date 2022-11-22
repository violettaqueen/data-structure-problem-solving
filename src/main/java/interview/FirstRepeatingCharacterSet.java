package interview;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacterSet {

    public static Character firstRepeatingChar(String str){

        Set<Character> characters = new HashSet<>(); //random

        for (Character ch : str.toCharArray()){
            if (!characters.add(ch)){
                return ch;
            }
        }
        return null;
    }

    public static void main(String[] args) {
         String str = "Java Developer";
        System.out.println(firstRepeatingChar(str));
    }

}
