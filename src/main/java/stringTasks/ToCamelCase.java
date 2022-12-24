package stringTasks;

import java.util.Arrays;

public class ToCamelCase {

    public static void main(String[] args) {


        String sentence = "The-stealth-warrior";
        System.out.println(convertToCamelCase(sentence));

//        String[] str = sentence.split("_");
//        System.out.println(Arrays.toString(str));
    }

    public static String convertToCamelCase(String s) {

        String result = "";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (!Character.isLetter(ch[i])) {
                s.split("");
            }
            result += ("" + ch[i]);
        }
        //String[] newStringArray = result.split("");
        return result;

    }



    public static String toCamelCase(String s) {


        String result = "";
        String[] word = s.split("[-_]+");

        for (String eachWord : word) {

            for (int i = 0; i < eachWord.length(); i++) {
                char ch = eachWord.charAt(i);

                if (eachWord.charAt(i) == eachWord.charAt(0)) {
                    eachWord = eachWord.substring(0, 1).toUpperCase() + eachWord.substring(1).toLowerCase();
                    result += eachWord;
                }
                result = result.substring(0, 1).toLowerCase() + result.substring(1);
            }
        }
        return result;

    }
}