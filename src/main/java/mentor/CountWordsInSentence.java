package mentor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordsInSentence {

    //week 34 - return frequency of words in given string
    public static void main(String[] args) {
        String input1 = "This is an example of example";
        String input2 = "\"This\"      is an example!  of Example";
        //System.out.println(frequencyOfWords(input1));
        //System.out.println(frequencyOfWords(input2));
//        String sentence = "This is an example of example";
//        String[] words = sentence.trim().toLowerCase().split("\\W+");
//        System.out.println(Arrays.toString(words));
//        System.out.println(withStreamLong(input1));
//        System.out.println(withStreamLong(input2));
        System.out.println(withStream(input1));
        System.out.println(withStream(input2));
    }

    public static Map<String, Integer> frequencyOfWords(String sentence) {

        if (sentence == null) return null;
        Map<String, Integer> mapOfWords = new HashMap<>(); //space complexity O(n)

        //String[] words = sentence.trim().toLowerCase().split("[^A-zA-z]+");
        //String[] words = sentence.trim().toLowerCase().split("\\W+");
        String[] words = sentence.trim().replaceAll("[^A-Za-z ]+", "").toLowerCase().split(" +");
        for (String word : words) {  //time O(n)
            mapOfWords.put(word, mapOfWords.getOrDefault(word, 0) + 1);
        }
        return mapOfWords;
    }
    public static Map<String, Long> withStreamLong(String str){

        if (str == null) return null;

        return Arrays
                .stream(str.trim().toLowerCase().split("[^A-Za-z]+"))
               // .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
    }
    public static Map<String, Integer> withStream(String str){

        if (str == null) return null;
        return Arrays
                .stream(str.trim().toLowerCase().split("\\W+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(s -> 1)));

    }





}
