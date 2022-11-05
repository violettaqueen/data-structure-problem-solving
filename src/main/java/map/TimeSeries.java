package map;

import java.util.HashMap;
import java.util.Map;

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
        
        
    }
    public static Map<Integer, Double> timeSeries(Map<Integer,Double> a, Map<Integer, Double> b){
        
        Map<Integer, Double> c = new HashMap<>();

        // put all in one map
        c.putAll(a);
        c.putAll(b);

        
        return c;
    }
}
