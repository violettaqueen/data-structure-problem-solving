package stringTasks;

import java.util.Arrays;

public class ToCamelCase {

    public static void main(String[] args) {


        String sentence = "the-stealth-warrior";
        System.out.println(convertToCamelCase(sentence));

//        String[] str = sentence.split("_");
//        System.out.println(Arrays.toString(str));
    }

    public static String convertToCamelCase(String str) {

        String result = "";

        String[] word = str.split("[-_]+");
        for(String eachWord : word){

        }
        return result;
    }


}
