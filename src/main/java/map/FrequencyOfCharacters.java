package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    /*
    Write a method that prints the frequency of each character from a String
     */

    public static void frequencyOfCharacters(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()){

            if(map.containsKey(each)){   //v i o  l e t t a
                map.put(each,map.get(each) + 1);
            }else{
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {

        String str = "Violetta";
        frequencyOfCharacters(str);
    }
}
