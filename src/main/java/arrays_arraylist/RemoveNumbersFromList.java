package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNumbersFromList {

    public static void main(String[] args) {

         /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,101,180));
//        list.removeIf(n -> n > 100);
//        System.out.println(list);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if ( it.next() > 100){
                it.remove();
            }
        }
        System.out.println(list);



    }




}
