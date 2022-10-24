package map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortByValues {

    /*
        Write a method that can sort the map by values
     */

    public static Map<String, Integer> sortByValues(Map<String, Integer> map){

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list){
            map.put(each.getKey(), each.getValue());
        }

        return map;
    }

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Violetta", 1);
        map.put("Elizabeth", 2);
        map.put("Jon", 3);

        System.out.println(sortByValues(map));
    }


}
