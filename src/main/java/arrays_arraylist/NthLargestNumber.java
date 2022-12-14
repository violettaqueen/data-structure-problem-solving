package arrays_arraylist;

import java.util.*;

public class NthLargestNumber {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,5,6,3,8,6,4,9,8,5,7,3,9,8,9));

        int n = 4;

        for (int i = 0; i < n-1; i++) {
            list.removeIf(p -> Collections.max(list) == p);
        }
        int max = Collections.max(list);
        System.out.println(max);

        List<String> list1 = new ArrayList<>(Arrays.asList("kayak", "anna", "violetta"));
        Iterator<String> it = list1.iterator();

        while (it.hasNext()){
            String each = it.next();

            String reverse = "";
            for (int i = each.length()-1; i >= 0 ; i--) {
                reverse += each.charAt(i);
            }
            if (each.equals(reverse)) {
                it.remove();
            }
        }
        System.out.println(list1);


    }

}
