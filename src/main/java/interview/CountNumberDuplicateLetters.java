package interview;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CountNumberDuplicateLetters {

    public static void main(String[] args) {
        String str = "Violettochka";
        System.out.println(countDuplicates(str));

    }

    public static String countDuplicates(String word) {

        int count = 0;
        Set<Character> ninDup = new LinkedHashSet<>();
        String result = "";
        for (Character ch : word.toCharArray()) {
            ninDup.add(ch);
        }
        for (Character each : ninDup){
            result += " "+ each;
        }
        return result;

    }
}
