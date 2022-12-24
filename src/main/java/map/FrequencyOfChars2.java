package map;

import java.util.*;

public class FrequencyOfChars2 {

    public static void main(String[] args) {

        String str = "bbbcccaaaf";
        System.out.println(frequencyOfChar(str));
        System.out.println(uniqueChar(str));
    }

    public static Map<Character, Integer> frequencyOfChar(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character ch : str.toCharArray()) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }

        return map;
    }
    public static Map<Character, Integer> uniqueChar(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")){
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            if (frequency==1){
                map.put(each.charAt(0), frequency);
            }
        }
        return map;
    }
}
