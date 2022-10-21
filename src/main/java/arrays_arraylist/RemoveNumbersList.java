package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNumbersList {

     /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    //Solution 1
    public static List<Integer> removeNumbers(List<Integer> numbers){
        numbers.removeIf(number -> number > 100);

        return numbers;
    }
    //Solution 2
    public static List<Integer> removeNumbers2(List<Integer> numbers){

        Iterator<Integer> it = numbers.iterator();

        while(it.hasNext()){
            if (it.next()>100){
                it.remove();
            }
        }
        return numbers;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,34,145,675,234,5));
        System.out.println(removeNumbers(numbers));
        System.out.println(removeNumbers2(numbers));
    }



}
