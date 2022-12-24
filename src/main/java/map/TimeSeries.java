package map;

import java.util.*;

public class TimeSeries {

    public static void main(String[] args) {

        Map<Integer, Double> a = new HashMap<>();
        a.put(1,1.0);
        a.put(2,1.5);
        a.put(3,2.0);
        
        Map<Integer, Double> b = new HashMap<>();
        b.put(2, 1.0);
        b.put(3, 2.5);
        b.put(5, 1.0);

        System.out.println(timeSeries(a, b));
    }
    public static Map<Integer, Double> timeSeries(Map<Integer,Double> map1, Map<Integer, Double> map2){

        Map<Integer, Double> result = new HashMap<>();
        result.putAll(map1);
        Set<Integer> keys = new HashSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());

        boolean flag = true;
         while (flag){
             map2.keySet().forEach((k) -> {
                 if (result.keySet().contains(k)){
                     result.put(k, result.get(k) + map2.get(k));
                 }else{
                     result.put(k, map2.get(k));
                 }
             });
             if (keys.size() == result.keySet().size()){
                 flag= false;
             }
         }
         return result;
    }
}
  /*
    A time series is represented as a list of time/value pairs. Write a function whose input is two time series and whose output
    is a new time series of the summation of them.
        Example:
            series A: [(1, 1.0), (2, 1.5), (3, 2.0)]
            series B: [(2, 1.0), (3, 2.5), (5, 1.0)]
        Assuming we have '0' for a time pair that's missing, this is the result:
        output:
            [(1, 1.0), (2, 2.5), (3, 4.5), (5, 1.0)]
     */