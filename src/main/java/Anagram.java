import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean isAnagram(String s, String t){

        if (s.length() != t.length()){
            return false;
        }
        int[] counts = new int[26]; //count each unique char, because only lowercase
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) -'a']++;
            counts[t.charAt(i) -'a']--;
        }
       for (int each : counts){
           if (each != 0){
               return false;
           }
       }
       return true;
    }

//    public boolean isAnagram2(String s, String t){
//
//        if (s.length() != t.length()){
//            return  false;
//        }
//        Map<Character, Integer> map = new HashMap<>();
//
//
//
//
//    }
}
