package arrays_arraylist;

import java.util.*;

public class HashSetToArrayListConvert {

    public static void main(String[] args) {

        Collection<Integer> collection = new HashSet<>();
        collection.addAll(Arrays.asList(12,21,32,54,65,65,64,6,5));
        System.out.println(collection);
        System.out.println(new ArrayList<>(collection).get(0));
        List<Integer> list = new ArrayList<>(collection);



    }
}
