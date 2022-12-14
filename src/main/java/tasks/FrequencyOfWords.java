package tasks;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWords {

    public static void main(String[] args) {

        String str = "This is an example of example";
        System.out.println(frequencyOfWords(str));
    }

    public static Map<String, Integer> frequencyOfWords(String sentence) {

        String[] array = sentence.split(" ");
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        String sameWord = "";
        for (int i = 0, j = array.length-1; i < array.length && j>= 0;) {

            map.put(array[i].toLowerCase(), count + 1);
            if (map.containsKey(array[i])){
                if (array[j] == array[i]){
                     sameWord = array[j];
                }
            }
            if (array[i].equals(sameWord)) {
                count++;
            }
        }
        return map;
    }
}
