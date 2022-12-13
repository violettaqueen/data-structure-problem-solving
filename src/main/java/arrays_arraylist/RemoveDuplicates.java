package arrays_arraylist;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String[] array = {"Java", "Python", "Java", "Python", "C++", "Ruby"};

        Set<String> set = new HashSet<>();

        for (String each : array) {
            set.addAll(Arrays.asList(each));
        }
        System.out.println(set);

        System.out.println(new ArrayList<>(set).get(1));
        System.out.println("***************************");


        String[] words = set.toArray(new String[0]);
        System.out.println(Arrays.toString(words));

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 5, 7, 3, 3, 6, 3, 8));

        Set<Integer> nums = new TreeSet<>();
        for (Integer number : numbers) {
            nums.addAll(Arrays.asList(number));
        }
        //System.out.println(nums);
    }


}
