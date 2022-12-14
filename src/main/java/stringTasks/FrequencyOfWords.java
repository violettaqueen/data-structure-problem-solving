package stringTasks;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWords {

    public static void main(String[] args) {

        String input = "This is an example of example";
        String input2 = "\"This\" is an example of example";
        System.out.println(frequencyOfWords(input));
        System.out.println(frequencyOfWords2(input2));
    }

    public static Map<String, Integer> frequencyOfWords(String input) {


        Map<String, Integer> frequency = new HashMap<>();
        char[] ch = input.toCharArray();
        String newSentence = "";

        for (int i = 0; i < ch.length; i++) {

            if (!Character.isLetter(ch[i])) {
                ch[i] = ' ';
            }
            newSentence += ("" + ch[i]).toLowerCase();
        }
        String[] newStringArray = newSentence.split(" ");

        for (String each : newStringArray) {
            if (!each.isBlank()) {
                frequency.put(each, (frequency.getOrDefault(each, 0) + 1));
            }
        }
        return frequency;

    }

    public static Map<String, Integer> frequencyOfWords2(String str) {

        str = str.toLowerCase();
        String[] array = str.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String each : array) {

            String temp = "";

            for (int i = 0; i < each.length(); i++) {  //this

                if (Character.isLetter(each.charAt(i))) temp += each.charAt(i);
            }
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else if (!temp.equals("")) {
                map.put(temp, 1);
            }
        }
        return map;
    }
}